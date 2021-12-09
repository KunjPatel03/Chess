package com.chess.piece;

import com.chess.piece.interfaces.IQueen;

/**
 * @author Kunj Vijaykumar Patel
 */

public class Queen extends Piece implements IQueen {
    public Queen(String pieceName,String color) {
        super(pieceName,color);
    }
}
