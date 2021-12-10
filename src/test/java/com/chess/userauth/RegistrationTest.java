package com.chess.userauth;

import org.junit.Assert;
import org.junit.Test;

import static com.chess.Utilites.*;

/**
 * @author Het Ketanbhai Shah
 */

public class RegistrationTest {

    @Test
    public void dataInsertedTest() {
        Registration registration = new Registration();
        registration.setPlayerName(TESTNAME);
        registration.setUserId(TESTID);
        registration.setPassword(TESTREGPSWD);
        Assert.assertTrue(registration.isDataInserted());
    }
}