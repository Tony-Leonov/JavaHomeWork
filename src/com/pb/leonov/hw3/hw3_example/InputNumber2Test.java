package com.pb.leonov.hw3.hw3_example;

import java.util.Scanner;

public class InputNumber2Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Ведите число: ");
            int input = scanner.nextInt();
            if (input == 007) {
                break;
            }
        }
    }
}
