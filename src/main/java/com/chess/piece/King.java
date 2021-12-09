package com.chess.piece;

import com.chess.piece.interfaces.IKing;

/**
 * @author Kunj Vijaykumar Patel
 */

public class King extends Piece implements IKing {
    public King(String pieceName,String color) {
        super(pieceName,color);
    }
}
