package com.hongghe.patternexample.factory.service;

import com.hongghe.patternexample.factory.CarProduce;
import com.hongghe.patternexample.factory.domain.Car;

/**
 * 生产奥迪汽车的工厂
 *
 * @author hongghe 21/07/2018
 */
public class AudiFactory implements CarProduce {

    public AudiFactory() {

    }

    @Override
    public Car create() {
        return null;
    }
}
