package com.chess.moves;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MovesTest {
    Moves move = new Moves();
    @Test
    public void inputToRowTest() {
        Assert.assertEquals(0, move.inputToRow("A8"));
    }

    @Test
    public void inputToColTest()
    {
        Assert.assertEquals(2, move.inputToCol("C7"));
    }

}