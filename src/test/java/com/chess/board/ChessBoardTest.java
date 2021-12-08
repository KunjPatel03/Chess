package com.chess.board;

import com.chess.board.interfaces.IBoardFactory;
import com.chess.board.interfaces.IChessBoard;
import com.chess.board.interfaces.ISquareBox;
import org.junit.Assert;
import org.junit.Test;

import static com.chess.board.Utilites.*;

/**
 * @author Kunj Vijaykumar Patel
 */
public class ChessBoardTest {

    @Test(expected = Exception.class)
    public void getSqureBoxCheckExceptionTest() throws Exception {
        IBoardFactory boardFactory =new BoardFactory();
        IChessBoard iChessBoard= boardFactory.createChessboard();
        iChessBoard.getSqureBox(EIGHT,SEVEN);
    }

    @Test
    public void getSqureBoxTest() throws Exception {
        IBoardFactory boardFactory =new BoardFactory();
        IChessBoard iChessBoard= boardFactory.createChessboard();
        ISquareBox iSquareBox = null;
        Assert.assertEquals(iSquareBox,iChessBoard.getSqureBox(TWO,THREE));
    }

    @Test
    public void chessBoardClassNotNull(){
        IBoardFactory boardFactory =new BoardFactory();
        Assert.assertNotNull(boardFactory.createChessboard());
    }
}