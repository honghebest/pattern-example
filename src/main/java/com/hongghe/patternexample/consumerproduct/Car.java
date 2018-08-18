package com.hongghe.patternexample.consumerproduct;

/**
 * @author hongghe 2018/8/18
 */
public class Car {
    int index = 0;
    // 假设一辆车可以坐4个人
    Man[] arrayMan = new Man[4];

    /**
     * 来一个人
     *
     * @param man
     */
    public synchronized void push(Man man) {
        while (index == arrayMan.length) {
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.notify();
        arrayMan[index] = man;
        index ++;
    }

    /**
     * 下来一个人
     *
     * @return
     */
    public synchronized Man pop() {
        while (index == 0) {
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.notify();
        index --;
        return arrayMan[index];
    }
}
