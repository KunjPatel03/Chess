package com.chess.board.display;

import com.chess.board.display.interfaces.IShowBoardDisplay;

/**
 * @author Kunj Vijaykumar Patel
 */

public class ShowBoardDisplay implements IShowBoardDisplay {
    @Override
    public void displayOuterLines() {
        System.out.println(" ____________________________________");
    }

    @Override
    public void displayVerticalIndex(int xCord) {
        System.out.print(" |");
        System.out.print(1+xCord+" |");
    }

    @Override
    public void displaySingleSpace() {
        System.out.print("   ");
    }

    @Override
    public void displayPipe() {
        System.out.print("|");
    }

    @Override
    public void displaySqureLines() {
        System.out.println(" |==|===============================|");
    }

    @Override
    public void displayEmptyLine() {
        System.out.println();
    }

    @Override
    public void displayHorizontalIndex() {
        System.out.println(" |  | a | b | c | d | e | f | g | h |");
    }

    @Override
    public void displayMessage(String message) {
        System.out.print(message);
    }


}
