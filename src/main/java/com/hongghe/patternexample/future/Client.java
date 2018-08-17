package com.hongghe.patternexample.future;

/**
 * @author hongghe 2018/8/17
 */
public class Client {
    public static void main(String[] args) {
        Server server = new Server();
        FutureData<String> futureData = server.getString();
        //先执行其他操作
        String hello = "hello";
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.print(hello + " " + futureData.getData());
    }
}
