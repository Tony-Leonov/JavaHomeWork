package com.pb.leonov.hw7;


public class Atelier {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_BLUE = "\u001B[34m";

    public static void main(String[] args) {

        Tshirt tshirt = new Tshirt("156", "красный", "футболка", Size.XS);
        Pants pants = new Pants("120", "желтый", "брюки", Size.L);
        Skirt skirt = new Skirt("178", "черный", "юбка", Size.M);
        Tie tie = new Tie("498", "белый", "галстук", Size.XS);

        Clothes[] clothes = new Clothes[]{tshirt, pants, skirt, tie};
        dressMan(clothes);
        dressWomen(clothes);

    }



    static void dressMan(Clothes[] clothes) {
        System.out.println(ANSI_BLUE + "Мужская одежда: "+ ANSI_RESET);
        for (Clothes clothe : clothes) {
            if (clothe instanceof ManClothes) { //clothe.getEuroSize()
                System.out.println(clothe.name + ", размер - " + clothe.size   + ", цвет - " + clothe.getColor() + ", цена - "
                        + clothe.getPrice() + " UAH");
            }
        }
    }

    static void dressWomen(Clothes[] clothes) {
        System.out.println(ANSI_RED + "\nЖенская одежда: " + ANSI_RESET);
        for (Clothes clothe : clothes) {
            if (clothe instanceof WomenClothes) { //clothe.getSize()
                System.out.println(clothe.name + ", размер - " + clothe.size + ", цвет - " + clothe.getColor() + ", цена - "
                        + clothe.getPrice() + " UAH");
            }

        }
    }
}
