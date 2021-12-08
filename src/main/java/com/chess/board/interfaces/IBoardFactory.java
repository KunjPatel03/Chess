package com.chess.board.interfaces;

import com.chess.board.display.interfaces.IShowBoardDisplay;
import com.chess.piece.interfaces.IPiece;

/**
 * @author Kunj Vijaykumar Patel
 */
public interface IBoardFactory {

    ISquareBox createSqureBox(ICoordinates iCoordinates, IPiece iPiece);

    ISquareBox createSqureBox(ICoordinates iCoordinates);

    ISquareBox[][] createSqureBoxes(int size);

    ICoordinates createCoordinates(int xCoordinate, int yCoordinate);

    IChessBoard createChessboard();

    IShowBoard createShowBoard();

    IInitBoard createInitBoard();

    IShowBoardDisplay createShowBoardDisplay();
}
