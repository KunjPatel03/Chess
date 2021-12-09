package com.chess.userauth;

import com.chess.userauth.interfaces.IRegistration;
import com.chess.userauth.interfaces.IUserAuthFactory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * @author Het Ketanbhai Shah
 */

public class Registration implements IRegistration {

    IUserAuthFactory userAuthFactory = new UserAuthFactory();

    String playerName;
    String userId;
    String password;

    @Override
    public String getPlayerName() {
        return playerName;
    }

    @Override
    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    @Override
    public String getUserId() {
        return userId;
    }

    @Override
    public void setUserId(String userId) {
        this.userId = userId;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public void setPassword(String password) {
        this.password = password;
    }

    public void userRegistration() {


        // Getting user details in input

        userAuthFactory.createRegistrationIO().getDetails(this);

        if (isDataInserted()) {
            userAuthFactory.createRegistrationDisplay().getRegSuccessMessage();
            userAuthFactory.createHome().indexPart();
        } else {
            userAuthFactory.createRegistrationDisplay().getRegFailureMessage();
            userRegistration();
        }
    }

    public boolean isDataInserted() {

        String QUERY = "INSERT INTO `CSCI5308_26_DEVINT`.`Users` (`UserName`, `UserID`, `Password`) VALUES (?,?,?)";

        Connection conn;
        conn = userAuthFactory.createConnectToDB().getConnection();
        PreparedStatement preparedStmt = null;
        try {
            preparedStmt = conn.prepareStatement(QUERY);
            preparedStmt.setString(1, getPlayerName());
            preparedStmt.setString(2, getUserId());
            preparedStmt.setString(3, getPassword());
            preparedStmt.execute();
            conn.close();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

}
