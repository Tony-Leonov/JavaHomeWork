package com.pb.leonov.hw10.Example.s09extendsuper;

public class Doge extends Pet {

    public Doge(String name) {
        super(name);
    }

    public void bark() {
        System.out.println("Собачонок " + name + " гавкает");
    }
}
