package com.hongghe.patternexample.chain;

/**
 * @author honghe zhang
 * @date 2018/8/14
 */
public class ChainDemo {

    public static void main(String[] args) {
        King king = new King();
        king.makeRequest(new Request(RequestType.DEFEND_CASTLE, "default castle"));
    }
}
