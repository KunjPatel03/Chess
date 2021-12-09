package com.chess.piece;

import com.chess.board.SquareBox;
import com.chess.piece.interfaces.IPawn;
import com.chess.utilities.Utility;

/**
 * @author Sanjuna Konda
 */

public class Pawn extends Piece implements IPawn {
    private PieceFactory pieceFactory = new PieceFactory();
    public Utility utility;
    private int yDistance;

    public Pawn(int color) {
        super(color);
    }

    @Override
    public String getPieceName(){
        return utility.PAWN;
    }

    @Override
    public boolean isValidMove(SquareBox startPosition, SquareBox endPosition) {
        if(endPosition.getPiece().getPieceColor() == this.getPieceColor()) {
            return false;
        }
        yDistance = pieceFactory.createYDistance(startPosition, endPosition).calculateYDistanceValue();
        if(yDistance == utility.ONE || yDistance == utility.TWO) {
            return true;
        }
        return false;
    }
}
