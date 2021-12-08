package com.chess.piece;

import com.chess.board.SquareBox;
import com.chess.piece.interfaces.ICoordinateDistance;
import com.chess.utilities.Utility;

/**
 * @author Sanjuna Konda
 */

public class CoordinateDistance implements ICoordinateDistance {
    private SquareBox start;
    private SquareBox end;
    public Utility utility;

    public CoordinateDistance(SquareBox startPosition, SquareBox endPosition) {
        this.start = startPosition;
        this.end = endPosition;
    }
    @Override
    public int calculateCoordinateDistance(String pieceName) {
        int xCoordinate = Math.abs(start.getCoordinates().getXCoordinate() - end.getCoordinates().getXCoordinate());
        int yCoordinate = Math.abs(start.getCoordinates().getYCoordinate() - end.getCoordinates().getYCoordinate());
        int coordinateDistance = utility.ZERO;
        if(pieceName == utility.KING) {
            coordinateDistance = xCoordinate + yCoordinate;
        } else {
            coordinateDistance = xCoordinate * yCoordinate;
        }
        return coordinateDistance;
    }

}
