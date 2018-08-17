package com.hongghe.patternexample.observer.generic;

/**
 * @author hongghe 2018/8/17
 */
public interface Observer<S extends Observable<S, O, A>, O extends Observer<S, O, A>, A> {

    void update(S subject, A argument);
}
