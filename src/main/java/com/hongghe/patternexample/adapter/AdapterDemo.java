package com.hongghe.patternexample.adapter;

/**
 * The adapter design
 *
 * @author hongghe 13/08/2018
 */
public class AdapterDemo {

    public static void main(String[] args) {
        Captain captain = new Captain(new FishingBoatAdapter());
        captain.row();
    }
}
