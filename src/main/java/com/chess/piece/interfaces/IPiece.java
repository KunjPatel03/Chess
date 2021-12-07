package com.chess.piece.interfaces;

import com.chess.board.SquareBox;
import com.chess.board.interfaces.IBoard;
import com.chess.board.interfaces.ICoordinates;

/**
 * @author Sanjuna Konda
 */

public interface IPiece {
    String getPieceName();
    int getPieceColor();
    boolean isValidMove(IBoard board, SquareBox startPosition, SquareBox endPosition);
}
