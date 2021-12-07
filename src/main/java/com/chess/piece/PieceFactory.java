package com.chess.piece;

import com.chess.board.Coordinates;
import com.chess.board.SquareBox;
import com.chess.board.interfaces.ICoordinates;
import com.chess.piece.interfaces.ICoordinateDistance;
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

    @Override
    public ICoordinateDistance createCoordinateDistance(SquareBox startPosition, SquareBox endPosition) {
        return new CoordinateDistance(startPosition, endPosition );
    }

}
