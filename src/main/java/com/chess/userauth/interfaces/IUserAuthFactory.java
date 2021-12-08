package com.chess.userauth.interfaces;

/**
 * @author Het Ketanbhai Shah
 */

public interface IUserAuthFactory {
    IHome createHome();

    ILogin createLogin();

    IRegistration createRegistration();

    IConnectToDB createConnectToDB();

    IHomeDisplay createHomeDisplay();

    IRegistrationIO createRegistrationIO();

    IRegistrationDisplay createRegistrationDisplay();

    ILoginIO createLoginIO();

    ILoginDisplay createLoginDisplay();
}
