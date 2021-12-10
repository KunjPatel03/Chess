package com.chess.userauth.display;

import com.chess.userauth.interfaces.IHomeDisplay;

import static com.chess.userauth.Utilities.*;

/**
 * @author Het Ketanbhai Shah
 */

public class HomeDisplay implements IHomeDisplay {

    @Override
    public void getWelcomeMessage() {
        System.out.println(WELCOME_MESSAGE);
        System.out.println();
        System.out.println(LOGIN_MESSAGE);
        System.out.print(ENTER);

    }
}
