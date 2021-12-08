package com.chess.board;

import com.chess.board.interfaces.IBoardFactory;
import com.chess.board.interfaces.IChessBoard;
import com.chess.board.interfaces.ISquareBox;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Kunj Vijaykumar Patel
 */
public class ChessBoardTest {

    @Test(expected = Exception.class)
    public void getSqureBoxCheckExceptionTest() throws Exception {
        IBoardFactory iBoardFactory =new BoardFactory();
        IChessBoard iChessBoard= iBoardFactory.createChessboard();

        ISquareBox iSquareBox = iChessBoard.getSqureBox(8,7);
    }

    @Test
    public void getSqureBoxTest() throws Exception {
        IBoardFactory iBoardFactory =new BoardFactory();
        IChessBoard iChessBoard= iBoardFactory.createChessboard();
        ISquareBox iSquareBox = null;
        Assert.assertEquals(iSquareBox,iChessBoard.getSqureBox(2,3));
    }
}