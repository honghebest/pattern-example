package com.hongghe.patternexample.visitor.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 学习的实例
 *
 * @author hongghe 28/07/108
 */
public class Learning {

    private static final Logger LOGGER = LoggerFactory.getLogger(Learning.class);

    public <T> void init(T user) {
        LOGGER.info("The init of the user study.");
    }
}
