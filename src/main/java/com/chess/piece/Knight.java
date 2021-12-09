package com.chess.piece;

import com.chess.board.SquareBox;
import com.chess.piece.interfaces.IKnight;

/**
 * @author Sanjuna Konda
 */

public class Knight extends Piece implements IKnight {
    private PieceFactory pieceFactory = new PieceFactory();
    private int validCoordinateDistance;
    private int xDistance, yDistance;
    public Utility utility;

    public Knight(String pieceName, String color) {
        super(pieceName,color);
    }

    @Override
    public String getPieceName(){
        return utility.KNIGHT;
    }

    @Override
    public boolean isValidMove(SquareBox startPosition, SquareBox endPosition) {
        if(endPosition.getPiece().getPieceColor().equals(this.getPieceColor())) {
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
