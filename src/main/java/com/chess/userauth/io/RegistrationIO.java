package com.chess.userauth.io;

import com.chess.userauth.UserAuthFactory;
import com.chess.userauth.interfaces.IUserAuthFactory;

import java.util.Scanner;

/**
 * @author Het Ketanbhai Shah
 */

public class RegistrationIO implements com.chess.userauth.interfaces.IRegistrationIO {
    @Override
    public void getDetails() {
        IUserAuthFactory userAuthFactory = new UserAuthFactory();
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter your Name, ID and password for Registration");
        System.out.print("Enter your name- ");

        userAuthFactory.createRegistration().setPlayerName(reader.nextLine());

        System.out.print("Enter User ID - ");
        userAuthFactory.createRegistration().setUserId(reader.nextLine());

        System.out.print("Enter Password - ");
        userAuthFactory.createRegistration().setPassword(reader.nextLine());

    }
}
