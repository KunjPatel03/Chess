package com.chess.piece;

import com.chess.piece.interfaces.*;

/**
 * @author Kunj Vijaykumar Patel
 */
public class PieceFactory implements IPieceFactory {

    @Override
    public IBishop createBishopPiece(String pieceName, String color) {
        return new Bishop(pieceName, color);
    }

    @Override
    public IKing createKingPiece(String pieceName, String color) {
        return new King(pieceName, color);
    }

    @Override
    public IKnight createKnightPiece(String pieceName, String color) {
        return new Knight(pieceName, color);
    }

    @Override
    public IPawn createPawnPiece(String pieceName, String color) {
        return new Pawn(pieceName, color);
    }

    @Override
    public IQueen createQueenPiece(String pieceName, String color) {
        return new Queen(pieceName, color);
    }

    @Override
    public IRook createRookPiece(String pieceName, String color) {
        return new Rook(pieceName,color);
    }


}
