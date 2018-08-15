package com.hongghe.patternexample.callback;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * The implements of callback demo.
 *
 * @author hongghe
 * @date 2018/8/15
 */
public class CallbackDemo {

    private static final Logger LOGGER = LoggerFactory.getLogger(CallbackDemo.class);

    public static void main(String[] args) {
        Task task = new SimpleTask();
        Callback callback = new Callback() {
            @Override
            public void call() {
                LOGGER.info("The Done method.");
            }
        };
        task.executeWith(callback);
    }
}
