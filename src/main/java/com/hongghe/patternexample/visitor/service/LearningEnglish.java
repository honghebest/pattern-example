package com.hongghe.patternexample.visitor.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * The study english.
 *
 * @author hongghe 28/07/2018
 */
public class LearningEnglish  extends Learning {

    private static final Logger LOGGER = LoggerFactory.getLogger(LearningEnglish.class);

    @Override
    public void init() {
        LOGGER.info("The study english init.");
    }
}
