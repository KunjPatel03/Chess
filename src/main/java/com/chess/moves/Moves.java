package com.chess.moves;


import com.chess.moves.io.MovesIO;

import java.util.HashMap;

/**
 * @author Het Ketanbhai Shah
 */


public class Moves {
    public String getCurPos() {
        return curPos;
    }

    public void setCurPos(String curPos) {
        this.curPos = curPos;
    }

    public String getDesPos() {
        return desPos;
    }

    public void setDesPos(String desPos) {
        this.desPos = desPos;
    }

    String curPos;
    String desPos;

    public boolean canMove(String curPos, String desPos) {
        int curRow, curCol, destRow, destCol;
        curRow = inputToRow(curPos);
        curCol = inputToCol(curPos);
        destRow = inputToRow(desPos);
        destCol = inputToCol(desPos);

        if ((curRow >= 0 && curRow < Constants.TOTAL_ROW) && (curCol >= 0 && curCol < Constants.TOTAL_COL)) { // check source space
            if ((destRow >= 0 && destRow < Constants.TOTAL_ROW) && (destCol >= 0 && destCol < Constants.TOTAL_COL)) { // check dest space
                return true;
            }
        }
        return false;
    }

    public void takeMovesInput() {
        MovesIO movesIO = new MovesIO();
        movesIO.movesInput(this);
        System.out.println("Current Position");
        System.out.println(inputToRow(getCurPos()) + " And " + inputToCol(getCurPos()));
        System.out.println("Destination Position");
        System.out.print(inputToRow(getDesPos()) + " And " + inputToCol(getDesPos()));
    }

    public int inputToRow(String input) {
        char rowChar = input.charAt(1);
        int row;
        switch (rowChar) { // '0' value corresponds to '8', etc
            case '8':
                row = 0;
                break;
            case '7':
                row = 1;
                break;
            case '6':
                row = 2;
                break;
            case '5':
                row = 3;
                break;
            case '4':
                row = 4;
                break;
            case '3':
                row = 5;
                break;
            case '2':
                row = 6;
                break;
            case '1':
                row = 7;
                break;
            default:
                row = -1;
                break;
        }
        return row;
    }

    // convert String input into column integer
    public int inputToCol(String input) {
        char character = input.charAt(0);
        character = Character.toLowerCase(character);
        int col;
        switch (character) { // '0' value corresponds to 'a', etc
            case 'a':
                col = 0;
                break;
            case 'b':
                col = 1;
                break;
            case 'c':
                col = 2;
                break;
            case 'd':
                col = 3;
                break;
            case 'e':
                col = 4;
                break;
            case 'f':
                col = 5;
                break;
            case 'g':
                col = 6;
                break;
            case 'h':
                col = 7;
                break;
            default:
                col = -1;
                break;
        }
        return col;
    }

}
