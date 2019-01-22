package com.hongghe.patternexample.proxy;

import lombok.extern.slf4j.Slf4j;

/**
 * @author hongghe 2018/8/17
 */
@Slf4j
public class IvoryTower implements WizardTower {

    @Override
    public void enter(Wizard wizard) {
        log.info("{} Enters the tower.", wizard);
    }

}
