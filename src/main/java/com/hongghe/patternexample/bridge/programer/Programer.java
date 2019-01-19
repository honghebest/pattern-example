package com.hongghe.patternexample.bridge.programer;

import com.hongghe.patternexample.bridge.programer.domain.Computer;

/**
 * @author: hongghe @date: 2019-01-19 13:47
 */
public class Programer implements Coding, Eating {

    @Override
    public boolean codeSuccess(Computer computer) {
        return false;
    }

    @Override
    public void breakfirst() {

    }

    @Override
    public void lunch() {

    }
}
