package com.hongghe.patternexample.factory;

import com.hongghe.patternexample.factory.domain.Car;
import com.hongghe.patternexample.factory.service.AudiFactory;
import com.hongghe.patternexample.factory.service.BMWFactory;
import com.hongghe.patternexample.factory.service.BenzFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 工厂模式
 *
 * @author hongghe 21/07/2018
 */
public class CarFactory {

    private static final Logger logger = LoggerFactory.getLogger(CarFactory.class);

    public static CarProduce produce(Car car) throws Exception {
        switch (car.getType()) {
            case AUDI:
                return new AudiFactory();
            case BMW:
                return new BMWFactory();
            case BENZ:
                return new BenzFactory();
            default:
                throw new Exception("Sorry the produce is not exist");
        }
    }
}
