package com.hongghe.patternexample.consumerproduct;

import lombok.Data;

/**
 * @author hongghe 2018/8/18
 */
@Data
public class Man {
    Integer id;
    Man(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "man:" + id;
    }
}
