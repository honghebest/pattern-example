package com.hongghe.patternexample.visitor.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * The student properties.
 *
 * @author hongghe 28/07/2018
 */
@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Student extends User {
    public String age;
}
