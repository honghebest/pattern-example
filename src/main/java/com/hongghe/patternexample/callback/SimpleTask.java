package com.hongghe.patternexample.callback;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * The implements of task.
 *
 * @author hongghe
 * @date 2018/8/15
 */
public class SimpleTask extends Task {

    private static final Logger LOGGER = LoggerFactory.getLogger(SimpleTask.class);

    @Override
    public void execute() {
        LOGGER.info("Callback method.");
    }
}
