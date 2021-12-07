package com.chess.piece;

import com.chess.board.Coordinates;
import com.chess.board.SquareBox;
import com.chess.piece.interfaces.ICoordinateDistance;

public class CoordinateDistance implements ICoordinateDistance {
    private SquareBox start;
    private SquareBox end;

    public CoordinateDistance(SquareBox startPosition, SquareBox endPosition) {
        this.start = startPosition;
        this.end = endPosition;
    }
    @Override
    public int calculateCoordinateDistance() {
        int xCoordinate = Math.abs(start.getCoordinates().getXCoordinate() - end.getCoordinates().getXCoordinate());
        int yCoordinate = Math.abs(start.getCoordinates().getYCoordinate() - end.getCoordinates().getYCoordinate());
        int coordinateDistance = xCoordinate + yCoordinate;
        return coordinateDistance;
    }

}
