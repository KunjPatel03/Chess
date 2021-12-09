package com.chess.board;

import com.chess.board.interfaces.IBoardFactory;
import com.chess.board.interfaces.IChessBoard;
import com.chess.board.interfaces.ICoordinates;
import com.chess.board.interfaces.ISquareBox;
import com.chess.piece.interfaces.IPiece;

import static com.chess.board.Utilites.*;

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
    public ISquareBox getSqureBox(int x, int y) {
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
    public void setPieceOnBoard(ICoordinates coordinates, IPiece piece) {
        getSqureBox(coordinates.getCoordinateX(), coordinates.getCoordinateY()).setPiece(piece);
    }


}
