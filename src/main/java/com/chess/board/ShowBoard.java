package com.chess.board;

import com.chess.board.interfaces.IBoardFactory;
import com.chess.board.interfaces.IShowBoard;
import com.chess.board.interfaces.ISquareBox;

import static com.chess.board.Utilites.EIGHT;
import static com.chess.board.Utilites.ZERO;

/**
 * @author Kunj Vijaykumar Patel
 */

public class ShowBoard implements IShowBoard {

    private IBoardFactory boardFactory;

    public ShowBoard setFactory(IBoardFactory boardFactory) {
        this.boardFactory = boardFactory;
        return this;
    }

    @Override
    public void displayBoard(ISquareBox[][] squareBoxes) {

        boardFactory.createShowBoardDisplay().displayOuterLines();

        for (int xCord = ZERO; xCord < EIGHT; xCord++) {

            boardFactory.createShowBoardDisplay().displayVerticalIndex((8 - xCord));

            for (int yCord = ZERO; yCord < EIGHT; yCord++) {
                if (squareBoxes[xCord][yCord].getPiece() == null) {
                    boardFactory.createShowBoardDisplay().displaySingleSpace();
                    boardFactory.createShowBoardDisplay().displayPipe();
                } else {
                    boardFactory.createShowBoardDisplay().displayMessage(squareBoxes[xCord][yCord].getPiece().getPieceName());
                    boardFactory.createShowBoardDisplay().displayPipe();
                }
            }
            if (xCord < EIGHT) {
                boardFactory.createShowBoardDisplay().displayEmptyLine();
                boardFactory.createShowBoardDisplay().displaySqureLines();
            }
        }
        boardFactory.createShowBoardDisplay().displayHorizontalIndex();
    }

}
