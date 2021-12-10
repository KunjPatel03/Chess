package com.chess.player;

import com.chess.player.interfaces.IPlayer;
import com.chess.player.interfaces.IPlayerComputer;
import com.chess.player.interfaces.IPlayerFactory;
import com.chess.player.interfaces.IPlayerHuman;

import static com.chess.player.Utility.WHITE;

/**
 * @author Sanjuna Konda
 */

public class PlayerFactory implements IPlayerFactory {

    @Override
    public IPlayer createPlayer() {
        return new Player();
    }

    @Override
    public IPlayerHuman createPlayerHuman() {
        return new PlayerHuman(WHITE);
    }

    @Override
    public IPlayerComputer createPlayerComputer() {
        return new PlayerComputer(WHITE);
    }
}
