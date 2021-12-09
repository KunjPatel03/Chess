package com.chess.board;

import com.chess.board.interfaces.IBoardFactory;
import com.chess.board.interfaces.IInitBoard;
import com.chess.board.interfaces.ISquareBox;
import com.chess.piece.PieceFactory;
import com.chess.piece.interfaces.IPiece;
import com.chess.piece.interfaces.IPieceFactory;

import static com.chess.board.Utilites.*;


/**
 * @author Kunj Vijaykumar Patel
 */
public class InitBoard implements IInitBoard {

    private IBoardFactory boardFactory;
    private IPieceFactory pieceFactory;

    public InitBoard setBoardFactory(IBoardFactory boardFactory){
        this.boardFactory=boardFactory;
        return this;
    }

    public InitBoard setPieceFactory(IPieceFactory pieceFactory){
        this.pieceFactory=pieceFactory;
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

        squareBoxes[ZERO][ZERO].setPiece((IPiece) pieceFactory.createRook(WHITE_ROOK));
        squareBoxes[ZERO][SEVEN].setPiece((IPiece) pieceFactory.createRook(WHITE_ROOK));
        squareBoxes[ZERO][ONE].setPiece((IPiece) pieceFactory.createKnight(WHITE_KNIGHT));
        squareBoxes[ZERO][SIX].setPiece((IPiece) pieceFactory.createKnight(WHITE_KNIGHT));
        squareBoxes[ZERO][TWO].setPiece((IPiece) pieceFactory.createBishop(WHITE_BISHOP));
        squareBoxes[ZERO][FIVE].setPiece((IPiece) pieceFactory.createBishop(WHITE_BISHOP));
        squareBoxes[ZERO][THREE].setPiece((IPiece) pieceFactory.createQueen(WHITE_QUEEN));
        squareBoxes[ZERO][FOUR].setPiece((IPiece) pieceFactory.createKing(WHITE_KING));
        for (int index = ZERO; index < EIGHT; index++) {
            squareBoxes[ONE][index].setPiece((IPiece) pieceFactory.createPawn(WHITE_PAWN));
        }
        return squareBoxes;
    }

    @Override
    public ISquareBox[][] initializeBlackPieces(ISquareBox[][] squareBoxes) {

        squareBoxes[SEVEN][ZERO].setPiece((IPiece) pieceFactory.createRook(BLACK_ROOK));
        squareBoxes[SEVEN][SEVEN].setPiece((IPiece) pieceFactory.createRook(BLACK_ROOK));
        squareBoxes[SEVEN][TWO].setPiece((IPiece) pieceFactory.createBishop(BLACK_BISHOP));
        squareBoxes[SEVEN][FIVE].setPiece((IPiece) pieceFactory.createBishop(BLACK_BISHOP));
        squareBoxes[SEVEN][ONE].setPiece((IPiece) pieceFactory.createKnight(BLACK_KNIGHT));
        squareBoxes[SEVEN][SIX].setPiece((IPiece) pieceFactory.createKnight(BLACK_KNIGHT));
        squareBoxes[SEVEN][THREE].setPiece((IPiece) pieceFactory.createQueen(BLACK_QUEEN));
        squareBoxes[SEVEN][FOUR].setPiece((IPiece) pieceFactory.createKing(BLACK_KING));
        for (int index = ZERO; index < EIGHT; index++) {
            squareBoxes[SIX][index].setPiece((IPiece) pieceFactory.createPawn(BLACK_PAWN));
        }
        return squareBoxes;
    }

}
