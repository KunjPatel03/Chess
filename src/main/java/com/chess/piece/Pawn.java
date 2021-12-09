package com.chess.piece;

import com.chess.board.SquareBox;
import com.chess.piece.interfaces.IPawn;

/**
 * @author Sanjuna Konda
 */

public class Pawn extends Piece implements IPawn {
    private PieceFactory pieceFactory = new PieceFactory();
    public Utility utility;
    private int yDistance;

    public Pawn(String pieceName, String color) {
        super(pieceName,color);
    }

    @Override
    public boolean isValidMove(SquareBox startPosition, SquareBox endPosition) {
        if(endPosition.getPiece().getPieceColor().equals(this.getPieceColor())) {
            return false;
        }
        yDistance = pieceFactory.createYDistance(startPosition, endPosition).calculateYDistanceValue();
        if(yDistance == utility.ONE || yDistance == utility.TWO) {
            return true;
        }
        return false;
    }
}
