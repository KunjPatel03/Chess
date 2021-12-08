package com.chess.userauth;

import com.chess.userauth.interfaces.ILogin;
import com.chess.userauth.interfaces.IUserAuthFactory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author Het Ketanbhai Shah
 */

public class Login implements ILogin {
    IUserAuthFactory userAuthFactory = new UserAuthFactory();

    String userId;
    String password;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void userLogin() {
        userAuthFactory.createLoginIO().getCredentials();
        if (authenticated()) {
            userAuthFactory.createLoginDisplay().getLoginSuccessMessage();
        } else {
            userAuthFactory.createLoginDisplay().getLoginFailureMessage();
            userLogin();
        }
    }

    public boolean authenticated() {
        String QUERY = "SELECT count(*) as userCount FROM CSCI5308_26_DEVINT.Users where UserID =? and Password =?";
        Connection conn;
        conn = userAuthFactory.createConnectToDB().getConnection();
        ResultSet rs = null;
        PreparedStatement preparedStmt = null;
        try {
            preparedStmt = conn.prepareStatement(QUERY);
            preparedStmt.setString(1, getUserId());
            preparedStmt.setString(2, getPassword());
            rs = preparedStmt.executeQuery();
            if (rs.next() == true) {
                if (rs.getInt("userCount") > 0) {
                    return true;
                } else {
                    return false;
                }
            } else {
                return false;
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
}
