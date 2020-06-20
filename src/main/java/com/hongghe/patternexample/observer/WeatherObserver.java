package com.hongghe.patternexample.observer;

/**
 * @author hongghe 2018/8/17
 */
public interface WeatherObserver {

    /**
     * 更新操作
     *
     * @param currentWeather current weather
     */
    void update(WeatherType currentWeather);
}