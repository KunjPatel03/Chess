package com.chess.player;

import com.chess.player.interfaces.IPlayer;

public class Player implements IPlayer {
    private boolean playerHuman;
    private int color;

    @Override
    public boolean isPlayerHuman() {
        return this.playerHuman;
    }

    @Override
    public int getColor() {
        return this.color;
    }

    public boolean isLost() {
        return false;
    }

}
