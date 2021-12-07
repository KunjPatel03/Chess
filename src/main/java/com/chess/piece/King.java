package com.chess.piece;

import com.chess.board.SquareBox;
import com.chess.board.interfaces.IBoard;
import com.chess.board.interfaces.ICoordinates;
import com.chess.piece.interfaces.IKing;
import com.chess.piece.interfaces.IPieceExistence;

public class King extends Piece implements IKing {
    private PieceFactory pieceFactory = new PieceFactory();
    private int coordinateDistance;

    public King(ICoordinates iCoordinates, IPieceExistence pieceExistence, int color) {
        super(iCoordinates, pieceExistence, color);
    }

    @Override
    public boolean isValidMove(IBoard board, SquareBox startPosition, SquareBox endPosition) {
        if(endPosition.getPiece().getPieceColor() == this.getPieceColor()) {
            return false;
        }
        coordinateDistance = pieceFactory.createCoordinateDistance(startPosition, endPosition).calculateCoordinateDistance();
        if(coordinateDistance == 1) {
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
