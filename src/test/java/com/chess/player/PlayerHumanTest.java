package com.chess.player;

import com.chess.player.interfaces.IPlayerFactory;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author Sanjuna Konda
 */

public class PlayerHumanTest {
    IPlayerFactory playerFactory = new PlayerFactory();

    @Test
    public void testPlayerHumanNotNull() {
        Assert.assertNotNull(playerFactory.createPlayerHuman());
    }
}
