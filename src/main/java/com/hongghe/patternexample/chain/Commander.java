package com.hongghe.patternexample.chain;

/**
 * @author henry
 */
public class Commander  extends RequestHandler {

    public Commander(RequestHandler requestHandler) {
        super(requestHandler);
    }

    @Override
    public void handleRequest(Request req) {
        if (req.getRequestType().equals(RequestType.DEFEND_CASTLE)) {
            printHandling(req);
            req.markHandled();
        } else {
            super.handleRequest(req);
        }
    }

    @Override
    public String toString() {
        return " commander";
    }
}
