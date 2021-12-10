package com.chess.player.interfaces;

/**
 * @author Sanjuna Konda
 */

public interface IPlayerFactory {

    IPlayer createPlayer();

    IPlayerHuman createPlayerHuman();

    IPlayerComputer createPlayerComputer();
}
