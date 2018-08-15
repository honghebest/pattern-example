package com.hongghe.patternexample.composition;

import java.util.List;

/**
 * @author hongghe
 * @date 2018/8/15
 */
public class Sentence extends LetterComposite {

    /**
     * Constructor
     */
    public Sentence(List<Word> words) {
        for (Word w : words) {
            this.add(w);
        }
    }

    @Override
    protected void printThisAfter() {
        System.out.print(".");
    }
}