package com.chess.userauth;

import com.chess.userauth.interfaces.IHome;
import com.chess.userauth.interfaces.IUserAuthFactory;

import java.util.Scanner;

/**
 * @author Het Ketanbhai Shah
 */

public class Home implements IHome {
    @Override
    public void indexPart() {
        IUserAuthFactory userAuthFactory = new UserAuthFactory();
        Login login = new Login();
        Registration registration = new Registration();
        Scanner reader = new Scanner(System.in);

        // Display Message
        userAuthFactory.createHomeDisplay().getWelcomeMessage();

        int userInput = reader.nextInt();
        switch (userInput) {
            case 1:
                registration.userRegistration();
                break;
            case 2:
                login.userLogin();
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + userInput);
        }
    }
}
