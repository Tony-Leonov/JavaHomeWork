package com.pb.leonov.hw7;

public class Pants extends Clothes implements WomenClothes, ManClothes {
    public Pants(String price, String color, String name, Size size ) {
        this.price = price;
        this.color = color;
        this.name = name;
        this.size = size;
        }

}
