package com.hongghe.patternexample.proxy.express.domain;

import lombok.Builder;
import lombok.Data;

/**
 * @author: hongghe @date: 2019-01-19 14:08
 */
@Data
@Builder(builderClassName = "Builder", toBuilder = true)
public class Packages {
    private String key;
    private double weight;
    private String sendDate;
    private String receivedDate;
}
