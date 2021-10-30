package com.pb.leonov.hw4;

import java.util.Arrays;
import java.util.Scanner;

//2. Создайте класс Anagram в пакете hw4.
//        Напишите программу, которая определяет, является ли одна строка анаграммой другой строки.
//        +Обе строки вводит пользователь.
//        Анаграмма - это слово или фраза, сделанная путем переноса букв другого слова или фразы.
//        Программа должна игнорировать пробелы и знаки препинания.
//        Пример анаграмм:
//        Аз есмь строка, живу я, мерой остр. -> За семь морей ростка я вижу рост.
//        Я в мире — сирота. -> Я в Риме — Ариост.
//        При выполнении задания использовать метод(ы).


public class Anagram {

    static  String isAnagram(String one_str, String two_str) {
        String answer = "";
        String str_1 = one_str.replaceAll("[\\s,\\p{P}]", ""); // Убираем пробелы
        String str_2 = two_str.replaceAll("[\\s,\\p{P}]", ""); // Убиваем любой вид пунктуационных знаков


        char[] array_one = str_1.toLowerCase().toCharArray();
        char[] array_two = str_2.toLowerCase().toCharArray();
        Arrays.sort(array_one);
        Arrays.sort(array_two);

        if(Arrays.equals(array_one, array_two)) {
            return answer = "Да, это анограмма";
        }

        else {
            return answer = "Нет, это не анограмма";
        }

    }

    public static void main(String[] args) {

        String ANSI_BLUE = "\u001B[34m";
        String ANSI_RESET = "\u001B[0m";

        System.out.println(ANSI_BLUE + "Это проверка на анограмму. \nВведите любое предложение. Строка 1: " + ANSI_RESET);
        Scanner in = new Scanner(System.in);
        String one_str = in.nextLine();
        System.out.println(ANSI_BLUE + "Введите любое предложение. Строка 2: " + ANSI_RESET);
        String two_str = in.nextLine();

        String result = isAnagram(one_str, two_str);

        System.out.println("Строки являются анограммой? " + result);
    }
}