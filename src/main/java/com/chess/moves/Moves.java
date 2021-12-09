package com.chess.moves;


import com.chess.board.BoardFactory;
import com.chess.board.interfaces.IChessBoard;
import com.chess.board.interfaces.ISquareBox;
import com.chess.moves.io.MovesIO;

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
    boolean contGame = true;

    public boolean isContGame() {
        return contGame;
    }

    public void setContGame(boolean contGame) {
        this.contGame = contGame;
    }


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

    }

    public void chessLoop(ISquareBox[][] squareBoxes) throws Exception {
        while (contGame) {
            takeMovesInput();
            if (contGame == true) {
                updateTheBoard(squareBoxes);
            }

        }
    }

    public void updateTheBoard(ISquareBox[][] squareBoxes) throws Exception {
        BoardFactory boardFactory = new BoardFactory();
        IChessBoard chessBoard = boardFactory.createChessboard();
        squareBoxes = chessBoard.updateBoard(boardFactory.createCoordinates(inputToRow(getCurPos()), inputToCol(getCurPos())), boardFactory.createCoordinates(inputToRow(getDesPos()), inputToCol(getDesPos())), squareBoxes);
        boardFactory.createShowBoard().displayBoard(squareBoxes);
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
