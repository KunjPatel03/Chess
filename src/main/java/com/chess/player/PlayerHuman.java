package com.chess.player;

import com.chess.player.interfaces.IPlayerHuman;

import static com.chess.player.Utility.TRUE;

/**
 * @author Sanjuna Konda
 */

public class PlayerHuman extends Player implements IPlayerHuman {

    private boolean playerHuman;
    private String color;

    public PlayerHuman(String color) {
        this.playerHuman = TRUE;
        this.color = color;
    }
}
