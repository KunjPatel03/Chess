package com.chess.userauth;

import com.chess.userauth.display.HomeDisplay;
import com.chess.userauth.display.LoginDisplay;
import com.chess.userauth.display.RegistrationDisplay;
import com.chess.userauth.interfaces.*;
import com.chess.userauth.io.LoginIO;
import com.chess.userauth.io.RegistrationIO;

/**
 * @author Het Ketanbhai Shah
 */

public class UserAuthFactory implements com.chess.userauth.interfaces.IUserAuthFactory {

    @Override
    public IHome createHome() {
        return new Home();
    }

    @Override
    public ILogin createLogin() {
        return new Login();
    }

    @Override
    public IRegistration createRegistration() {
        return new Registration();
    }

    @Override
    public IConnectToDB createConnectToDB() {
        return new ConnectToDB();
    }

    @Override
    public IHomeDisplay createHomeDisplay() {
        return new HomeDisplay();
    }

    @Override
    public IRegistrationIO createRegistrationIO() {
        return new RegistrationIO();
    }

    @Override
    public IRegistrationDisplay createRegistrationDisplay() {
        return new RegistrationDisplay();
    }

    @Override
    public ILoginIO createLoginIO() {
        return new LoginIO();
    }

    @Override
    public ILoginDisplay createLoginDisplay() {
        return new LoginDisplay();
    }
}
