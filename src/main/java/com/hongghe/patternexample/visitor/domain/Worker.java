package com.hongghe.patternexample.visitor.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * The properties of worker.
 *
 * @author hongghe 28/07/2018
 */
@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Worker extends User {

    public String workerAddress;
    public String workerHouseAddress;

    public Worker(String s, String s1, String s2) {
        super();
    }
}
