package com.chess.player;

import com.chess.player.interfaces.IPlayerHuman;

public class PlayerHuman extends Player implements IPlayerHuman {
    private boolean playerHuman;
    private String color;
    private Utility utility;

    public PlayerHuman(String color) {
        this.playerHuman = utility.TRUE;
        this.color = color;
    }
}
