package com.chess.piece;

import com.chess.piece.interfaces.*;

/**
 * @author Kunj Vijaykumar Patel
 */
public class PieceFactory implements IPieceFactory {

    @Override
    public IBishop createBishop(String name) {
        return new Bishop(name);
    }

    @Override
    public IKing createKing(String name) {
        return new King(name);
    }

    @Override
    public IKnight createKnight(String name) {
        return new Knight(name);
    }

    @Override
    public IPawn createPawn(String name) {
        return new Pawn(name);
    }

    @Override
    public IQueen createQueen(String name) {
        return new Queen(name);
    }

    @Override
    public IRook createRook(String name) {
        return new Rook(name);
    }
}
