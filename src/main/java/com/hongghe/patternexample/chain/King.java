package com.hongghe.patternexample.chain;

public class King {

    RequestHandler requestHandler;

    public King() {
        buildChain();
    }

    public void buildChain() {
        requestHandler = new Commander(new Officer(new Soldier(null)));
    }

    public void makeRequest(Request request) {
        requestHandler.handleRequest(request);
    }
}
