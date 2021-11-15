package com.pb.leonov.hw7;

public class Tshirt extends Clothes implements WomenClothes, ManClothes {

    public Tshirt(String price, String color, String name, Size size) {
        this.price = price;
        this.color = color;
        this.name = name;
        this.size = size;
    }
}