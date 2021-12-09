package com.chess.userauth;

import com.chess.userauth.interfaces.IUserAuthFactory;
import org.junit.Assert;
import org.junit.Test;
/**
 * @author Het Ketanbhai Shah
 */

public class LoginTest {

    @Test
    public void authenticated() {
        IUserAuthFactory userAuthFactory = new UserAuthFactory();
        Login login = new Login();
        login.setUserId("hetshah");
        login.setPassword("123");
        Assert.assertTrue(login.authenticated());
    }
}