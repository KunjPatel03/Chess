package com.chess.board.display.interfaces;

/**
 * @author Kunj Vijaykumar Patel
 */

public interface IShowBoardDisplay {
    void displayOuterLines();

    void displayVerticalIndex(int xCord);

    void displaySingleSpace();

    void displayPipe();

    void displaySqureLines();

    void displayEmptyLine();

    void displayHorizontalIndex();

    void displayMessage(String message);
}
