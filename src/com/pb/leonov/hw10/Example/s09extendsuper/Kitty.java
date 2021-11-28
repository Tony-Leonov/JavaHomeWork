package com.pb.leonov.hw10.Example.s09extendsuper;

public class Kitty extends Pet {

    public Kitty(String name) {
        super(name);
    }

    public void mew() {
        System.out.println("Котик " + name + " мяукает");
    }
}
