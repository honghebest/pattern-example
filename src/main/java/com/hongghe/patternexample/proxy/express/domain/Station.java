package com.hongghe.patternexample.proxy.express.domain;

import lombok.Builder;
import lombok.Data;

/**
 * @author: hongghe @date: 2019-01-19 14:09
 */
@Data
@Builder(builderClassName = "Builder", toBuilder = true)
public class Station {
    private String address;
}
