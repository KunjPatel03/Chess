package com.chess.piece;

import com.chess.piece.interfaces.IPieceFactory;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author Sanjuna Konda
 */

public class PawnTest {
    IPieceFactory pieceFactory = new PieceFactory();
    private Utility utility;
    @Test
    public void testKingPieceNotNull() {
        Assert.assertNotNull(pieceFactory.createPawnPiece(utility.PAWN, utility.WHITE));
    }

    @Test
    public void testKingGetPieceName() {
        Assert.assertEquals(utility.PAWN, pieceFactory.createPawnPiece(utility.PAWN, utility.WHITE).getPieceName());
    }
}
