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

    private IBoardFactory iBoardFactory = new BoardFactory();
    private IPieceFactory iPieceFactory = new PieceFactory();

    @Override
    public ISquareBox[][] initializeNewBoard(ISquareBox[][] iSquareBoxes) {
        for (int x = ZERO; x < EIGHT; x++) {
            for (int y = ZERO; y < EIGHT; y++) {
                iSquareBoxes[x][y] = iBoardFactory.createSqureBox(iBoardFactory.createCoordinates(x, y));
            }
        }

        iSquareBoxes = initializeBlackPieces(iSquareBoxes);
        iSquareBoxes = initializeWhitePieces(iSquareBoxes);

        return iSquareBoxes;
    }

    @Override
    public ISquareBox[][] initializeWhitePieces(ISquareBox[][] iSquareBoxes) {

        iSquareBoxes[ZERO][ZERO].setPiece((IPiece) iPieceFactory.createRook(WHITE_ROOK));
        iSquareBoxes[ZERO][SEVEN].setPiece((IPiece) iPieceFactory.createRook(WHITE_ROOK));
        iSquareBoxes[ZERO][ONE].setPiece((IPiece) iPieceFactory.createKnight(WHITE_KNIGHT));
        iSquareBoxes[ZERO][SIX].setPiece((IPiece) iPieceFactory.createKnight(WHITE_KNIGHT));
        iSquareBoxes[ZERO][TWO].setPiece((IPiece) iPieceFactory.createBishop(WHITE_BISHOP));
        iSquareBoxes[ZERO][FIVE].setPiece((IPiece) iPieceFactory.createBishop(WHITE_BISHOP));
        iSquareBoxes[ZERO][THREE].setPiece((IPiece) iPieceFactory.createQueen(WHITE_QUEEN));
        iSquareBoxes[ZERO][FOUR].setPiece((IPiece) iPieceFactory.createKing(WHITE_KING));
        for (int index = ZERO; index < EIGHT; index++) {
            iSquareBoxes[ONE][index].setPiece((IPiece) iPieceFactory.createPawn(WHITE_PAWN));
        }

        return iSquareBoxes;
    }

    @Override
    public ISquareBox[][] initializeBlackPieces(ISquareBox[][] iSquareBoxes) {

        iSquareBoxes[SEVEN][ZERO].setPiece((IPiece) iPieceFactory.createRook(BLACK_ROOK));
        iSquareBoxes[SEVEN][SEVEN].setPiece((IPiece) iPieceFactory.createRook(BLACK_ROOK));
        iSquareBoxes[SEVEN][TWO].setPiece((IPiece) iPieceFactory.createBishop(BLACK_BISHOP));
        iSquareBoxes[SEVEN][FIVE].setPiece((IPiece) iPieceFactory.createBishop(BLACK_BISHOP));
        iSquareBoxes[SEVEN][ONE].setPiece((IPiece) iPieceFactory.createKnight(BLACK_KNIGHT));
        iSquareBoxes[SEVEN][SIX].setPiece((IPiece) iPieceFactory.createKnight(BLACK_KNIGHT));
        iSquareBoxes[SEVEN][THREE].setPiece((IPiece) iPieceFactory.createQueen(BLACK_QUEEN));
        iSquareBoxes[SEVEN][FOUR].setPiece((IPiece) iPieceFactory.createKing(BLACK_KING));
        for (int index = ZERO; index < EIGHT; index++) {
            iSquareBoxes[SIX][index].setPiece((IPiece) iPieceFactory.createPawn(BLACK_PAWN));
        }

        return iSquareBoxes;
    }

}
