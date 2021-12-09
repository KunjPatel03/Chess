package com.chess.board.interfaces;

/**
 * @author Kunj Vijaykumar Patel
 */

public interface IInitBoard {
    ISquareBox[][] initializeWhitePieces(ISquareBox[][] iSquareBoxes);

    ISquareBox[][] initializeBlackPieces(ISquareBox[][] iSquareBoxes);

    ISquareBox[][] initializeNewBoard(ISquareBox[][] iSquareBoxes);
}
