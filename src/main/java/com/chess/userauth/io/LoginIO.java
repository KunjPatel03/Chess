package com.chess.userauth.io;

import com.chess.userauth.Login;
import com.chess.userauth.UserAuthAbstractFactory;
import com.chess.userauth.UserAuthFactory;
import com.chess.userauth.interfaces.IUserAuthFactory;

import java.util.Scanner;

/**
 * @author Het Ketanbhai Shah
 */

public class LoginIO implements com.chess.userauth.interfaces.ILoginIO {

    public void getCredentials(Login login) {
        IUserAuthFactory userAuthFactory = new UserAuthFactory();
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter your ID and Password for Login");
        System.out.print("Enter User ID - ");
        login.setUserId(reader.nextLine());
        System.out.print("Enter Password - ");
        login.setPassword(reader.nextLine());
    }
}
