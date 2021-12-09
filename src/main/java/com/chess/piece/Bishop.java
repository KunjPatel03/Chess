package com.chess.piece;

import com.chess.piece.interfaces.IBishop;

/**
 * @author Kunj Vijaykumar Patel
 */

public class Bishop extends Piece implements IBishop {
    public Bishop(String pieceName,String color) {
        super(pieceName,color);
    }
}
