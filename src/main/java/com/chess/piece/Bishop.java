package com.chess.piece;

import com.chess.board.SquareBox;
import com.chess.piece.interfaces.IBishop;

/**
 * @author Sanjuna Konda
 */

public class Bishop extends Piece implements IBishop {

    private PieceFactory pieceFactory = new PieceFactory();
    private int xDistance, yDistance;
    public Utility utility;

    public Bishop(String pieceName, String color) {
        super(pieceName, color);
    }

    @Override
    public boolean isValidMove(SquareBox startPosition, SquareBox endPosition) {
        if (endPosition.getPiece().getPieceColor().equals(this.getPieceColor())) {
            return false;
        }
        xDistance = pieceFactory.createXDistance(startPosition, endPosition).calculateXDistanceValue();
        yDistance = pieceFactory.createYDistance(startPosition, endPosition).calculateYDistanceValue();
        if (xDistance == yDistance) {
            return true;
        }
        return false;
    }

}
