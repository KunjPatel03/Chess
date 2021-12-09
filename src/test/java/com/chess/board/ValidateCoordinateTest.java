package com.chess.board;

import com.chess.board.interfaces.IBoardFactory;
import org.junit.Assert;
import org.junit.Test;

import static com.chess.board.Utilites.*;

/**
 * @author Kunj Vijaykumar Patel
 */

public class ValidateCoordinateTest {

    @Test
    public void isCoordinateValidTest() {
        IBoardFactory boardFactory =new BoardFactory();
        Assert.assertTrue(boardFactory.createValidateCoordinate().isCoordinateValid(boardFactory.createCoordinates(TWO,SEVEN)));
    }

    @Test
    public void isCoordinateNotValidTest() {
        IBoardFactory boardFactory =new BoardFactory();
        Assert.assertFalse(boardFactory.createValidateCoordinate().isCoordinateValid(boardFactory.createCoordinates(TWO,TEN)));
    }

    @Test
    public void validateCoordinateClassNotNullTest(){
        IBoardFactory boardFactory =new BoardFactory();
        Assert.assertNotNull(boardFactory.createValidateCoordinate());
    }
}