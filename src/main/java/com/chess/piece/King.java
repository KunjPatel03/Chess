package com.chess.piece;

import com.chess.board.SquareBox;
import com.chess.board.interfaces.IBoard;
import com.chess.piece.interfaces.IKing;

/**
 * @author Sanjuna Konda
 */

public class King extends Piece implements IKing {
    private PieceFactory pieceFactory = new PieceFactory();
    private int validCoordinateDistance;
    int xDistance, yDistance;
    private boolean castlingDone = false;
    public Utility utility;

    public King(String pieceName, String color) {
        super(pieceName,color);
    }

    public boolean isCastlingDone()
    {
        return this.castlingDone;
    }

    public void setCastlingDone(boolean castlingDone)
    {
        this.castlingDone = castlingDone;
    }

    @Override
    public boolean isValidMove(SquareBox startPosition, SquareBox endPosition) {
        if(endPosition.getPiece().getPieceColor().equals(this.getPieceColor())) {
            return false;
        }

        xDistance = pieceFactory.createXDistance(startPosition, endPosition).calculateXDistanceValue();
        yDistance = pieceFactory.createYDistance(startPosition, endPosition).calculateYDistanceValue();

        validCoordinateDistance = xDistance + yDistance;
        if(validCoordinateDistance == utility.ONE) {
            return true;
        }
        return false;
    }

    @Override
    public boolean isCastlingRight(IBoard board, SquareBox startPosition, SquareBox endPosition) {
        return false;
    }

    @Override
    public boolean checkForCastling(SquareBox startPosition, SquareBox endPosition) {
        return false;
    }
}
