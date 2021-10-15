package com.pb.leonov.hw2;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        System.out.println("Введите operand1:"); // значение 1

        Scanner in_one = new Scanner(System.in);

        double operand1 = in_one.nextInt();

        System.out.println("Введите operand2: ");  // значение 2

        Scanner in_two = new Scanner(System.in);

        double operand2 = in_two.nextInt();

        System.out.println("Введите знак арифметической операции: ");  // арифметическое

        Scanner in_three = new Scanner(System.in);

        String sign = in_three.next();


        switch (sign) {
            case "/":
                if (operand2 == 0) {
                    System.out.println("Нельзя делить на ноль");
                    return;
                }
                double result1 = operand1 / operand2;
                System.out.println("Результат : " + operand1 + sign + operand2 + " = " + result1);
                break;
            case "*":
                double result2 = operand1 * operand2;
                System.out.println("Результат : " + operand1 + sign + operand2 + " = " + result2);
                break;
            case "+":
                double result3 = operand1 + operand2;
                System.out.println("Результат : " + operand1 + sign + operand2 + " = " + result3);
                break;
            case "-":
                double result4 = operand1 - operand2;
                System.out.println("Результат : " + operand1 + sign + operand2 + " = " + result4);
                break;

            default:
                System.out.println("Калькулятор может только делить, уможножать, прибавлять, отнимать");
        }
    }
}
