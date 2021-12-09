package com.chess.userauth;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;
/**
 * @author Het Ketanbhai Shah
 */

public class RegistrationTest {

    @Test
    public void dataInsertedTest() {
        Registration registration = new Registration();
        registration.setPlayerName("TestName");
        registration.setUserId("TestID");
        registration.setPassword("TestPassword");
        Assert.assertTrue(registration.isDataInserted());
    }
}