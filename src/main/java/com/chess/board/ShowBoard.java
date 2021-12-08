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

    private IBoardFactory iBoardFactory = new BoardFactory();

    @Override
    public void displayBoard(ISquareBox[][] iSquareBoxes) {

        iBoardFactory.createShowBoardDisplay().displayOuterLines();

        for (int xCord = ZERO; xCord < EIGHT; xCord++) {

            iBoardFactory.createShowBoardDisplay().displayVerticalIndex(xCord);

            for (int yCord = ZERO; yCord < EIGHT; yCord++) {
                if (iSquareBoxes[xCord][yCord].getPiece() == null) {
                    iBoardFactory.createShowBoardDisplay().displaySingleSpace();
                    iBoardFactory.createShowBoardDisplay().displayPipe();
                } else {
                    iBoardFactory.createShowBoardDisplay().displayMessage(iSquareBoxes[xCord][yCord].getPiece().getPieceName());
                    iBoardFactory.createShowBoardDisplay().displayPipe();
                }
            }
            if (xCord < EIGHT) {
                iBoardFactory.createShowBoardDisplay().displayEmptyLine();
                iBoardFactory.createShowBoardDisplay().displaySqureLines();
            }
        }
        iBoardFactory.createShowBoardDisplay().displayHorizontalIndex();
    }
}
