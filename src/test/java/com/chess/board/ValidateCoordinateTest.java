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
        IBoardFactory iBoardFactory =new BoardFactory();
        Assert.assertTrue(iBoardFactory.createValidateCoordinate().isCoordinateValid(iBoardFactory.createCoordinates(TWO,SEVEN)));
    }

    @Test
    public void isCoordinateNotValidTest() {
        IBoardFactory iBoardFactory =new BoardFactory();
        Assert.assertFalse(iBoardFactory.createValidateCoordinate().isCoordinateValid(iBoardFactory.createCoordinates(TWO,TEN)));
    }
}