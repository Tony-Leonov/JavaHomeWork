package com.pb.leonov.hw7.Example.s03defaultstatic;

public interface Walkable {
    default void walk() {
        System.out.println("ходьба");
    }
}
