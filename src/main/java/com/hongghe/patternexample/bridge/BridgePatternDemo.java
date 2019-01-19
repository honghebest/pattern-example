package com.hongghe.patternexample.bridge;

/**
 * @author: hongghe @date: 2019-01-19 13:43
 */
public class BridgePatternDemo {

    public static void main(String[] args) {
        Writer writer = new Writer(new Pen(), new Man());
        writer.takePaper();
        writer.takePen();
    }
}
