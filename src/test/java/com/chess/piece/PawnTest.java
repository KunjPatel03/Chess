package com.chess.piece;

import com.chess.piece.interfaces.IPieceFactory;
import org.junit.Assert;
import org.junit.Test;

import static com.chess.piece.Utility.PAWN;
import static com.chess.piece.Utility.WHITE;

/**
 * @author Sanjuna Konda
 */

public class PawnTest {
    IPieceFactory pieceFactory = new PieceFactory();

    @Test
    public void testPawnPieceNotNull() {
        Assert.assertNotNull(pieceFactory.createPawnPiece(PAWN, WHITE));
    }
}
