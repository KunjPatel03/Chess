package com.chess.piece;

import com.chess.piece.interfaces.IPieceFactory;
import org.junit.Assert;
import org.junit.Test;

import static com.chess.piece.Utility.KING;
import static com.chess.piece.Utility.WHITE;

/**
 * @author Sanjuna Konda
 */

public class KingTest {
    IPieceFactory pieceFactory = new PieceFactory();

    @Test
    public void testKingPieceNotNull() {
        Assert.assertNotNull(pieceFactory.createKingPiece(KING, WHITE));
    }
}
