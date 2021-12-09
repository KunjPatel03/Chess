package com.chess.piece;

import com.chess.board.SquareBox;
import com.chess.piece.interfaces.ICalculateXDistance;

/**
 * @author Sanjuna Konda
 */

public class CalculateXDistance implements ICalculateXDistance {
    private SquareBox start;
    private SquareBox end;
    int xDistance;

    public CalculateXDistance(SquareBox startPosition, SquareBox endPosition) {
        this.start = startPosition;
        this.end = endPosition;
    }

    @Override
    public int calculateXDistanceValue() {
        xDistance = Math.abs(start.getCoordinates().getCoordinateX() - end.getCoordinates().getCoordinateX());
        return xDistance;
    }
}
