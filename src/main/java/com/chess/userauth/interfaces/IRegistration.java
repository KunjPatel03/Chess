package com.chess.userauth.interfaces;

/**
 * @author Het Ketanbhai Shah
 */

public interface IRegistration {

    void userRegistration();

    boolean isDataInserted();

    String getPlayerName();

    void setPlayerName(String playerName);

    String getUserId();

    void setUserId(String userId);

    String getPassword();

    void setPassword(String password);

}
