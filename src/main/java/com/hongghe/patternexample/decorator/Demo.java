package com.hongghe.patternexample.decorator;

/**
 * 装饰者模式的实现
 *
 * @author hongghe
 * @date 2018/8/16
 */
public class Demo {

    public static void main(String[] args) {
        // 实现简单的
        Troll troll = new SimpleTroll();
        troll.attack();
        troll.fleeBattle();

        // 实现clubbed
        troll = new ClubbedTroll(troll);
        troll.attack();
        troll.fleeBattle();
    }
}
