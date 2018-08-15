package com.hongghe.patternexample.callback;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * The lambdas callback implements.
 *
 * @author hongghe
 * @date 2018/8/15
 */
public class LambdasCallback {

    private static final Logger LOGGER = LoggerFactory.getLogger(LambdasCallback.class);

    public static void main(String[] args) {
        Task task = new SimpleTask();
        Callback callback = () -> LOGGER.info("The Done method.");
        task.executeWith(callback);
    }
}
