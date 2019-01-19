package com.hongghe.patternexample.proxy.express;

import com.hongghe.patternexample.proxy.express.domain.Packages;

/**
 * @author: hongghe @date: 2019-01-19 14:10
 */
public interface express {

    boolean send(Packages packages);

    Packages receive();
}
