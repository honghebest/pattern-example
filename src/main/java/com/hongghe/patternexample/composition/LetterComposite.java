package com.hongghe.patternexample.composition;

import java.util.ArrayList;
import java.util.List;

/**
 * @author hongghe
 * @date 2018/8/15
 */
public class LetterComposite {

    private List<LetterComposite> children = new ArrayList<>();

    public void add(LetterComposite letter) {
        children.add(letter);
    }

    public int count() {
        return children.size();
    }

    protected void printThisBefore() {}

    protected void printThisAfter() {}

    /**
     * Print
     */
    public void print() {
        printThisBefore();
        for (LetterComposite letter : children) {
            letter.print();
        }
        printThisAfter();
    }
}
