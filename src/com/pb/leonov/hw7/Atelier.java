package com.pb.leonov.hw7;


public class Atelier {
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
        System.out.println("Мужская одежда: ");
        for (Clothes clothe : clothes) {
            if (clothe instanceof Tshirt) { //clothe.getSize()
                System.out.println(clothe.name + ", размера - " + "цвет - " + clothe.getColor() + ", цена - "
                        + clothe.getPrice());
            }
        }
    }

    static void dressWomen(Clothes[] clothes) {
        System.out.println("Женская одежда: ");
        for (Clothes clothe : clothes) {
            if (clothe instanceof Skirt) { //clothe.getSize()
                System.out.println(clothe.name + ", размера - " + "цвет - " + clothe.getColor() + ", цена - "
                        + clothe.getPrice());
            }

        }
    }
}
