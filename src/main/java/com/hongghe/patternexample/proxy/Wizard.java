package com.hongghe.patternexample.proxy;

/**
 * @author hongghe 2018/8/17
 */
public class Wizard {

    private final String name;

    public Wizard(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
