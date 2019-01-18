package com.hongghe.patternexample.strategy;

import lombok.extern.slf4j.Slf4j;

/**
 * @author hongghe 2018/8/17
 */
@Slf4j
public class Demo {
    /**
     * Program entry point
     *
     * @param args command line args
     */
    public static void main(String[] args) {
        // GoF Strategy pattern
        log.info("Green dragon spotted ahead!");
        DragonSlayer dragonSlayer = new DragonSlayer(new MeleeStrategy());
        dragonSlayer.goToBattle();
        log.info("Red dragon emerges.");
        dragonSlayer.changeStrategy(new ProjectileStrategy());
        dragonSlayer.goToBattle();
        log.info("Black dragon lands before you.");
        dragonSlayer.changeStrategy(new SpellStrategy());
        dragonSlayer.goToBattle();

        // Java 8 Strategy pattern
        log.info("Green dragon spotted ahead!");
        dragonSlayer = new DragonSlayer(
                () -> log.info("With your Excalibur you severe the dragon's head!"));
        dragonSlayer.goToBattle();
        log.info("Red dragon emerges.");
        dragonSlayer.changeStrategy(() -> log.info(
                "You shoot the dragon with the magical crossbow and it falls dead on the ground!"));
        dragonSlayer.goToBattle();
        log.info("Black dragon lands before you.");
        dragonSlayer.changeStrategy(() -> log.info(
                "You cast the spell of disintegration and the dragon vaporizes in a pile of dust!"));
        dragonSlayer.goToBattle();
    }
}
