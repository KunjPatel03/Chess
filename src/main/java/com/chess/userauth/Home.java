package com.chess.userauth;

import com.chess.userauth.interfaces.IHome;
import com.chess.userauth.interfaces.IRegistration;
import com.chess.userauth.interfaces.IUserAuthFactory;

import java.util.Scanner;

import static com.chess.userauth.Utilities.*;

/**
 * @author Het Ketanbhai Shah
 */

public class Home implements IHome {
    @Override
    public void indexPart() {

        int userInput;

        IUserAuthFactory userAuthFactory = new UserAuthFactory();
        Login login = new Login();
        IRegistration registration = new Registration();
        Scanner reader = new Scanner(System.in);

        userAuthFactory.createHomeDisplay().getWelcomeMessage();

        userInput = reader.nextInt();
        switch (userInput) {
            case ONE:
                registration.userRegistration();
                break;
            case TWO:
                login.userLogin();
                break;
            default:
                throw new IllegalStateException(UNEXPECTED_VALUE + userInput);
        }

    }
}
