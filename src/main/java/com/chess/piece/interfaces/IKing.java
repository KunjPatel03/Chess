package com.chess.piece.interfaces;

import com.chess.board.SquareBox;
import com.chess.board.interfaces.IBoard;

/**
 * @author Sanjuna Konda
 */

public interface IKing {
    String getPieceName();
    boolean isCastlingRight(IBoard board, SquareBox startPosition, SquareBox endPosition);
    boolean checkForCastling(SquareBox startPosition, SquareBox endPosition);
}
