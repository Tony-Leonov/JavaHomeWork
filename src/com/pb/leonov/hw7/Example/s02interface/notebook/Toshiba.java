package com.pb.leonov.hw7.Example.s02interface.notebook;

public abstract class Toshiba extends Notebook {
    public Toshiba() {
        super("Toshiba");
    }

    @Override
    public void displayLogo() {
        System.out.println("LOGO TOSHIBA");
    }
}