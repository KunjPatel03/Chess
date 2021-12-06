package com.chess.userauth;

import java.sql.*;
import java.util.Scanner;

public class Login implements ILogin {
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
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter your ID and Password for Login");
        System.out.print("Enter User ID - ");
        userId = reader.nextLine();
        setUserId(userId);
        System.out.print("Enter Password - ");
        password = reader.nextLine();
        setPassword(password);
        if (authenticate()) {
            System.out.println("Welcome to the Chess! You're logged in");
        } else {
            System.out.println("Either userid or password is incorrect!");
        }
    }

    public boolean authenticate() {
        String QUERY = "SELECT count(*) as userCount FROM CSCI5308_26_DEVINT.Users where UserID =? and Password =?";
        Connection conn;
        IConnectToDB connect = new ConnectToDB();
        conn = connect.getConnection();
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
