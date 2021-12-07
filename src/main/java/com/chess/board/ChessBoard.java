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

    public ISquareBox getSqureBox(int x, int y) throws Exception {
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

    }

    @Override
    public void setPieceOnBoard(ICoordinates iCoordinates, IPiece iPiece) throws Exception {
        getSqureBox(iCoordinates.getCoordinateX(),iCoordinates.getCoordinateY()).setPiece(iPiece);
    }

    public void printChessBoard(){
        for (int xCord =0; xCord<8; xCord++){
            for(int yCord=0; yCord<8; yCord++)
            {
                System.out.print(iSquareBoxes[xCord][yCord].getPiece().getPieceName()+" ");
            }
            System.out.print('\n');
        }
    }

}
