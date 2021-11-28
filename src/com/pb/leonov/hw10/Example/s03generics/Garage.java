package com.pb.leonov.hw10.Example.s03generics;

public class Garage<T> {

    private T vehicle;

    public T get() {
        return vehicle;
    }

    public void set(T vehicle) {
        this.vehicle = vehicle;
    }
}
