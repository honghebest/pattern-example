package com.hongghe.patternexample.proxy;

import lombok.ToString;

/**
 * @author hongghe 2018/8/17
 */
@ToString
public class Wizard {

    private final String name;

    public Wizard(String name) {
        this.name = name;
    }
}
