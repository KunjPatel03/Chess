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
    public void getSqureBoxCheckWhitePieceTest() throws Exception {
        IBoardFactory boardFactory =new BoardFactory();
        IChessBoard chessboard= boardFactory.createChessboard();
        ISquareBox squareBox[][] = chessboard.initializeBoard();
        Assert.assertEquals(squareBox[ZERO][ZERO],chessboard.getSqureBox(ZERO,ZERO));
    }

    @Test
    public void getSqureBoxCheckBlackPieceTest() throws Exception {
        IBoardFactory boardFactory =new BoardFactory();
        IChessBoard chessboard= boardFactory.createChessboard();
        ISquareBox squareBox[][] = chessboard.initializeBoard();
        Assert.assertEquals(squareBox[SEVEN][SEVEN],chessboard.getSqureBox(SEVEN,SEVEN));
    }

    @Test
    public void getSqureBoxCheckEmptySqureTest() throws Exception {
        IBoardFactory boardFactory =new BoardFactory();
        IChessBoard chessboard= boardFactory.createChessboard();
        ISquareBox squareBox[][] = chessboard.initializeBoard();
        Assert.assertEquals(squareBox[FIVE][FIVE],chessboard.getSqureBox(FIVE,FIVE));
    }

    @Test
    public void chessBoardClassNotNull(){
        IBoardFactory boardFactory =new BoardFactory();
        Assert.assertNotNull(boardFactory.createChessboard());
    }
}