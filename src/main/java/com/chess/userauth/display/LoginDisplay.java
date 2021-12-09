package com.chess.userauth.display;

/**
 * @author Het Ketanbhai Shah
 */

public class LoginDisplay implements com.chess.userauth.interfaces.ILoginDisplay {


    @Override
    public void getLoginSuccessMessage() {
        System.out.println("Welcome to the Chess! You're logged in");
        System.out.println("You can play now!");
    }

    @Override
    public void getLoginFailureMessage() {
        System.out.println("Either userid or password is incorrect!");
    }
}
