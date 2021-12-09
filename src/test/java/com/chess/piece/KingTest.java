package com.chess.piece;

import com.chess.piece.interfaces.IPieceFactory;
import com.chess.utilities.Utility;
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
        Assert.assertNotNull(pieceFactory.createKingPiece(0));
    }

    @Test
    public void testKingGetPieceName() {
        Assert.assertEquals(utility.KING, pieceFactory.createKingPiece(0).getPieceName());
    }
}
