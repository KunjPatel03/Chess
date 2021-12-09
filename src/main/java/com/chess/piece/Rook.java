package com.chess.piece;

import com.chess.piece.interfaces.IRook;

/**
 * @author Kunj Vijaykumar Patel
 */
public class Rook extends Piece implements IRook {
    public Rook(String pieceName, String color) {
        super(pieceName, color);
    }
}
