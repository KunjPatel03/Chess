package com.chess.piece;

import com.chess.piece.interfaces.IPieceFactory;
import org.junit.Assert;
import org.junit.Test;

import static com.chess.piece.Utility.TRUE;

/**
 * @author Sanjuna Konda
 */

public class PieceExistenceTest {
    IPieceFactory pieceFactory = new PieceFactory();


    @Test
    public void testPieceExistenceNotNull() {
        Assert.assertNotNull(pieceFactory.createPieceExistence(TRUE));
    }

    @Test
    public void testPieceExistenceAvailability() {
        Assert.assertEquals(TRUE, pieceFactory.createPieceExistence(true).isExists());
    }
}
