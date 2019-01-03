package com.hongghe.patternexample.bridge;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * The Man of writing.
 *
 * @author hongghe 09/08/2018
 */
@Slf4j
public class Writer implements Writing {

    private Pen pen;
    private Man man;

    public Writer(Pen pen, Man man) {
        this.man = man;
        this.pen = pen;
    }

    @Override
    public void takePaper() {
        log.info(" Get the paper.");
    }

    @Override
    public void takePen() {
        log.info("Get the pen.");
    }
}
