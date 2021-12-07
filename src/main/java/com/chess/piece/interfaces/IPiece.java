package com.chess.piece.interfaces;

import com.chess.board.interfaces.IBoard;

/**
 * @author Sanjuna Konda
 */

public interface IPiece {
    String getPieceName();
    boolean isValidMove(IBoard board, ICoordinates iCoordinates, ICoordinates endCoordinates);
}
