package com.chess.board.interfaces;

/**
 * @author Kunj Vijaykumar Patel
 */
public interface ICoordinates {
    boolean isCoordinateValid();
    int getCoordinateX();
    void setCoordinateX(int x);
    int getCoordinateY();
    void setCoordinateY(int y);
}
