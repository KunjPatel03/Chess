package com.chess.userauth;

import java.sql.*;
import java.util.Scanner;

/**
 * @author Het Ketanbhai Shah
 */

public class Registration implements IRegistration {
    String playerName;
    String userId;
    String password;

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

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

    public void userRegistration() {

        IHome home = new Home();

        Scanner reader = new Scanner(System.in);
        System.out.println("Enter your Name, ID and password for Registration");
        System.out.print("Enter your name- ");
        playerName = reader.nextLine();
        setPlayerName(playerName);
        System.out.print("Enter User ID - ");
        userId = reader.nextLine();
        setUserId(userId);
        System.out.print("Enter Password - ");
        password = reader.nextLine();
        setPassword(password);
        if (insertData()) {
            System.out.println("Thanks for the registration! You can login now");
            home.indexPart();
        } else {
            System.out.println("Something wrong with the values you have entered. Please try to register again");
            userRegistration();
        }
    }

    public boolean insertData() {
        String QUERY = "INSERT INTO `CSCI5308_26_DEVINT`.`Users` (`UserName`, `UserID`, `Password`) VALUES (?,?,?)";

        Connection conn;
        IConnectToDB connect = new ConnectToDB();
        conn = connect.getConnection();
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
