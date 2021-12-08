package com.chess.userauth.display;

public class RegistrationDisplay implements com.chess.userauth.interfaces.IRegistrationDisplay {

    @Override
    public void getRegSuccessMessage() {
        System.out.println("Thanks for the registration! You can login now");
    }

    @Override
    public void getRegFailureMessage() {
        System.out.println("Something wrong with the values you have entered. Please try to register again");
    }
}
