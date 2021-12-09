package com.chess.userauth;

public abstract class UserAuthAbstractFactory {
    private static UserAuthAbstractFactory factoryInstance;

    public static UserAuthAbstractFactory getInstance() {
        if (factoryInstance == null) {
            factoryInstance = new UserAuthFactory();
        }
        return factoryInstance;
    }

}
