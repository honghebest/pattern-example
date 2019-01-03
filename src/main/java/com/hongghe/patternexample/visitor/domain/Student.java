package com.hongghe.patternexample.visitor.domain;

import lombok.Data;

/**
 * The student properties.
 *
 * @author hongghe 28/07/2018
 */
@Data
public class Student extends User {
    public String age;

    public Student(String age) {
        this.age = age;
    }
}
