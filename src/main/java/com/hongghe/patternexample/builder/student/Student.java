package com.hongghe.patternexample.builder.student;

import com.hongghe.patternexample.builder.student.domain.Notebook;
import com.hongghe.patternexample.builder.student.domain.Pen;

/**
 * @author: hongghe @date: 2019-01-19 13:59
 */
public class Student implements Man, Writing {

    private Pen pen;

    private Notebook notebook;

    @Override
    public void eat() {

    }

    @Override
    public void sleep() {

    }

    @Override
    public void work() {

    }

    @Override
    public void student(Writing writing) {

    }
}
