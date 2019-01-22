package com.hongghe.patternexample.proxy;

/**
 * @author hongghe 2018/8/17
 */
public class Demo {

    public static void main(String[] args) {
        WizardTowerProxy proxy = new WizardTowerProxy(new IvoryTower());
        proxy.enter(new Wizard("Red wizard"));
        proxy.enter(new Wizard("White wizard"));
        proxy.enter(new Wizard("Black wizard"));
        proxy.enter(new Wizard("Green wizard"));
        proxy.enter(new Wizard("Brown wizard"));
        System.out.println(new Wizard("Red wizard").toString());
    }
}
