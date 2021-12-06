package com.chess.board;

import com.chess.board.interfaces.IBoardFactory;
import com.chess.board.interfaces.IChessBoard;
import com.chess.board.interfaces.ISquareBox;

/**
 * @author Kunj Vijaykumar Patel
 */

public class ChessBoard implements IChessBoard {

    private IBoardFactory iBoardFactory = new BoardFactory();
    private ISquareBox[][] iSquareBoxes;


    public ChessBoard(){

    }

    public ISquareBox getSqure(int x, int y) throws Exception {

        if (x < 0 || x > 7 || y < 0 || y > 7) {
            throw new Exception("Index out of bound");
        }

        return iSquareBoxesss[x][y];
    }

}
