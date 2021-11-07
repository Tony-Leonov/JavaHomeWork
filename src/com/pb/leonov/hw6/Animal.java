package com.pb.leonov.hw6;

public class Animal {

    public Animal (String food, String location) {
        this.food = food;
        this.location = location;
    }

    private String food;
    private String location;


    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

        public void makeNoise() { //Издает звуки
        }

        public void eat() { // Ест
        }

        public void sleep() { //Спит
        }

        public void location() { //Спит
        }

        String B = "на локации ";
        String C = "издает звук ";
        String D = "ест ";
        String E = "спит";

    static class Cat extends Animal {
        String specificity = "Шерсть";
        String A = "Кошка ";
        int hCode = A.hashCode();

        public Cat(String food, String location) {
            super(food, location);
        }

        @Override
        public void makeNoise() {
            System.out.println(A + C + "мяу");
        }
        @Override
        public void eat() {
            System.out.println(A  + D + getFood());
        }
        @Override
        public void sleep() {
            System.out.println(A + E);
        }
        @Override
        public void location() {
            System.out.println(A + B + getLocation() + "\nhashCode: " + hCode + "\n");
        }
    }
    static class Dog extends Animal {
        String specificity = "Острые зубы";
        String A = "Собака ";
        int hCode = A.hashCode();

        public Dog(String food, String location) {
            super(food, location);
        }

        @Override
        public void makeNoise() {
            System.out.println(A + C + "гав");
        }
        @Override
        public void eat() {
            System.out.println(A + D + getFood());
        }
        @Override
        public void sleep() {
            System.out.println(A + E);
        }
        @Override
        public void location() {
            System.out.println(A + B + getLocation() + "\nhashCode: " + hCode + "\n");
        }

    }


    static class Horse extends Animal {
        String specificity = "Копыта";
        String A = "Лошадь ";
        int hCode = A.hashCode();

        public Horse(String food, String location) {
            super(food, location);
        }

        @Override
        public void makeNoise() {
            System.out.println(A + C + "игы-гы");
        }
        @Override
        public void eat() {
            System.out.println(A + D + getFood());
        }
        @Override
        public void sleep() {
            System.out.println(A + E);
        }
        @Override
        public void location() {
            System.out.println(A + B +getLocation() + "\nhashCode: " + hCode + "\n");
        }
    }
}

