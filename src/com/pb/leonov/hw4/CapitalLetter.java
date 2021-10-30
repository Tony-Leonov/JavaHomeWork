package com.pb.leonov.hw4;

//    Создайте класс CapitalLetter в пакете hw4.
//        Напишите программу, которая принимает строку и переводит первую букву слова в верхний регистр.
//        Строку должен ввести пользователь.
//        Пример работы:
//        Истина — это то, что выдерживает проверку опытом. Эйнштейн А.
//        Истина — Это То, Что Выдерживает Проверку Опытом. Эйнштейн А.
//        При выполнении задания использовать метод(ы).


import java.util.Scanner;


public class CapitalLetter {

    static String myCalculation(String some_line) {
       String processing = "";

        processing = processing + some_line.substring(0, 1).toUpperCase(); //первый символ делаем заглавным
        for (int i = 1; i < some_line.length(); i++) {
            // смотрим, был ли слева пробел:
            if (" ".equals(some_line.substring(i-1, i)))
                processing = processing + some_line.substring(i, i+1).toUpperCase();
            else
                processing = processing + some_line.substring(i, i+1);
        }
        return processing;
    }

    public static void main(String[] args) {
        String ANSI_BLUE = "\u001B[34m";
        String ANSI_RESET = "\u001B[0m";

        System.out.println(ANSI_BLUE + "Введите любое предложение: " + ANSI_RESET);
        Scanner in = new Scanner(System.in);
        String some_str = in.nextLine();

        String result_after = myCalculation(some_str);

        System.out.println("Результат ДО:  \n" + some_str + "\nРезультат ПОСЛЕ: \n"  + result_after + ANSI_BLUE + "\nРабота программы завершена\n" + ANSI_RESET);

    }
}
