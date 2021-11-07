package com.pb.leonov.hw6;

public class Veterinarian {

    private String animal;

    public Veterinarian (String animal) {
        this.animal = animal;
    }

    public void treatAnimal(Animal animal) {
        System.out.println("Поступление к ветеринару:");
        System.out.println(animal.getLocation());
        System.out.println(animal.getFood());
    }


}
