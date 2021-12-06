package com.chess.board.interfaces;

import com.chess.board.Coordinates;
import com.chess.piece.Piece;
import com.chess.piece.interfaces.IPiece;

/**
 * @author Kunj Vijaykumar Patel
 */
public interface IBoardFactory {

    ISquareBox createSqureBox(ICoordinates iCoordinates, IPiece iPiece);

    ICoordinates createCoordinates(int xCoordinate, int yCoordinate);

}
