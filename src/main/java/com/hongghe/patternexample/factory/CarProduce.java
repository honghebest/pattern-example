package com.hongghe.patternexample.factory;

import com.hongghe.patternexample.factory.domain.Car;

/**
 * 生产汽车的方法接口
 *
 * @author hongghe 21/07/2018
 */
public interface CarProduce {

    abstract Car create();
}
