package com.chess.piece.interfaces;

/**
 * @author Kunj Vijaykumar Patel
 */
public interface IPieceFactory {

    IBishop createBishop(String name);
    IKing createKing(String name);
    IKnight createKnight(String name);
    IPawn createPawn(String name);
    IQueen createQueen(String name);
    IRook createRook(String name);

}
