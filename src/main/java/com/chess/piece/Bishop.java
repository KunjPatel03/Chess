package com.chess.piece;

import com.chess.board.SquareBox;
import com.chess.board.interfaces.IBoard;
import com.chess.board.interfaces.ICoordinates;
import com.chess.piece.interfaces.IBishop;
import com.chess.piece.interfaces.IPieceExistence;
import com.chess.utilities.Utility;

/**
 * @author Sanjuna Konda
 */

public class Bishop extends Piece implements IBishop {
    private PieceFactory pieceFactory = new PieceFactory();
    private int xDistance, yDistance;
    public Utility utility;

    public Bishop(ICoordinates iCoordinates, IPieceExistence pieceExistence, int color) {
        super(iCoordinates, pieceExistence, color);
    }

    @Override
    public String getPieceName(){
        return utility.BISHOP;
    }

    @Override
    public boolean isValidMove(IBoard board, SquareBox startPosition, SquareBox endPosition) {
        if(endPosition.getPiece().getPieceColor() == this.getPieceColor()) {
            return false;
        }
        xDistance = pieceFactory.createXDistance(startPosition, endPosition).calculateXDistanceValue();
        yDistance = pieceFactory.createYDistance(startPosition, endPosition).calculateYDistanceValue();
        if(xDistance == yDistance) {
            return true;
        }
        return false;
    }
}
