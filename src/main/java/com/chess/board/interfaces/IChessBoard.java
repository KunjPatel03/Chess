package com.chess.board.interfaces;

import com.chess.piece.interfaces.IPiece;

/**
 * @author Kunj Vijaykumar Patel
 */

public interface IChessBoard {
    ISquareBox getSqureBox(int x, int y,ISquareBox[][] squareBoxes) throws Exception;

    ISquareBox[][] setPieceOnBoard(ICoordinates coordinates, IPiece piece, ISquareBox[][] squareBoxes) throws Exception;

    ISquareBox[][] updateBoard(ICoordinates currentPosition, ICoordinates nextPosition, ISquareBox[][] squareBoxes) throws Exception;

    ISquareBox [][] initializeBoard();
}
