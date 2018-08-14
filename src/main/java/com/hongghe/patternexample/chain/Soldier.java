package com.hongghe.patternexample.chain;

public class Soldier extends RequestHandler {

    public Soldier(RequestHandler requestHandler) {
        super(requestHandler);
    }

    @Override
    public void handleRequest(Request request) {
        if (request.getRequestType().equals(RequestType.COLLECT_TAX)) {
            printHandling(request);
            request.markHandled();
        } else {
            super.handleRequest(request);
        }
    }

    @Override
    public String toString() {
        return " soldier";
    }
}
