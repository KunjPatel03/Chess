package com.chess.board.interfaces;

import com.chess.board.Coordinates;
import com.chess.piece.Piece;
import com.chess.piece.interfaces.IPiece;

/**
 * @author Kunj Vijaykumar Patel
 */
public interface IBoardFactory {

    ISquareBox createSqureBox(ICoordinates iCoordinates, IPiece iPiece);

    ISquareBox createSqureBox(ICoordinates iCoordinates);

    ICoordinates createCoordinates(int xCoordinate, int yCoordinate);

    IChessBoard createChessboard();

    IShowBoard createShowBoard();

    IInitBoard createInitBoard();
}
