package com.chess.piece;

import com.chess.piece.interfaces.IPieceFactory;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author Sanjuna Konda
 */

public class PieceExistenceTest {
    IPieceFactory pieceFactory = new PieceFactory();
    @Test
    public void testPieceExistenceNotNull() {
        Assert.assertNotNull(pieceFactory.createPieceExistence(true));
    }

    @Test
    public void testPieceExistenceAvailability() {
        Assert.assertEquals(true, pieceFactory.createPieceExistence(true).isExists());
    }

}
