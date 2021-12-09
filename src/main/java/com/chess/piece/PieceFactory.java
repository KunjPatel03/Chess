package com.chess.piece;

import com.chess.board.Coordinates;
import com.chess.board.SquareBox;
import com.chess.board.interfaces.ICoordinates;
import com.chess.piece.interfaces.*;

/**
 * @author Sanjuna Konda
 */

public class PieceFactory implements IPieceFactory {

    @Override
    public ICoordinates createCoordinates(int xCoordinate, int yCoordinate) {
        return new Coordinates(xCoordinate, yCoordinate);
    }

    @Override
    public IPieceExistence createPieceExistence(boolean pieceExistence) {
        return new PieceExistence(pieceExistence);
    }

    @Override
    public ICalculateXDistance createXDistance(SquareBox startPosition, SquareBox endPosition) {
        return new CalculateXDistance(startPosition, endPosition);
    }

    @Override
    public ICalculateYDistance createYDistance(SquareBox startPosition, SquareBox endPosition) {
        return new CalculateYDistance(startPosition, endPosition);
    }

    @Override
    public IKing createKingPiece(int color) {
        return new King(color);
    }

    @Override
    public IKnight createKnightPiece(int color) {
        return new Knight(color);
    }

    @Override
    public IBishop createBishopPiece(int color) {
        return new Bishop(color);
    }

    @Override
    public IQueen createQueenPiece(int color) {
        return new Queen(color);
    }

    @Override
    public IRook createRookPiece(int color) {
        return new Rook(color);
    }

    @Override
    public IPawn createPawnPiece(int color) {
        return new Pawn(color);
    }
}
