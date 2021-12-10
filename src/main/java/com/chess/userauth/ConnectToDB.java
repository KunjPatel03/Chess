package com.chess.userauth;

import com.chess.userauth.interfaces.IConnectToDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import static com.chess.userauth.Utilities.*;

/**
 * @author Het Ketanbhai Shah
 */

public class ConnectToDB implements IConnectToDB {

    @Override
    public Connection getConnection() {
        final String DB_URL = DATABASE_URL;
        final String USER = USERNAME;
        final String PASS = PASSWORD;
        try {
            Class.forName(JDBC_DRIVER);
            Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
            return conn;
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

}




