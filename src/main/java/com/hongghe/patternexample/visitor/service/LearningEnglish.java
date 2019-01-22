package com.hongghe.patternexample.visitor.service;

import com.google.gson.Gson;
import com.hongghe.patternexample.visitor.domain.Student;
import com.hongghe.patternexample.visitor.domain.Worker;
import lombok.extern.slf4j.Slf4j;

/**
 * The study english.
 *
 * @author hongghe 28/07/2018
 */
@Slf4j
public class LearningEnglish  extends Learning {

    @Override
    public <User> void init(User user) {
        if (user instanceof Student) {
            System.out.println("You are student.");
        } else if (user instanceof Worker) {
            System.out.println("You ara worker.");
        }

        System.out.println(new Gson().toJson(user));
        log.info("The study english init.");
    }

    public static void main(String[] args) {
        LearningEnglish learningEnglish = new LearningEnglish();
        learningEnglish.<Student>init(new Student("2"));

        LearningEnglish work = new LearningEnglish();
        work.init(new Worker("3", "2", "1"));
    }
}
