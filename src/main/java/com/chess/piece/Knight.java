package com.chess.piece;

import com.chess.board.SquareBox;
import com.chess.board.interfaces.IBoard;
import com.chess.board.interfaces.ICoordinates;
import com.chess.piece.interfaces.IKnight;
import com.chess.piece.interfaces.IPieceExistence;
import com.chess.utilities.Utility;

/**
 * @author Sanjuna Konda
 */

public class Knight extends Piece implements IKnight {
    private PieceFactory pieceFactory = new PieceFactory();
    private int validCoordinateDistance;
    private int xDistance, yDistance;
    public Utility utility;

    public Knight(int color) {
        super(color);
    }

    @Override
    public String getPieceName(){
        return utility.KNIGHT;
    }

    @Override
    public boolean isValidMove(SquareBox startPosition, SquareBox endPosition) {
        if(endPosition.getPiece().getPieceColor() == this.getPieceColor()) {
            return false;
        }
        xDistance = pieceFactory.createXDistance(startPosition, endPosition).calculateXDistanceValue();
        yDistance = pieceFactory.createYDistance(startPosition, endPosition).calculateYDistanceValue();
        validCoordinateDistance = xDistance * yDistance;
        if(validCoordinateDistance == utility.TWO) {
            return true;
        }
        return false;
    }
}
