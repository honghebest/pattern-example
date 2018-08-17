package com.hongghe.patternexample.observer;

/**
 * @author hongghe 2018/8/17
 */
public interface WeatherObserver {
    void update(WeatherType currentWeather);
}