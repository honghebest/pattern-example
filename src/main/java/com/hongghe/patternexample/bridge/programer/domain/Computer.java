package com.hongghe.patternexample.bridge.programer.domain;

import lombok.Builder;
import lombok.Data;

/**
 * @author: hongghe @date: 2019-01-19 13:49
 */
@Data
@Builder(builderClassName = "Builder", toBuilder = true)
public class Computer {
    private final String name;
    private final String appVersion;
}
