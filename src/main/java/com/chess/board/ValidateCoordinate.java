package com.chess.board;

import com.chess.board.interfaces.ICoordinates;
import com.chess.board.interfaces.IValidateCoordinate;

import static com.chess.board.Utilites.EIGHT;
import static com.chess.board.Utilites.ZERO;

/**
 * @author Kunj Vijaykumar Patel
 */

public class ValidateCoordinate implements IValidateCoordinate {

    @Override
    public boolean isCoordinateValid(ICoordinates coordinates) {
        if ((coordinates.getCoordinateX() >= ZERO && coordinates.getCoordinateX() < EIGHT)
                && (coordinates.getCoordinateY() >= ZERO && coordinates.getCoordinateY() < EIGHT)) {
            return true;
        }else {
            return false;
        }
    }


}
