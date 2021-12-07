package com.chess.board;

import com.chess.board.interfaces.ICoordinates;

/**
 * @author Sanjuna Konda
 */

public class Coordinates implements ICoordinates {
    private int xCoordinate;
    private int yCoordinate;

    public Coordinates(int x, int y) {
        setXCoordinate(x);
        setYCoordinate(y);
    }

    @Override
    public int getXCoordinate() {
        return xCoordinate;
    }

    @Override
    public void setXCoordinate(int x) {
        this.xCoordinate = x;
    }

    @Override
    public int getYCoordinate() {
        return yCoordinate;
    }

    @Override
    public void setYCoordinate(int y) {
        this.yCoordinate = y;
    }
}
