package com.hongghe.patternexample.bridge;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * The Man of writing.
 *
 * @author hongghe 09/08/2018
 */
public class Writer implements Writing {

    private static final Logger LOGGER = LoggerFactory.getLogger(Writer.class);

    private Pen pen;
    private Man man;

    private Writer(Pen pen, Man man) {
        this.man = man;
        this.pen = pen;
    }

    @Override
    public void takePaper() {
        LOGGER.info(" Get the paper.");
    }

    @Override
    public void takePen() {
        LOGGER.info("Get the pen.");
    }
}
