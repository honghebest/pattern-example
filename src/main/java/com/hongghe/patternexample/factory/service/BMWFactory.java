package com.hongghe.patternexample.factory.service;

import com.hongghe.patternexample.factory.CarProduce;
import com.hongghe.patternexample.factory.domain.Car;

/**
 * 生产宝马的工厂
 *
 * @author hongghe 21/07/2018
 */
public class BMWFactory implements CarProduce {

    @Override
    public Car create() {
        return null;
    }
}
