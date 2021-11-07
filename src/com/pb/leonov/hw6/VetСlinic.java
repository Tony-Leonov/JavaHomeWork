package com.pb.leonov.hw6;


import static com.pb.leonov.hw6.Animals.*;

public class VetСlinic {
    public static void main(String[] args) {
        Animals animal1 = new Cat("корм","дом");
        Animals animal2 = new Dog("мясо","будка");
        Animals animal3 = new Horse("овёс","конюшня");

         animal1.makeNoise(); animal1.eat();animal1.sleep();  animal1.location();
         animal2.makeNoise(); animal2.eat(); animal2.sleep(); animal2.location();
         animal3.makeNoise(); animal3.eat(); animal3.sleep(); animal3.location();
    }
}
