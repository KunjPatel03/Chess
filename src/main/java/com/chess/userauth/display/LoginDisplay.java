package com.chess.userauth.display;

import static com.chess.userauth.Utilities.*;

/**
 * @author Het Ketanbhai Shah
 */

public class LoginDisplay implements com.chess.userauth.interfaces.ILoginDisplay {

    @Override
    public void getLoginSuccessMessage() {
        System.out.println(LOGGED_IN_MESSAGE);
        System.out.println(PLAY_MESSAGE);
    }

    @Override
    public void getLoginFailureMessage() {
        System.out.println(INCORRECT_LOGIN_MESSAGE);
    }

}
