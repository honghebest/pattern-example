package com.hongghe.patternexample.observer;

/**
 * @author hongghe 2018/8/17
 */
public enum WeatherType {

    SUNNY, RAINY, WINDY, COLD;

    @Override
    public String toString() {
        return this.name().toLowerCase();
    }
}