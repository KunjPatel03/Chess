package com.chess.piece;

import com.chess.board.SquareBox;
import com.chess.board.interfaces.IBoard;
import com.chess.board.interfaces.ICoordinates;
import com.chess.piece.interfaces.IPieceExistence;
import com.chess.utilities.Utility;

/**
 * @author Sanjuna Konda
 */

public class Pawn extends Piece{
    private PieceFactory pieceFactory = new PieceFactory();
    public Utility utility;
    private int yDistance;

    public Pawn(ICoordinates iCoordinates, IPieceExistence pieceExistence, int color) {
        super(iCoordinates, pieceExistence, color);
    }

    @Override
    public String getPieceName(){
        return utility.PAWN;
    }

    @Override
    public boolean isValidMove(IBoard board, SquareBox startPosition, SquareBox endPosition) {
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
