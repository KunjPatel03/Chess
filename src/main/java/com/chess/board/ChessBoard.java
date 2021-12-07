package com.chess.board;

import com.chess.board.interfaces.IBoardFactory;
import com.chess.board.interfaces.IChessBoard;
import com.chess.board.interfaces.ICoordinates;
import com.chess.board.interfaces.ISquareBox;
import com.chess.piece.interfaces.IPiece;

/**
 * @author Kunj Vijaykumar Patel
 */

public class ChessBoard implements IChessBoard {

    private IBoardFactory iBoardFactory = new BoardFactory();
    private ISquareBox[][] iSquareBoxes;


    public ChessBoard(){

    }

    @Override
    public ISquareBox getSqureBox(int x, int y) {
        try{
            if (x < 0 || x > 7 || y < 0 || y > 7) {
                throw new Exception("Wrong input");
            }
        }catch (Exception exception){
                System.out.println(exception);
        }
        return iSquareBoxes[x][y];
    }

    public void initializeBoard(){

        iSquareBoxes=iBoardFactory.createInitBoard().initializeNewBoard(iSquareBoxes);

    }

    public void initializeWhitePiece(){

    }

    public void initializeBlackPiece(){

    }
    @Override
    public void setPieceOnBoard(ICoordinates iCoordinates, IPiece iPiece) throws Exception {
        getSqureBox(iCoordinates.getCoordinateX(),iCoordinates.getCoordinateY()).setPiece(iPiece);
    }

    public void printChessBoard(){
        iBoardFactory.createShowBoard().displayBoard(iSquareBoxes);
    }

}
