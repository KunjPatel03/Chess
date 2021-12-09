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
        IBoardFactory boardFactory =new BoardFactory();
        Assert.assertNotNull(boardFactory.createInitBoard().initializeNewBoard(boardFactory.createSqureBoxes(EIGHT)));
    }

    @Test
    public void initializeWhitePiecesTest() {
        IBoardFactory boardFactory =new BoardFactory();
        ISquareBox[][] squareBoxes = boardFactory.createInitBoard().initializeNewBoard(boardFactory.createSqureBoxes(EIGHT));
        Assert.assertNotNull(boardFactory.createInitBoard().initializeBlackPieces(squareBoxes));
    }

    @Test
    public void initializeBlackPiecesTest() {
        IBoardFactory boardFactory =new BoardFactory();
        ISquareBox[][] squareBoxes = boardFactory.createInitBoard().initializeNewBoard(boardFactory.createSqureBoxes(EIGHT));
        Assert.assertNotNull(boardFactory.createInitBoard().initializeWhitePieces(squareBoxes));
    }

    @Test
    public void initBoardClassNotNullTest(){
        IBoardFactory boardFactory =new BoardFactory();
        Assert.assertNotNull(boardFactory.createInitBoard());
    }
}