package com.chess.player.interfaces;

public interface IPlayerFactory {
    IPlayer createPlayer();
    IPlayerHuman createPlayerHuman();
    IPlayerComputer createPlayerComputer();
}
