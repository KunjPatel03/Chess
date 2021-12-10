package com.chess.board;

import com.chess.board.interfaces.IBoardFactory;
import com.chess.board.interfaces.IChessBoard;
import com.chess.board.interfaces.ICoordinates;
import com.chess.board.interfaces.ISquareBox;
import com.chess.piece.interfaces.IPiece;

import static com.chess.board.Utilites.EIGHT;
import static com.chess.board.Utilites.ZERO;
import static com.chess.board.Utilites.SEVEN;
import static com.chess.board.Utilites.WRONG_INPUT;

/**
 * @author Kunj Vijaykumar Patel
 */

public class ChessBoard implements IChessBoard {

    private IBoardFactory boardFactory;
    private ISquareBox[][] squareBoxes;

    public ChessBoard() {
        this.boardFactory = new BoardFactory();
        this.squareBoxes = boardFactory.createSqureBoxes(EIGHT);
    }

    @Override
    public ISquareBox getSqureBox(int x, int y, ISquareBox[][] squareBoxes) {
        try {
            if (x < ZERO || x > SEVEN || y < ZERO || y > SEVEN) {
                throw new Exception(WRONG_INPUT);
            }
        } catch (Exception exception) {
            boardFactory.createShowBoardDisplay().displayMessage(exception.getMessage());
        }
        return squareBoxes[x][y];
    }

    @Override
    public ISquareBox[][] initializeBoard() {
        squareBoxes = boardFactory.createInitBoard().initializeNewBoard(squareBoxes);
        return squareBoxes;
    }

    @Override
    public ISquareBox[][] setPieceOnBoard(ICoordinates coordinates, IPiece piece, ISquareBox[][] squareBoxes) throws Exception {
        getSqureBox(coordinates.getCoordinateX(), coordinates.getCoordinateY(),squareBoxes).setPiece(piece);
        return squareBoxes;
    }

    @Override
    public ISquareBox[][] updateBoard(ICoordinates currentPosition, ICoordinates nextPosition, ISquareBox[][] squareBoxes) throws Exception {
        setPieceOnBoard(nextPosition,getSqureBox(currentPosition.getCoordinateX(),currentPosition.getCoordinateY(),squareBoxes).getPiece(),squareBoxes);
        getSqureBox(currentPosition.getCoordinateX(), currentPosition.getCoordinateY(),squareBoxes).setPiece(null);
        return squareBoxes;
    }

}