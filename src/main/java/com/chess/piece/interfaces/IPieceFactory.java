package com.chess.piece.interfaces;

/**
 * @author Sanjuna Konda
 */

public interface IPieceFactory {
    ICoordinates createCoordinates(int xCoordinate, int yCoordinate);
    IPieceExistence createPieceExistence(boolean pieceExistence);
}
