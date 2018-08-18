package com.hongghe.patternexample.consumerproduct;

/**
 * @author hongghe 2018/8/18
 */
public class Demo {

    public static void main(String[] args) {
        Car car = new Car();
        Producer producer = new Producer(car);
        Consumer consumer = new Consumer(car);
        new Thread(producer).start();
        new Thread(consumer).start();
    }
}
