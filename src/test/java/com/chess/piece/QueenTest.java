package com.chess.piece;

import com.chess.piece.interfaces.IPieceFactory;
import org.junit.Assert;
import org.junit.Test;

import static com.chess.piece.Utility.QUEEN;
import static com.chess.piece.Utility.WHITE;

/**
 * @author Sanjuna Konda
 */

public class QueenTest {
    IPieceFactory pieceFactory = new PieceFactory();

    @Test
    public void testQueenPieceNotNull() {
        Assert.assertNotNull(pieceFactory.createQueenPiece(QUEEN, WHITE));
    }
}
