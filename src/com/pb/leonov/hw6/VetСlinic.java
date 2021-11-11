package com.pb.leonov.hw6;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class VetСlinic {
    public static void main(String[] args) throws Exception {
        Cat cat = new Cat("Васька", "Белый");
        cat.setFood("Молоко и мясо");
        cat.setLocation("Дом");

        Cat cat2 = new Cat("Черныш", "Черный");
        cat2.setFood("Молоко и мыши");
        cat2.setLocation("Улица");

        Horse horse = new Horse("Барс", "Мустанг");
        horse.setFood("Овёс");
        horse.setLocation("Загон");

        Dog dog = new Dog ("Ричи", "Лабрадор");
        dog.setFood("Корм и мясо");
        dog.setLocation("Вольер");


        Animal[] animals = new Animal[] {cat, cat2, horse, dog};

        Class clazz = Class.forName("com.pb.leonov.hw6.Veterinarian");
        Constructor constr = clazz.getConstructor();
        Object vet =  constr.newInstance();

        Method treatAnimal = clazz.getMethod("treatAnimal", Animal.class);

        for (Animal animal: animals) {

            treatAnimal.invoke(vet, animal);
        }

    }
}
