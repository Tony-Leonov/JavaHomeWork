package com.pb.leonov.hw2;
import java.util.Scanner;

public class Interval {
    public static void main(String[] args) {

        System.out.println("Введите чило: ");

        Scanner in = new Scanner(System.in);

        int in_entry = in.nextInt();

        if (in_entry >= 0 & in_entry <= 14) {
            System.out.println("Число попадает в промежуток [0-14]");
            return;
        }
        if (in_entry >= 15 & in_entry <= 35) {
            System.out.println("Число попадает в промежуток [15-35]");
            return;
        }
        if (in_entry >= 36 & in_entry <= 50 ) {
            System.out.println("Число попадает в промежуток [36-50]");
            return;
        }
        if (in_entry >= 51 & in_entry <= 100) {
            System.out.println("Число попадает в промежуток [51-100]");
            return;
        }
        else {
            System.out.println("Ваше число не попадает в промежутки [0-100]");
            return;
        }

    }
}
