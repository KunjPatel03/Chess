package com.chess.userauth;

import java.sql.Connection;

public interface IConnectToDB {
    Connection getConnection();
}
