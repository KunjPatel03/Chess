package com.chess.piece;

import com.chess.board.SquareBox;
import com.chess.piece.interfaces.IRook;
import com.chess.utilities.Utility;

/**
 * @author Sanjuna Konda
 */

public class Rook extends Piece implements IRook {
    public Utility utility;

    public Rook(int color) {
        super(color);
    }

    @Override
    public String getPieceName() {
        return utility.ROOK;
    }

    @Override
    public boolean isValidMove(SquareBox startPosition, SquareBox endPosition) {
        if(endPosition.getPiece().getPieceColor() == this.getPieceColor()) {
            return false;
        }
        if(startPosition.getCoordinates().getXCoordinate() == endPosition.getCoordinates().getXCoordinate()) {
            return true;
        } else if(startPosition.getCoordinates().getYCoordinate() == endPosition.getCoordinates().getYCoordinate()) {
            return true;
        }
        return false;
    }
}
