package com.chess.moves;

import com.chess.moves.interfaces.IMoves;
import org.junit.Assert;
import org.junit.Test;

import static com.chess.Utilites.*;

/**
 * @author Het Ketanbhai Shah
 */

public class MovesTest {
    IMoves move = new Moves();

    @Test
    public void inputToRowTest() {
        Assert.assertEquals(ZERO, move.inputToRow(MOVE_ONE));
    }

    @Test
    public void inputToColTest() {
        Assert.assertEquals(TWO, move.inputToCol(MOVE_TWO));
    }

}
