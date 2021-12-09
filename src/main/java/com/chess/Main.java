package com.chess;

import com.chess.board.BoardFactory;
import com.chess.board.interfaces.IBoardFactory;

public class Main {

    private static IBoardFactory boardFactory = new BoardFactory();

    public static void main(String args[]) {

        System.out.println("Hello and welcome to the Chess!");
        System.out.println("");
        System.out.println("Press 1 to play a new game");
        boardFactory.createShowBoard().displayBoard(boardFactory.createChessboard().initializeBoard());
    }
}