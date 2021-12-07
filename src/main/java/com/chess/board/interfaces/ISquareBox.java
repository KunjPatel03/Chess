package com.chess.board.interfaces;

import com.chess.piece.interfaces.IPiece;

public interface ISquareBox {
    ICoordinates getCoordinates();
    IPiece getPiece();
}
