package com.chess.userauth;

import java.sql.Connection;
/**
 * @author Het Ketanbhai Shah
 */

public interface IConnectToDB {
    Connection getConnection();
}
