package com.chess.board;

import com.chess.board.interfaces.*;
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
    public ISquareBox createSqureBox(ICoordinates iCoordinates) {
        return new SquareBox(iCoordinates);
    }

    @Override
    public ICoordinates createCoordinates(int xCoordinate, int yCoordinate) {
        return new Coordinates(xCoordinate,yCoordinate);
    }

    @Override
    public IChessBoard createChessboard() {
        return  new ChessBoard();
    }

    @Override
    public IShowBoard createShowBoard() {
        return new ShowBoard();
    }

    @Override
    public IInitBoard createInitBoard() {
        return new InitBoard();
    }


}
