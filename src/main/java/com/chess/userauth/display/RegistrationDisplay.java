package com.chess.userauth.display;

import static com.chess.userauth.Utilities.INVALID_REGISTRATION_MESSAGE;
import static com.chess.userauth.Utilities.SUCCESSFUL_REGISTRATION_MESSAGE;

/**
 * @author Het Ketanbhai Shah
 */

public class RegistrationDisplay implements com.chess.userauth.interfaces.IRegistrationDisplay {

    @Override
    public void getRegSuccessMessage() {
        System.out.println(SUCCESSFUL_REGISTRATION_MESSAGE);
    }

    @Override
    public void getRegFailureMessage() {
        System.out.println(INVALID_REGISTRATION_MESSAGE);
    }

}
