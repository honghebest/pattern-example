package com.hongghe.patternexample.factory.domain;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Car {
    private String name;
    private CarType type;
    private double highVelocity;
    private double averageVelocity;
}
