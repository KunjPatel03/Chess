package com.chess.piece;

import com.chess.piece.interfaces.ICoordinates;
import com.chess.piece.interfaces.IPieceExistence;
import com.chess.piece.interfaces.IPieceFactory;

/**
 * @author Sanjuna Konda
 */

public class PieceFactory implements IPieceFactory {

    @Override
    public ICoordinates createCoordinates(int xCoordinate, int yCoordinate) {
        return new Coordinates(xCoordinate, yCoordinate);
    }

    @Override
    public IPieceExistence createPieceExistence(boolean pieceExistence) {
        return new PieceExistence(pieceExistence);
    }
}
