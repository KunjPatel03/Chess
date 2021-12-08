package com.chess.board;

import com.chess.board.interfaces.IBoardFactory;
import com.chess.board.interfaces.IChessBoard;
import com.chess.board.interfaces.ICoordinates;
import com.chess.board.interfaces.ISquareBox;
import com.chess.piece.interfaces.IPiece;
import static com.chess.board.Utilites.ZERO;
import static com.chess.board.Utilites.SEVEN;
import static com.chess.board.Utilites.EIGHT;

/**
 * @author Kunj Vijaykumar Patel
 */

public class ChessBoard implements IChessBoard {

    private IBoardFactory iBoardFactory;
    private ISquareBox[][] iSquareBoxes;

    public ChessBoard() {
        this.iBoardFactory=new BoardFactory();
        this.iSquareBoxes = iBoardFactory.createSqureBoxes(EIGHT);
    }

    @Override
    public ISquareBox getSqureBox(int x, int y) {
        try {
            if (x < ZERO || x > SEVEN || y < ZERO || y > SEVEN) {
                throw new Exception("Wrong input");
            }
        } catch (Exception exception) {
            System.out.println(exception);
        }
        return iSquareBoxes[x][y];
    }

    @Override
    public ISquareBox[][] initializeBoard() {

        iSquareBoxes = iBoardFactory.createInitBoard().initializeNewBoard(iSquareBoxes);
        return iSquareBoxes;
    }

    @Override
    public void setPieceOnBoard(ICoordinates iCoordinates, IPiece iPiece) {
        getSqureBox(iCoordinates.getCoordinateX(), iCoordinates.getCoordinateY()).setPiece(iPiece);
    }

    public void printChessBoard() {
        iBoardFactory.createShowBoard().displayBoard(iSquareBoxes);

    }

}
