package com.hongghe.patternexample.strategy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author hongghe 2018/8/17
 */
public class MeleeStrategy implements DragonSlayingStrategy {

    private static final Logger LOGGER = LoggerFactory.getLogger(MeleeStrategy.class);

    @Override
    public void execute() {
        LOGGER.info("With your Excalibur you sever the dragon's head!");
    }
}
