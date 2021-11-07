package com.pb.leonov.hw6;


import static com.pb.leonov.hw6.Animal.*;

public class VetСlinic {
    public static void main(String[] args) {
        Animal animal1 = new Cat("корм","дом");
        Animal animal2 = new Dog("мясо","будка");
        Animal animal3 = new Horse("овёс","конюшня");

         animal1.makeNoise(); animal1.eat(); animal1.sleep(); animal1.location();
         animal2.makeNoise(); animal2.eat(); animal2.sleep(); animal2.location();
         animal3.makeNoise(); animal3.eat(); animal3.sleep(); animal3.location();


         String[] all_animal = {"Cat", "Dog", "Horse"};

            for (int i = 0; i < 3; i++) {
               System.out.println(all_animal[i]);
               String animal = all_animal[i];
               Veterinarian animals = new Veterinarian("");
               animals.treatAnimal(animal1);
               System.out.println("----------------");
            }

    }
}
