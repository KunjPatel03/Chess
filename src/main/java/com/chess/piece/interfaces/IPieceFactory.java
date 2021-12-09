package com.chess.piece.interfaces;

import com.chess.board.SquareBox;
import com.chess.board.interfaces.ICoordinates;
import com.chess.piece.Pawn;

/**
 * @author Sanjuna Konda
 */

public interface IPieceFactory {
    ICoordinates createCoordinates(int xCoordinate, int yCoordinate);
    IPieceExistence createPieceExistence(boolean pieceExistence);
    ICalculateXDistance createXDistance(SquareBox startPosition, SquareBox endPosition);
    ICalculateYDistance createYDistance(SquareBox startPosition, SquareBox endPosition);
    IKing createKingPiece(int color);
    IKnight createKnightPiece(int color);
    IBishop createBishopPiece(int color);
    IQueen createQueenPiece(int color);
    IRook createRookPiece(int color);
    IPawn createPawnPiece(int color);
}
