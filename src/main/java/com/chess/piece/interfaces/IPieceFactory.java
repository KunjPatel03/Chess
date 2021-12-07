package com.chess.piece.interfaces;

import com.chess.board.SquareBox;
import com.chess.board.interfaces.ICoordinates;

/**
 * @author Sanjuna Konda
 */

public interface IPieceFactory {
    ICoordinates createCoordinates(int xCoordinate, int yCoordinate);
    IPieceExistence createPieceExistence(boolean pieceExistence);
    ICoordinateDistance createCoordinateDistance(SquareBox startPosition, SquareBox endPosition);
}
