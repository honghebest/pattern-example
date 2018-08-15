package com.hongghe.patternexample.callback;

/**
 * The task of callback.
 *
 * @author hongghe
 * @date 2018/8/15
 */
public abstract class Task {

    public final void executeWith(Callback callback) {
        execute();
        if (callback != null) {
            callback.call();
        }
    }

    public abstract void execute();
}
