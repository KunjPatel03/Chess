package com.chess.board;

import com.chess.board.interfaces.ICoordinates;

import static com.chess.board.Utilites.EIGHT;
import static com.chess.board.Utilites.ZERO;

/**
 * @author Kunj Vijaykumar Patel
 */

public class Coordinates implements ICoordinates {
    private int coordinateX;
    private int coordinateY;

    public Coordinates(int x, int y) {
        setCoordinateX(x);
        setCoordinateX(y);
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
