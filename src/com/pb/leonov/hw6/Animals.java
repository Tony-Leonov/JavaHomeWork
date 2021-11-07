package com.pb.leonov.hw6;

public class Animals {

    public Animals(String food, String location) {
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

    static class Cat extends Animals {
        String A = "Кошка ";
        int hCode = A.hashCode();

        public Cat(String food, String location) {
            super(food, location);
        }

        @Override
        public void makeNoise() {
            System.out.println(A + C + "мяу" + "\nhashCode: " + hCode);
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
            System.out.println(A + B + getLocation());
        }
    }
    static class Dog extends Animals {
         String A = "Собака ";
        int hCode = A.hashCode();

        public Dog(String food, String location) {
            super(food, location);
        }

        @Override
        public void makeNoise() {
            System.out.println(A + C + "гав" + "\nhashCode: " + hCode);
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
            System.out.println(A + B + getLocation());
        }

    }


    static class Horse extends Animals {
        String A = "Лошадь ";
        int hCode = A.hashCode();

        public Horse(String food, String location) {
            super(food, location);
        }

        @Override
        public void makeNoise() {
            System.out.println(A + C + "игы-гы" + "\nhashCode: " + hCode);
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
            System.out.println(A + B +getLocation());
        }
    }
}

