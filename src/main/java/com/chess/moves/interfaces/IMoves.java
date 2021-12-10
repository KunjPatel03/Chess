package com.chess.moves.interfaces;

import com.chess.board.interfaces.ISquareBox;

public interface IMoves {

    String getCurPos();

    void setCurPos(String curPos);

    String getDesPos();

    void setDesPos(String desPos);

    boolean takeMovesInput();

    void chessLoop(ISquareBox[][] squareBoxes) throws Exception;

    void updateTheBoard(ISquareBox[][] squareBoxes) throws Exception;

    int inputToRow(String input);

    int inputToCol(String input);

}
