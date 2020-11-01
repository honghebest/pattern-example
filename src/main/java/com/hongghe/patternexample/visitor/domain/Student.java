package com.hongghe.patternexample.visitor.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * The student properties.
 *
 * @author hongghe 28/07/2018
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student extends User {

    @Override
    public String toString() {
        return "Student{" +
                "age='" + age + '\'' +
                '}';
    }

    public String age = "1";
}
