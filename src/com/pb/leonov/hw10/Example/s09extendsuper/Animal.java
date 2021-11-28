package com.pb.leonov.hw10.Example.s09extendsuper;

public class Animal {

    protected final String name;

    public Animal(String name) {
        this.name = name;
    }

    public void feed() {
        System.out.println(name + " - кушает");
    }
}
