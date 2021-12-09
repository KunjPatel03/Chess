package com.chess.player;

import com.chess.player.interfaces.IPlayerFactory;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author Sanjuna Konda
 */

public class PlayerComputerTest {
    IPlayerFactory playerFactory = new PlayerFactory();
    @Test
    public void testPlayerComputerNotNull() {
        Assert.assertNotNull(playerFactory.createPlayerComputer());
    }
}