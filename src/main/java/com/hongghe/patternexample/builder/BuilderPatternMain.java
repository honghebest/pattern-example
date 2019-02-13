package com.hongghe.patternexample.builder;

import lombok.extern.slf4j.Slf4j;

/**
 * @author hongghe
 */
@Slf4j
public class BuilderPatternMain implements BuilderFactory {

    @Override
    public void BuilderFactory() {
        log.info("Builder factory.");
    }

    @Override
    public void toBuilder() {
        log.info("to Builder factory.");
    }
}
