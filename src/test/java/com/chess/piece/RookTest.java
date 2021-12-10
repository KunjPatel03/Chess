package com.chess.piece;

import com.chess.piece.interfaces.IPieceFactory;
import org.junit.Assert;
import org.junit.Test;

import static com.chess.piece.Utility.ROOK;
import static com.chess.piece.Utility.WHITE;

/**
 * @author Sanjuna Konda
 */

public class RookTest {
    IPieceFactory pieceFactory = new PieceFactory();

    @Test
    public void testRookPieceNotNull() {
        Assert.assertNotNull(pieceFactory.createRookPiece(ROOK, WHITE));
    }
}
