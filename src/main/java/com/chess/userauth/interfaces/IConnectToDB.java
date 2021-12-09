package com.chess.userauth.interfaces;

import java.sql.Connection;
/**
 * @author Het Ketanbhai Shah
 */

public interface IConnectToDB {
    Connection getConnection();
}
