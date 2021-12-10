package com.chess.userauth.io;

import com.chess.userauth.Registration;
import com.chess.userauth.UserAuthFactory;
import com.chess.userauth.interfaces.IUserAuthFactory;

import java.util.Scanner;

import static com.chess.userauth.Utilities.*;

/**
 * @author Het Ketanbhai Shah
 */

public class RegistrationIO implements com.chess.userauth.interfaces.IRegistrationIO {

    @Override
    public void getDetails(Registration registration) {
        IUserAuthFactory userAuthFactory = new UserAuthFactory();
        Scanner reader = new Scanner(System.in);

        System.out.println(REGISTRATION_INPUT);
        System.out.print(NAME_INPUT);
        registration.setPlayerName(reader.nextLine());

        System.out.print(USERID_INPUT);
        registration.setUserId(reader.nextLine());

        System.out.print(PASSWORD_INPUT);
        registration.setPassword(reader.nextLine());
    }
}
