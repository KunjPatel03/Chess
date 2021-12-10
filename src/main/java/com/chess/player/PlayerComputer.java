package com.chess.player;

/**
 * @author Sanjuna Konda
 */

import com.chess.player.interfaces.IPlayerComputer;

import static com.chess.player.Utility.FALSE;
import static com.chess.player.Utility.TRUE;

public class PlayerComputer extends Player implements IPlayerComputer {

    private boolean playerHuman=TRUE;
    private String color;

    public PlayerComputer(String color) {
        this.playerHuman = FALSE;
        this.color = color;
    }

}
