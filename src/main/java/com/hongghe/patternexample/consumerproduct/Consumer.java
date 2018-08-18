package com.hongghe.patternexample.consumerproduct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author hongghe 2018/8/18
 */
public class Consumer implements Runnable {

    private static final Logger LOGGER = LoggerFactory.getLogger(Consumer.class);

    Car car = null;
    Consumer(Car car) {
        this.car = car;
    }

    @Override
    public void run() {
        for (int i=0; i<20; i++) {
            Man man = car.pop();
            LOGGER.info("The consumer man = {}",man.toString());
        }
    }
}
