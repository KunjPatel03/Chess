package com.chess.piece.interfaces;

import com.chess.board.SquareBox;

/**
 * @author Sanjuna Konda
 */

public interface IPiece {
    String getPieceName();
    int getPieceColor();
    boolean isValidMove(SquareBox startPosition, SquareBox endPosition);
}
