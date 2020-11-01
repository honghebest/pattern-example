package com.hongghe.patternexample.visitor.domain;

/**
 * The basic people properties.
 *
 * @author hongghe 28/07/2018
 */
public abstract class User {
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String name;
    public String address;
}
