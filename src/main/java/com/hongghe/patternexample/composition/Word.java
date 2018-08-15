package com.hongghe.patternexample.composition;

import java.util.List;

/**
 * @author hongghe
 * @date 2018/8/15
 */
public class Word extends LetterComposite {

    /**
     * Constructor
     */
    public Word(List<Letter> letters) {
        for (Letter l : letters) {
            this.add(l);
        }
    }

    @Override
    protected void printThisBefore() {
        System.out.print(" ");
    }
}