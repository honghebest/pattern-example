package com.hongghe.patternexample.proxy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author hongghe 2018/8/17
 */
public class IvoryTower implements WizardTower {

    private static final Logger LOGGER = LoggerFactory.getLogger(IvoryTower.class);

    @Override
    public void enter(Wizard wizard) {
        LOGGER.info("{} enters the tower.", wizard);
    }

}
