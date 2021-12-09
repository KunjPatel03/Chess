package com.chess.piece;

import com.chess.piece.interfaces.IPieceFactory;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author Sanjuna Konda
 */

public class QueenTest {
    IPieceFactory pieceFactory = new PieceFactory();
    private Utility utility;
    @Test
    public void testQueenPieceNotNull() {
        Assert.assertNotNull(pieceFactory.createQueenPiece(utility.QUEEN, utility.WHITE));
    }
}
