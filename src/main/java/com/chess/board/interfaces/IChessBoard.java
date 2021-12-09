package com.chess.board.interfaces;

import com.chess.piece.interfaces.IPiece;

/**
 * @author Kunj Vijaykumar Patel
 */

public interface IChessBoard {
    ISquareBox getSqureBox(int x, int y) throws Exception;
    void setPieceOnBoard(ICoordinates iCoordinates, IPiece iPiece) throws Exception;
    ISquareBox [][] initializeBoard();
}
