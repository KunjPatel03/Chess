package com.chess;

import com.chess.board.BoardFactory;
import com.chess.board.interfaces.IBoardFactory;
import com.chess.userauth.UserAuthFactory;
import com.chess.userauth.interfaces.IUserAuthFactory;
import com.chess.moves.Moves;

public class Main {

    private static IBoardFactory boardFactory = new BoardFactory();
    private static IUserAuthFactory userAuthFactory = new UserAuthFactory();

    public static void main(String args[]) {

        userAuthFactory.createHome().indexPart();
        boardFactory.createShowBoard().displayBoard(boardFactory.createChessboard().initializeBoard());
        Moves moves = new Moves();
        moves.takeMovesInput();
    }
}