package com.hongghe.patternexample.adapter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FishingBoat {

    private static final Logger LOGGER = LoggerFactory.getLogger(FishingBoat.class);

    public void sail() {
        LOGGER.info("The fishing boat is sailing.");
    }
}
