package com.chess.board;

import com.chess.board.display.ShowBoardDisplay;
import com.chess.board.display.interfaces.IShowBoardDisplay;
import com.chess.board.interfaces.*;
import com.chess.piece.PieceFactory;
import com.chess.piece.interfaces.IPiece;
import com.chess.piece.interfaces.IPieceFactory;

/**
 * @author Kunj Vijaykumar Patel
 */

public class BoardFactory implements IBoardFactory {

    @Override
    public ISquareBox createSqureBox(ICoordinates coordinates, IPiece piece) {
        return new SquareBox(coordinates,piece).setFactory(this);
    }

    @Override
    public ISquareBox createSqureBox(ICoordinates coordinates) {
        return new SquareBox(coordinates).setFactory(this);
    }

    public ISquareBox[][] createSqureBoxes(int size) {
        return new SquareBox[size][size];
    }

    @Override
    public ICoordinates createCoordinates(int xCoordinate, int yCoordinate) {
        return new Coordinates(xCoordinate,yCoordinate);
    }

    @Override
    public IChessBoard createChessboard() {
        return new ChessBoard();
    }

    @Override
    public IShowBoard createShowBoard() {
        return new ShowBoard().setFactory(this);
    }

    @Override
    public IInitBoard createInitBoard() {
        return new InitBoard().setBoardFactory(this).setPieceFactory(createPieceFactory());
    }

    private IPieceFactory createPieceFactory() {
        return new PieceFactory();
    }

    @Override
    public IShowBoardDisplay createShowBoardDisplay() {
        return new ShowBoardDisplay();
    }

    @Override
    public IValidateCoordinate createValidateCoordinate() {
        return new ValidateCoordinate();
    }

}
