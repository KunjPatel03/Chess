package com.chess.player;

/**
 * @author Sanjuna Konda
 */

public class PlayerHuman extends Player{
    private boolean playerHuman;
    private int color;
    private Utility utility;

    public PlayerHuman(int color) {
        this.playerHuman = utility.TRUE;
        this.color = color;
    }
}
