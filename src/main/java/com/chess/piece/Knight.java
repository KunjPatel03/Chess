package com.chess.piece;

import com.chess.piece.interfaces.IKnight;

/**
 * @author Kunj Vijaykumar Patel
 */
public class Knight extends Piece implements IKnight {
    public Knight(String pieceName, String color) {
        super(pieceName,color);
    }
}
