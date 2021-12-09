package com.chess.piece;

import com.chess.board.SquareBox;
import com.chess.piece.interfaces.IQueen;

/**
 * @author Sanjuna Konda
 */

public class Queen extends Piece implements IQueen {
    private PieceFactory pieceFactory = new PieceFactory();
    private Utility utility;
    private int xDistance, yDistance;

    public Queen(String pieceName, String color) {
        super(pieceName,color);
    }

    @Override
    public String getPieceName(){
        return utility.QUEEN;
    }

    @Override
    public boolean isValidMove(SquareBox startPosition, SquareBox endPosition) {
        if(endPosition.getPiece().getPieceColor().equals(this.getPieceColor())) {
            return false;
        }
        xDistance = pieceFactory.createXDistance(startPosition, endPosition).calculateXDistanceValue();
        yDistance = pieceFactory.createYDistance(startPosition, endPosition).calculateYDistanceValue();
        if(xDistance == yDistance) {
            return true;
        }
        if(startPosition.getCoordinates().getXCoordinate() == endPosition.getCoordinates().getXCoordinate()) {
            return true;
        } else if(startPosition.getCoordinates().getYCoordinate() == endPosition.getCoordinates().getYCoordinate()) {
            return true;
        }
        return false;
    }
}
