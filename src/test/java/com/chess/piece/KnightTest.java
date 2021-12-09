package com.chess.piece;

import com.chess.piece.interfaces.IPieceFactory;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author Sanjuna Konda
 */

public class KnightTest {
    IPieceFactory pieceFactory = new PieceFactory();
    private Utility utility;
    @Test
    public void testKnightPieceNotNull() {
        Assert.assertNotNull(pieceFactory.createKnightPiece(utility.KNIGHT, utility.WHITE));
    }
}
