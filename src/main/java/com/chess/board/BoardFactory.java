package com.chess.board;

import com.chess.board.display.ShowBoardDisplay;
import com.chess.board.display.interfaces.IShowBoardDisplay;
import com.chess.board.interfaces.*;
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

    public ISquareBox[][] createSqureBoxes(int size) {
        return new SquareBox[size][size];
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

    @Override
    public IShowBoardDisplay createShowBoardDisplay() {
        return new ShowBoardDisplay();
    }

    @Override
    public IValidateCoordinate createValidateCoordinate() {
        return new ValidateCoordinate();
    }


}
