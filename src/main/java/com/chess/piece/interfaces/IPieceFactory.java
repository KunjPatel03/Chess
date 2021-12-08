package com.chess.piece.interfaces;

import com.chess.board.SquareBox;
import com.chess.board.interfaces.ICoordinates;

/**
 * @author Sanjuna Konda
 */

public interface IPieceFactory {
    ICoordinates createCoordinates(int xCoordinate, int yCoordinate);
    IPieceExistence createPieceExistence(boolean pieceExistence);
    ICalculateXDistance createXDistance(SquareBox startPosition, SquareBox endPosition);
    ICalculateYDistance createYDistance(SquareBox startPosition, SquareBox endPosition);
}
