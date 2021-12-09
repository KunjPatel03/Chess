package com.chess.piece;

import com.chess.piece.interfaces.IPieceFactory;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author Sanjuna Konda
 */

public class RookTest {
    IPieceFactory pieceFactory = new PieceFactory();
    private Utility utility;
    @Test
    public void testKingPieceNotNull() {
        Assert.assertNotNull(pieceFactory.createRookPiece(utility.ROOK, utility.WHITE));
    }

    @Test
    public void testKingGetPieceName() {
        Assert.assertEquals(utility.ROOK, pieceFactory.createRookPiece(utility.ROOK, utility.WHITE).getPieceName());
    }
}
