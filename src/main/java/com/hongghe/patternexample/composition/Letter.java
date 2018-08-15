package com.hongghe.patternexample.composition;

/**
 * @author hongghe
 * @date 2018/8/15
 */
public class Letter  extends LetterComposite {

    private char c;

    public Letter(char c) {
        this.c = c;
    }

    @Override
    protected void printThisBefore() {
        System.out.print(c);
    }
}
