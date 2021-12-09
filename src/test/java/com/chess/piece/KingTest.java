package com.chess.piece;

import com.chess.piece.interfaces.IPieceFactory;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author Sanjuna Konda
 */

public class KingTest {
    IPieceFactory pieceFactory = new PieceFactory();
    private Utility utility;
    @Test
    public void testKingPieceNotNull() {
        Assert.assertNotNull(pieceFactory.createKingPiece(utility.KING, utility.WHITE));
    }

    @Test
    public void testKingGetPieceName() {
        Assert.assertEquals(utility.KING, pieceFactory.createKingPiece(utility.KING, utility.WHITE).getPieceName());
    }
}
