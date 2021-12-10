package com.chess.moves.io;

import com.chess.moves.Moves;

import java.util.Scanner;

import static com.chess.moves.Utilities.*;

/**
 * @author Het Ketanbhai Shah
 */

public class MovesIO {
    Scanner reader = new Scanner(System.in);

    private boolean endGame = true;

    public boolean movesInput(Moves move) {

        System.out.println(INITIAL_MESSAGE);


        System.out.print(ENTER_CURRENT_POSITION);
        String input = reader.nextLine();
        if(input.equalsIgnoreCase(EXIT)){
            return false;
        }
        else{
            move.setCurPos(input);
            System.out.print(ENTER_DESTINATION_POSITION);
            move.setDesPos(reader.nextLine());
            return true;
        }
    }
}
