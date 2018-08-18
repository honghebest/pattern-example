package com.hongghe.patternexample.consumerproduct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author hongghe 2018/8/18
 */
public class Producer implements Runnable {

    private static final Logger LOGGER = LoggerFactory.getLogger(Producer.class);

    Car car = null;
    Producer(Car car) {
        this.car = car;
    }

    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            Man man = new Man(i);
            car.push(man);
            LOGGER.info("The producer the man = {}", man.toString());

            try {
                Thread.sleep((long) (Math.random() * 1000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
