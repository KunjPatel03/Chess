package com.chess.piece;

import com.chess.piece.interfaces.IPieceFactory;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author Sanjuna Konda
 */

public class PieceExistenceTest {
    IPieceFactory pieceFactory = new PieceFactory();
    private Utility utility;
    @Test
    public void testPieceExistenceNotNull() {
        Assert.assertNotNull(pieceFactory.createPieceExistence(utility.TRUE));
    }

    @Test
    public void testPieceExistenceAvailability() {
        Assert.assertEquals(utility.TRUE, pieceFactory.createPieceExistence(true).isExists());
    }

}
