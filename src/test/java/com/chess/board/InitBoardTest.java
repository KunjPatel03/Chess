package com.chess.board;

import com.chess.board.interfaces.IBoardFactory;
import com.chess.board.interfaces.IChessBoard;
import com.chess.board.interfaces.ISquareBox;
import org.junit.Assert;
import org.junit.Test;

import static com.chess.board.Utilites.*;
import static org.junit.Assert.*;

/**
 * @author Kunj Vijaykumar Patel
 */
public class InitBoardTest {

    @Test
    public void initializeNewBoardTest() {
        IBoardFactory iBoardFactory =new BoardFactory();
        Assert.assertNotNull(iBoardFactory.createInitBoard().initializeNewBoard(iBoardFactory.createSqureBoxes(EIGHT)));
    }

    @Test
    public void initializeWhitePiecesTest() {
        IBoardFactory iBoardFactory =new BoardFactory();
        ISquareBox[][] iSquareBoxes = iBoardFactory.createInitBoard().initializeNewBoard(iBoardFactory.createSqureBoxes(EIGHT));
        Assert.assertNotNull(iBoardFactory.createInitBoard().initializeBlackPieces(iSquareBoxes));
    }

    @Test
    public void initializeBlackPiecesTest() {
        IBoardFactory iBoardFactory =new BoardFactory();
        ISquareBox[][] iSquareBoxes = iBoardFactory.createInitBoard().initializeNewBoard(iBoardFactory.createSqureBoxes(EIGHT));
        Assert.assertNotNull(iBoardFactory.createInitBoard().initializeWhitePieces(iSquareBoxes));
    }
}