package com.chess.board.interfaces;

import com.chess.piece.interfaces.IPiece;

/**
 * @author Sanjuna Konda
 */

public interface ISquareBox {
    ICoordinates getCoordinates();
    IPiece getPiece();
}
