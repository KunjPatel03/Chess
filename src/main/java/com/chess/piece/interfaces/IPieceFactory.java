package com.chess.piece.interfaces;

import com.chess.board.SquareBox;
import com.chess.board.interfaces.ICoordinates;
import com.chess.piece.Pawn;

/**
 * @author Sanjuna Konda
 */

public interface IPieceFactory {

    IPieceExistence createPieceExistence(boolean pieceExistence);
    ICalculateXDistance createXDistance(SquareBox startPosition, SquareBox endPosition);
    ICalculateYDistance createYDistance(SquareBox startPosition, SquareBox endPosition);
    IKing createKingPiece(String pieceName, String color);
    IKnight createKnightPiece(String pieceName, String color);
    IBishop createBishopPiece(String pieceName, String color);
    IQueen createQueenPiece(String pieceName, String color);
    IRook createRookPiece(String pieceName, String color);
    IPawn createPawnPiece(String pieceName, String color);

}
