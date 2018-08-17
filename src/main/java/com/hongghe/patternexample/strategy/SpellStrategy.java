package com.hongghe.patternexample.strategy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author hongghe 2018/8/17
 */
public class SpellStrategy implements DragonSlayingStrategy {

    private static final Logger LOGGER = LoggerFactory.getLogger(SpellStrategy.class);

    @Override
    public void execute() {
        LOGGER.info("You cast the spell of disintegration and the dragon vaporizes in a pile of dust!");
    }

}