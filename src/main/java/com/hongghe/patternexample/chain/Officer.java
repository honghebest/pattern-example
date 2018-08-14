package com.hongghe.patternexample.chain;

public class Officer extends RequestHandler {

    public Officer(RequestHandler requestHandler) {
        super(requestHandler);
    }

    @Override
    public void handleRequest(Request request) {
        if (request.getRequestType().equals(RequestType.TORTURE_PRISONER)) {
            printHandling(request);
            request.markHandled();
        } else {
            super.handleRequest(request);
        }
    }

    @Override
    public String toString() {
        return null;
    }
}
