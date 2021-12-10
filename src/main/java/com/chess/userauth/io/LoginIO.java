package com.chess.userauth.io;

import com.chess.userauth.Login;
import com.chess.userauth.UserAuthFactory;
import com.chess.userauth.interfaces.IUserAuthFactory;

import java.util.Scanner;

import static com.chess.userauth.Utilities.*;

/**
 * @author Het Ketanbhai Shah
 */

public class LoginIO implements com.chess.userauth.interfaces.ILoginIO {

    public void getCredentials(Login login) {

        IUserAuthFactory userAuthFactory = new UserAuthFactory();
        Scanner reader = new Scanner(System.in);
        System.out.println(LOGIN_INPUT);
        System.out.print(USERID_INPUT);
        login.setUserId(reader.nextLine());
        System.out.print(PASSWORD_INPUT);
        login.setPassword(reader.nextLine());
    }

}
