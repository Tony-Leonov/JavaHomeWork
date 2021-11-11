package com.pb.leonov.hw6.hw_test;

public class Animal {

    public void voice() {
        System.out.println("Голос!");
    }
}

class Bear extends Animal {
    @Override
    public void voice() {
        System.out.println("Р-р-р!");
    }
}
class Cat extends Animal {

    @Override
    public void voice() {
        System.out.println("Мяу!");
    }
}

class Dog extends Animal {

    @Override
    public void voice() {
        System.out.println("Гав!");
    }
}


class Snake extends Animal {

    @Override
    public void voice() {
        System.out.println("Ш-ш-ш!");
    }
}