package com.chess.userauth;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;

public class ConnectToDB implements IConnectToDB {
    @Override
    public Connection getConnection() {
        final String DB_URL = "jdbc:mysql://db-5308.cs.dal.ca:3306?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
        final String USER = "CSCI5308_26_DEVINT_USER";
        final String PASS = "Noo0shoox9sheequ";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
            return conn;
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}

            /*Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(QUERY);
            ResultSetMetaData metadata = rs.getMetaData();
            int columnCount = metadata.getColumnCount();

            while (rs.next()) {
                for (int i = 1; i <= columnCount; i++) {
                    System.out.println(rs.getString(i));
                }
            }
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }*/


