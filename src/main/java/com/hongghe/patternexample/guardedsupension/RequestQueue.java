package com.hongghe.patternexample.guardedsupension;

import com.hongghe.patternexample.chain.Request;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 考虑这么一个伺服器，它可以处理来自多个客户端的服务请求（Request），
 * 为了不丢失客户的请求，它要维持一个缓冲区，客户的请求会先储存至缓冲区中，
 * 而伺服器会从缓冲区中取出请求并执行，如果缓冲区中没有请求，则伺服器就等待，
 * 直到被通知有新的请求存入缓冲区中，伺服器再度进行请求的执行。
 *
 * @author hongghe 2018/8/18
 */
public class RequestQueue {

    private Queue queue = new LinkedList();

    public RequestQueue() {
        queue = new LinkedList();
    }

    public synchronized Request getRequest() {
        while (queue.size() <= 0) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        return (Request) queue.remove();
    }

    public synchronized void putRequest(Request request) {
        queue.add(request);
        notifyAll();
    }
}
