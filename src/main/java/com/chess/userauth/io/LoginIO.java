package com.chess.userauth.io;

import com.chess.userauth.UserAuthFactory;
import com.chess.userauth.interfaces.IUserAuthFactory;

import java.util.Scanner;

public class LoginIO implements com.chess.userauth.interfaces.ILoginIO {

    public void getCredentials() {
        IUserAuthFactory userAuthFactory = new UserAuthFactory();
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter your ID and Password for Login");
        System.out.print("Enter User ID - ");
        userAuthFactory.createLogin().setUserId(reader.nextLine());
        System.out.print("Enter Password - ");
        userAuthFactory.createLogin().setPassword(reader.nextLine());
    }
}
