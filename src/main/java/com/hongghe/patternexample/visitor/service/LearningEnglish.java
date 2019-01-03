package com.hongghe.patternexample.visitor.service;

import com.google.gson.Gson;
import com.hongghe.patternexample.visitor.domain.Student;
import com.hongghe.patternexample.visitor.domain.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * The study english.
 *
 * @author hongghe 28/07/2018
 */
public class LearningEnglish  extends Learning {

    private static final Logger LOGGER = LoggerFactory.getLogger(LearningEnglish.class);

    @Override
    public <User> void init(User user) {
        System.out.println(new Gson().toJson(user));
        LOGGER.info("The study english init.");
    }


    public static void main(String[] args) {
        LearningEnglish learningEnglish = new LearningEnglish();
        learningEnglish.<Student>init(new Student("2"));
    }
}
