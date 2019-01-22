package com.hongghe.patternexample.visitor.service;

import lombok.extern.slf4j.Slf4j;

/**
 * 学习的实例
 *
 * @author hongghe 28/07/108
 */
@Slf4j
public class Learning {

    public <T> void init(T user) {
        log.info("The init of the user study.");
    }
}
