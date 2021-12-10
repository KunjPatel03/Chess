package com.chess.board;

import com.chess.board.interfaces.IBoardFactory;
import com.chess.board.interfaces.IInitBoard;
import com.chess.board.interfaces.ISquareBox;
import com.chess.piece.interfaces.IPiece;
import com.chess.piece.interfaces.IPieceFactory;

import static com.chess.board.Utilites.*;

/**
 * @author Kunj Vijaykumar Patel
 */

public class InitBoard implements IInitBoard {

    private IBoardFactory boardFactory;
    private IPieceFactory pieceFactory;

    public InitBoard setBoardFactory(IBoardFactory boardFactory) {
        this.boardFactory = boardFactory;
        return this;
    }

    public InitBoard setPieceFactory(IPieceFactory pieceFactory) {
        this.pieceFactory = pieceFactory;
        return this;
    }

    @Override
    public ISquareBox[][] initializeNewBoard(ISquareBox[][] squareBoxes) {
        for (int x = ZERO; x < EIGHT; x++) {
            for (int y = ZERO; y < EIGHT; y++) {
                squareBoxes[x][y] = boardFactory.createSqureBox(boardFactory.createCoordinates(x, y));
            }
        }
        squareBoxes = initializeBlackPieces(squareBoxes);
        squareBoxes = initializeWhitePieces(squareBoxes);
        return squareBoxes;
    }

    @Override
    public ISquareBox[][] initializeWhitePieces(ISquareBox[][] squareBoxes) {

        squareBoxes[SEVEN][SEVEN].setPiece((IPiece) pieceFactory.createRookPiece(WHITE_ROOK, WHITE));
        squareBoxes[SEVEN][ZERO].setPiece((IPiece) pieceFactory.createRookPiece(WHITE_ROOK, WHITE));
        squareBoxes[SEVEN][ONE].setPiece((IPiece) pieceFactory.createKnightPiece(WHITE_KNIGHT, WHITE));
        squareBoxes[SEVEN][SIX].setPiece((IPiece) pieceFactory.createKnightPiece(WHITE_KNIGHT, WHITE));
        squareBoxes[SEVEN][TWO].setPiece((IPiece) pieceFactory.createBishopPiece(WHITE_BISHOP, WHITE));
        squareBoxes[SEVEN][FIVE].setPiece((IPiece) pieceFactory.createBishopPiece(WHITE_BISHOP, WHITE));
        squareBoxes[SEVEN][THREE].setPiece((IPiece) pieceFactory.createQueenPiece(WHITE_QUEEN, WHITE));
        squareBoxes[SEVEN][FOUR].setPiece((IPiece) pieceFactory.createKingPiece(WHITE_KING, WHITE));
        for (int index = ZERO; index < EIGHT; index++) {
            squareBoxes[SIX][index].setPiece((IPiece) pieceFactory.createPawnPiece(WHITE_PAWN, WHITE));
        }
        return squareBoxes;
    }

    @Override
    public ISquareBox[][] initializeBlackPieces(ISquareBox[][] squareBoxes) {


        squareBoxes[ZERO][ZERO].setPiece((IPiece) pieceFactory.createRookPiece(BLACK_ROOK, BLACK));
        squareBoxes[ZERO][SEVEN].setPiece((IPiece) pieceFactory.createRookPiece(BLACK_ROOK, BLACK));
        squareBoxes[ZERO][TWO].setPiece((IPiece) pieceFactory.createBishopPiece(BLACK_BISHOP, BLACK));
        squareBoxes[ZERO][FIVE].setPiece((IPiece) pieceFactory.createBishopPiece(BLACK_BISHOP, BLACK));
        squareBoxes[ZERO][SIX].setPiece((IPiece) pieceFactory.createKnightPiece(BLACK_KNIGHT, BLACK));
        squareBoxes[ZERO][ONE].setPiece((IPiece) pieceFactory.createKnightPiece(BLACK_KNIGHT, BLACK));
        squareBoxes[ZERO][THREE].setPiece((IPiece) pieceFactory.createQueenPiece(BLACK_QUEEN, BLACK));
        squareBoxes[ZERO][FOUR].setPiece((IPiece) pieceFactory.createKingPiece(BLACK_KING, BLACK));
        for (int index = ZERO; index < EIGHT; index++) {
            squareBoxes[ONE][index].setPiece((IPiece) pieceFactory.createPawnPiece(BLACK_PAWN, BLACK));
        }
        return squareBoxes;
    }

}
