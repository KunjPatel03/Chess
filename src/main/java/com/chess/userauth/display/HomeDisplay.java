package com.chess.userauth.display;

import com.chess.userauth.interfaces.IHomeDisplay;

/**
 * @author Het Ketanbhai Shah
 */

public class HomeDisplay implements IHomeDisplay {
    @Override
    public void getWelcomeMessage() {
        System.out.println("Hello and welcome to the Chess!");
        System.out.println();
        System.out.println("Press 1 for Registration and Press 2 for Login");
        System.out.print("Enter - ");
    }
}
