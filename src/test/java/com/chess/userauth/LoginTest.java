package com.chess.userauth;

import org.junit.Assert;
import org.junit.Test;

import static com.chess.Utilites.TESTPSWD;
import static com.chess.Utilites.USERID;

/**
 * @author Het Ketanbhai Shah
 */

public class LoginTest {

    @Test
    public void authenticated() {
        Login login = new Login();
        login.setUserId(USERID);
        login.setPassword(TESTPSWD);
        Assert.assertTrue(login.authenticated());
    }
}