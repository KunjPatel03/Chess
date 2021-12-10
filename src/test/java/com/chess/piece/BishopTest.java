package com.chess.piece;

import com.chess.piece.interfaces.IPieceFactory;
import org.junit.Assert;
import org.junit.Test;

import static com.chess.piece.Utility.BISHOP;
import static com.chess.piece.Utility.WHITE;

/**
 * @author Sanjuna Konda
 */

public class BishopTest {
    IPieceFactory pieceFactory = new PieceFactory();

    @Test
    public void testBishopPieceNotNull() {
        Assert.assertNotNull(pieceFactory.createBishopPiece(BISHOP, WHITE));
    }
}
