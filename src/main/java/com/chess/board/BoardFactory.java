package com.chess.board;

import com.chess.board.interfaces.IBoardFactory;
import com.chess.board.interfaces.ICoordinates;
import com.chess.board.interfaces.ISquareBox;
import com.chess.piece.Piece;
import com.chess.piece.interfaces.IPiece;

/**
 * @author Kunj Vijaykumar Patel
 */

public class BoardFactory implements IBoardFactory {


    @Override
    public ISquareBox createSqureBox(ICoordinates iCoordinates, IPiece iPiece) {
        return new SquareBox(iCoordinates,iPiece);
    }

    @Override
    public ICoordinates createCoordinates(int xCoordinate, int yCoordinate) {
        return new Coordinates(xCoordinate,yCoordinate);
    }

}
