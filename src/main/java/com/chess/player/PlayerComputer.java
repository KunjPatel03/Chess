package com.chess.player;

import com.chess.player.interfaces.IPlayerComputer;

public class PlayerComputer extends Player implements IPlayerComputer {
    private boolean playerHuman;
    private String color;
    private Utility utility;

    public PlayerComputer(String color) {
        this.playerHuman = utility.FALSE;
        this.color = color;
    }

}
