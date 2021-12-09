package com.chess.piece.interfaces;

/**
 * @author Kunj Vijaykumar Patel
 */

public interface IPieceFactory {

    IBishop createBishopPiece(String pieceName, String color);

    IKing createKingPiece(String pieceName, String color);

    IKnight createKnightPiece(String pieceName, String color);

    IPawn createPawnPiece(String pieceName, String color);

    IQueen createQueenPiece(String pieceName, String color);

    IRook createRookPiece(String pieceName, String color);

}
