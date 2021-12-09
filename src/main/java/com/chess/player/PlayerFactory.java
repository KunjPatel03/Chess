package com.chess.player;

import com.chess.player.interfaces.IPlayer;
import com.chess.player.interfaces.IPlayerComputer;
import com.chess.player.interfaces.IPlayerFactory;
import com.chess.player.interfaces.IPlayerHuman;

/**
 * @author Sanjuna Konda
 */

public class PlayerFactory implements IPlayerFactory {
    private Utility utility;

    @Override
    public IPlayer createPlayer() {
        return new Player();
    }

    @Override
    public IPlayerHuman createPlayerHuman() {
        return new PlayerHuman(utility.WHITE);
    }

    @Override
    public IPlayerComputer createPlayerComputer() {
        return new PlayerComputer(utility.WHITE);
    }
}
