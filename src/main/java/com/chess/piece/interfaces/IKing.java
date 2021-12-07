package com.chess.piece.interfaces;

import com.chess.board.SquareBox;
import com.chess.board.interfaces.IBoard;

public interface IKing {
    boolean isCastlingRight(IBoard board, SquareBox startPosition, SquareBox endPosition);
    boolean checkForCastling(SquareBox startPosition, SquareBox endPosition);
}
