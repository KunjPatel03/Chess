package com.chess.piece;

import com.chess.piece.interfaces.IPieceFactory;
import org.junit.Assert;
import org.junit.Test;

import static com.chess.piece.Utility.KNIGHT;
import static com.chess.piece.Utility.WHITE;

/**
 * @author Sanjuna Konda
 */

public class KnightTest {
    IPieceFactory pieceFactory = new PieceFactory();

    @Test
    public void testKnightPieceNotNull() {
        Assert.assertNotNull(pieceFactory.createKnightPiece(KNIGHT, WHITE));
    }
}
