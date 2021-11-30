package com.pb.leonov.hw10;

public class Main {
    public static void main(String[] args) {
        //протестировать полученный класс на примере NumBox<Float> и NumBox<Integer>.
        //C использованием дженериков

        //Float
        NumBox<Float> floatNumBox  = new NumBox<>(4);

        floatNumBox.add(2.5f); Float f1 = floatNumBox.get(0);  System.out.print("Float: " + f1 + ", ");
        floatNumBox.add(0.5f); Float f2 = floatNumBox.get(1);  System.out.print(f2 + ", ");
        floatNumBox.add(4.5f); Float f3 = floatNumBox.get(2);  System.out.print(f3 + ", ");
        floatNumBox.add(7.5f); Float f4 = floatNumBox.get(3);  System.out.print(f4 + ". ");
        print(floatNumBox);


        System.out.println("---------------------------------------------------------------------------");

        //Integer
        NumBox<Integer> integerNumBox = new NumBox<>(3);

        integerNumBox.add(5); Integer i1 = integerNumBox.get(0); System.out.print("Integer: " + i1 + ", ");
        integerNumBox.add(27); Integer i2 = integerNumBox.get(1); System.out.print(i2 + ", ");
        integerNumBox.add(15); Integer i3 = integerNumBox.get(2); System.out.print(i3 + ". ");
        print(integerNumBox);
}

        private static void print(NumBox<?> numBox) {

            int length = numBox.length();

            System.out.println();
            for (int i = 0; i < length; i++) {
                System.out.print(numBox.get(i) + " ");
            }
            System.out.println();

            System.out.println("Sum: " + numBox.sum());
            System.out.println("Avg: " + numBox.average());
            System.out.println("Max: " + numBox.max());
            System.out.println("Size: " + numBox.getSize());
        }
    }