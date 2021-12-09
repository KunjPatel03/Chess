package com.chess.userauth.interfaces;

/**
 * @author Het Ketanbhai Shah
 */

public interface ILogin {
    void userLogin();





    String getPassword();

    void setPassword(String password);

    boolean authenticated();

}
