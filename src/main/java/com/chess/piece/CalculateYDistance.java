package com.chess.piece;

import com.chess.board.SquareBox;
import com.chess.piece.interfaces.ICalculateYDistance;

/**
 * @author Sanjuna Konda
 */

public class CalculateYDistance implements ICalculateYDistance {
    private SquareBox start;
    private SquareBox end;
    int yDistance;

    public CalculateYDistance(SquareBox startPosition, SquareBox endPosition) {
        this.start = startPosition;
        this.end = endPosition;
    }
    @Override
    public int calculateYDistanceValue() {
        yDistance = Math.abs(start.getCoordinates().getCoordinateY() - end.getCoordinates().getCoordinateY());
        return yDistance;
    }
}
