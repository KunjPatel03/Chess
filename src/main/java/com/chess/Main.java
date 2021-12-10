package com.chess;

import com.chess.board.BoardFactory;
import com.chess.board.interfaces.IBoardFactory;
import com.chess.board.interfaces.ISquareBox;
import com.chess.moves.Moves;
import com.chess.moves.interfaces.IMoves;
import com.chess.userauth.UserAuthFactory;
import com.chess.userauth.interfaces.IUserAuthFactory;

public class Main {

    private static IBoardFactory boardFactory = new BoardFactory();
    private static IUserAuthFactory userAuthFactory = new UserAuthFactory();
    private static ISquareBox[][] squareBoxes;

    public static void main(String args[]) throws Exception {

        IMoves moves = new Moves();

        userAuthFactory.createHome().indexPart();
        squareBoxes = boardFactory.createChessboard().initializeBoard();
        boardFactory.createShowBoard().displayBoard(squareBoxes);
        moves.chessLoop(squareBoxes);

    }

}