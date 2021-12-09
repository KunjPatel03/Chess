package com.chess.moves.io;

import com.chess.moves.Moves;

import java.util.Scanner;

/**
 * @author Het Ketanbhai Shah
 */

public class MovesIO {
    Scanner reader = new Scanner(System.in);

    public void movesInput(Moves move) {
        System.out.println("Enter your moves in current and destination form");
        System.out.print("Enter current position - ");
        move.setCurPos(reader.nextLine());
        System.out.print("Enter destination position - ");
        move.setDesPos(reader.nextLine());
    }
}
