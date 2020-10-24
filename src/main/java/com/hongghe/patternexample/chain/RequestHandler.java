package com.hongghe.patternexample.chain;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author henry
 */
public abstract class RequestHandler {

    private static final Logger LOGGER = LoggerFactory.getLogger(RequestHandler.class);

    private RequestHandler requestHandler;

    public RequestHandler(RequestHandler requestHandler) {
        this.requestHandler = requestHandler;
    }

    public void  handleRequest(Request request) {
        if (requestHandler != null) {
            requestHandler.handleRequest(request);
        }
    }

    protected void printHandling(Request request) {
        LOGGER.info("{} handling request = {}", this, request);
    }

    @Override
    public abstract String toString();
}
