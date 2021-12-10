package com.chess.player;

import com.chess.player.interfaces.IPlayer;

/**
 * @author Sanjuna Konda
 */

public class Player implements IPlayer {
    private boolean playerHuman;
    private String color;


    @Override
    public String getColor() {
        return this.color;
    }
}
