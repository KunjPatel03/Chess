package com.chess.moves.io;

import com.chess.moves.Moves;

import java.util.Scanner;

/**
 * @author Het Ketanbhai Shah
 */

public class MovesIO {
    Scanner reader = new Scanner(System.in);

    private boolean endGame = true;

    public void movesInput(Moves move) {
        System.out.println("Enter your moves in current and destination form or press exit to stop the game");


        System.out.print("Enter current position = ");
        String input = reader.nextLine();
        if(input.equalsIgnoreCase("exit"))
        {
            move.setContGame(false);
        }
        else
        {
            move.setCurPos(input);
            System.out.print("Enter destination position = ");
            move.setDesPos(reader.nextLine());
        }


    }
}
