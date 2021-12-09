package com.chess.board.interfaces;

import com.chess.piece.interfaces.IPiece;

/**
 * @author Kunj Vijaykumar Patel
 */
public interface ISquareBox {

    void setPiece(IPiece iPiece);

    IPiece getPiece();

    ICoordinates getCoordinates();

}
