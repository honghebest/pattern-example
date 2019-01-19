package com.hongghe.patternexample.bridge;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 使用
 *
 * @author hongghe 08/08/2018
 */
@Slf4j
public class BridgeMain {

    public static void main(String[] args) {
        log.info("This is the main class of the Bridge.");
        Writer writer = new Writer(new Pen(), new Man());
        writer.takePaper();
        writer.takePen();
    }
}
