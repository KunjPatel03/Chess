package com.chess.moves;


import com.chess.board.BoardFactory;
import com.chess.board.interfaces.IChessBoard;
import com.chess.board.interfaces.ISquareBox;
import com.chess.moves.io.MovesIO;

import static com.chess.moves.Utilities.*;

/**
 * @author Het Ketanbhai Shah
 */


public class Moves {

    private String curPos;
    private String desPos;
    private boolean contGame = true;

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

    public boolean takeMovesInput() {
        MovesIO movesIO = new MovesIO();
        return movesIO.movesInput(this);
    }

    public void chessLoop(ISquareBox[][] squareBoxes) throws Exception {
        while (true) {
            contGame = takeMovesInput();
            if (contGame== false){
                break;
            }
            updateTheBoard(squareBoxes);
        }
    }

    public void updateTheBoard(ISquareBox[][] squareBoxes) throws Exception {
        BoardFactory boardFactory = new BoardFactory();
        IChessBoard chessBoard = boardFactory.createChessboard();
        squareBoxes = chessBoard.updateBoard(boardFactory.createCoordinates(inputToRow(getCurPos()), inputToCol(getCurPos())), boardFactory.createCoordinates(inputToRow(getDesPos()), inputToCol(getDesPos())), squareBoxes);
        boardFactory.createShowBoard().displayBoard(squareBoxes);
    }

    public int inputToRow(String input) {
        char rowChar = input.charAt(ONE);
        int row;
        switch (rowChar) {
            case '8':
                row = ZERO;
                break;
            case '7':
                row = ONE;
                break;
            case '6':
                row = TWO;
                break;
            case '5':
                row = THREE;
                break;
            case '4':
                row = FOUR;
                break;
            case '3':
                row = FIVE;
                break;
            case '2':
                row = SIX;
                break;
            case '1':
                row = SEVEN;
                break;
            default:
                row = MINUS_ONE;
                break;
        }
        return row;
    }

    // convert String input into column integer
    public int inputToCol(String input) {
        char character = input.charAt(ZERO);
        character = Character.toLowerCase(character);
        int col;
        switch (character) { // '0' value corresponds to 'a', etc
            case 'a':
                col = ZERO;
                break;
            case 'b':
                col = ONE;
                break;
            case 'c':
                col = TWO;
                break;
            case 'd':
                col = THREE;
                break;
            case 'e':
                col = FOUR;
                break;
            case 'f':
                col = FIVE;
                break;
            case 'g':
                col = SIX;
                break;
            case 'h':
                col = SEVEN;
                break;
            default:
                col = MINUS_ONE;
                break;
        }
        return col;
    }

}
