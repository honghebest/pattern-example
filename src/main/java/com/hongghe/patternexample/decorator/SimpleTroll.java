package com.hongghe.patternexample.decorator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author hongghe
 * @date 2018/8/16
 */
public class SimpleTroll implements Troll {

    private static final Logger LOGGER = LoggerFactory.getLogger(SimpleTroll.class);


    @Override
    public void attack() {
        LOGGER.info("The simple");
    }

    @Override
    public int getAttackPower() {
        return 10;
    }

    @Override
    public void fleeBattle() {
        LOGGER.info("The troll flee battle.");
    }
}
