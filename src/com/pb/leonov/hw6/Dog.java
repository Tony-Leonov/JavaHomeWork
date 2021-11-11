package com.pb.leonov.hw6;

import java.util.Objects;

public class Dog extends Animal {
    private String breed;

    public Dog(String name, String breed) {
        super(name);  //Вызов конструктора родительского класса
        this.breed = breed;
    }

    @Override
    public void makeNoise() {
        System.out.println("Гав - гав!");
    }

    @Override
    public void eat() {
        System.out.println(name + " ест " + food);
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "food='" + food + '\'' +
                ", location='" + location + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Dog dog = (Dog) o;
        return Objects.equals(breed, dog.breed);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), breed);
    }
}
