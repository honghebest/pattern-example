package com.hongghe.patternexample.decorator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author hongghe
 * @date 2018/8/16
 */
public class ClubbedTroll implements Troll {

    private static final Logger LOGGER = LoggerFactory.getLogger(ClubbedTroll.class);

    private Troll trollDecorated;

    public ClubbedTroll(Troll troll) {
        this.trollDecorated = troll;
    }

    @Override
    public void attack() {
        trollDecorated.attack();
        LOGGER.info("Clubbed troll ");
    }

    @Override
    public int getAttackPower() {
        return trollDecorated.getAttackPower() + 10;
    }

    @Override
    public void fleeBattle() {
        trollDecorated.fleeBattle();
    }
}
