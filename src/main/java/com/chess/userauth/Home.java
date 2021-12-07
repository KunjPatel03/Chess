package com.chess.userauth;

import java.util.Scanner;
/**
 * @author Het Ketanbhai Shah
 */

public class Home implements IHome {
    @Override
    public void indexPart() {
        Scanner reader = new Scanner(System.in);
        System.out.println("Hello and welcome to the Chess!");
        System.out.println();
        System.out.println("Press 1 for Registration and Press 2 for Login");
        System.out.print("Enter - ");
        int n = reader.nextInt();
        switch (n) {
            case 1:
                IRegistration reg = new Registration();
                reg.userRegistration();
                break;
            case 2:
                ILogin login = new Login();
                login.userLogin();
                break;
        }
    }
}
