package com.chess.piece;

import com.chess.piece.interfaces.IPieceFactory;
import com.chess.utilities.Utility;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author Sanjuna Konda
 */

public class KnightTest {
    IPieceFactory pieceFactory = new PieceFactory();
    private Utility utility;
    @Test
    public void testKingPieceNotNull() {
        Assert.assertNotNull(pieceFactory.createKnightPiece(0));
    }

    @Test
    public void testKingGetPieceName() {
        Assert.assertEquals(utility.KNIGHT, pieceFactory.createKnightPiece(0).getPieceName());
    }
}
