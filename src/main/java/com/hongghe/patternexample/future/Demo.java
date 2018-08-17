package com.hongghe.patternexample.future;

import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * @author hongghe 2018/8/18
 */
public class Demo {

    // 计算两个List<Integer>中的数的总和的时候就可以用Future模式提高效率:
    public int getTotal(final List<Integer> a, final List<Integer> b) throws ExecutionException, InterruptedException {
        Future<Integer> future = Executors.newCachedThreadPool().submit(new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                int r = 0;
                for (int num : a) {
                    r += num;
                }
                return r;
            }
        });

        int r = 0;
        for (int num : b) {
            r += num;
        }
        return r + future.get();
    }
}
