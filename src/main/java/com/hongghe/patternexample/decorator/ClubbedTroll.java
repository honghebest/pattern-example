package com.hongghe.patternexample.decorator;

import lombok.extern.slf4j.Slf4j;

/**
 * @author hongghe
 * @date 2018/8/16
 */
@Slf4j
public class ClubbedTroll implements Troll {

    private Troll trollDecorated;

    public ClubbedTroll(Troll troll) {
        this.trollDecorated = troll;
    }

    @Override
    public void attack() {
        trollDecorated.attack();
        log.info("Clubbed troll ");
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
