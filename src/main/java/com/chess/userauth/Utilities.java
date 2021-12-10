package com.chess.userauth;

public final class Utilities {

    public static final String WELCOME_MESSAGE = "Hello and welcome to the Chess!";
    public static final String LOGIN_MESSAGE = "Press 1 for Registration and Press 2 for Login";
    public static final String ENTER = "Enter - ";
    public static final String LOGGED_IN_MESSAGE = "Welcome to the Chess! You're logged in";
    public static final String PLAY_MESSAGE = "You can play now!";
    public static final String INCORRECT_LOGIN_MESSAGE = "Either userid or password is incorrect!";
    public static final String SUCCESSFUL_REGISTRATION_MESSAGE = "Thanks for the registration! You can login now";
    public static final String INVALID_REGISTRATION_MESSAGE = "Something wrong with the values you have entered. Please try to register again";
    public static final String REGISTRATION_INPUT = "Enter your Name, ID and password for Registration";
    public static final String NAME_INPUT = "Enter your name- ";
    public static final String USERID_INPUT = "Enter User ID - ";
    public static final String PASSWORD_INPUT = "Enter Password - ";
    public static final String LOGIN_INPUT = "Enter your ID and Password for Login";
    public static final String SELECT_QUERY = "SELECT count(*) as userCount FROM CSCI5308_26_DEVINT.Users where UserID =? and Password =?";
    public static final String INSERT_QUERY = "INSERT INTO `CSCI5308_26_DEVINT`.`Users` (`UserName`, `UserID`, `Password`) VALUES (?,?,?)";
    public static final String USERNAME = "CSCI5308_26_DEVINT_USER";
    public static final String PASSWORD = "Noo0shoox9sheequ";
    public static final String DATABASE_URL = "jdbc:mysql://db-5308.cs.dal.ca:3306?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
    public static final String UNEXPECTED_VALUE = "Unexpected value: ";
    public static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    public static final int ONE = 1;
    public static final int TWO = 2;
    public static final int THREE = 3;

}
