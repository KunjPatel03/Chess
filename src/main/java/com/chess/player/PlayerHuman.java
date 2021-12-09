package com.chess.player;

public class PlayerHuman extends Player{
    private boolean playerHuman;
    private int color;

    public PlayerHuman(int color) {
        this.playerHuman = true;
        this.color = color;
    }
}
