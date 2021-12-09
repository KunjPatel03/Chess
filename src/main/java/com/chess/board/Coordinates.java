package com.chess.board;

import com.chess.board.interfaces.ICoordinates;

/**
 * @author Kunj Vijaykumar Patel
 */

public class Coordinates implements ICoordinates {
    private int coordinateX;
    private int coordinateY;

    public Coordinates(int x, int y) {
        setCoordinateX(x);
        setCoordinateY(y);
    }

    @Override
    public int getCoordinateX() {
        return coordinateX;
    }

    @Override
    public void setCoordinateX(int x) {
        this.coordinateX=x;
    }

    @Override
    public int getCoordinateY() {
        return coordinateY;
    }

    @Override
    public void setCoordinateY(int y) {
        this.coordinateY=y;
    }

}
