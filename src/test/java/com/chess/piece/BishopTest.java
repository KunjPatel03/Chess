package com.chess.piece;

import com.chess.piece.interfaces.IPieceFactory;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author Sanjuna Konda
 */

public class BishopTest {
    IPieceFactory pieceFactory = new PieceFactory();
    private Utility utility;
    @Test
    public void testBishopPieceNotNull() {
        Assert.assertNotNull(pieceFactory.createBishopPiece(utility.BISHOP, utility.WHITE));
    }
}
