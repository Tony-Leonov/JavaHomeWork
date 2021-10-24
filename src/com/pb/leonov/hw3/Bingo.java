package com.pb.leonov.hw3;
import java.util.Random;
import java.util.Scanner;

//1. Написать программу игру “Bingo”.
//        Создайте класс Bingo в пакете hw3.
//        Программа должна загадать целое число в диапазоне от 0 до 100 и предложить пользователю его отгадать.
//        При вводе числа пользователем, программа проверяет на соответствие с загаданным число и если числа совпали вывести сообщение о том, что число отгадано.
//        Если числа не совпали, тогда следует вывести надпись о том, что задуманное число является больше или меньше вводимого.
//        Также программа ведет подсчет попыток, и выводит это количество после того как число угадали.
//        Предусмотреть возможность досрочного завершения программы, в случае если пользователь не желает продолжать угадывать число.

public class Bingo {
    public static void main(String[] args) {
        System.out.println("Угадайте задуманное число");
        System.out.println("Для выхода из программы введите - exit.");

        Random random = new Random();

        String x = String.valueOf(random.nextInt(101)); // Рандомное задуманное число в промежутках до 100.
        System.out.println("Рандомное число: " + x); // Рандомное число выводим в консоль


//        final int MAX_ATTEMPT = 99; // Допустимое количество попыток.
          int count = 0;           // Счетчик попыток.

        Scanner in = new Scanner(System.in);

        for (;;) {    ///Для того, чтобы задать кол-во попыток while (count < MAX_ATTEMPT)
            count++;
            System.out.println("Попытка " + count + ":");
            String value = in.next();

            if (value.equals("exit")) {
                break;
            }

            if (!value.equals(x)) {
                Integer a1 = new Integer(x);
                Integer a2 = new Integer(value);

                if (a1  > a2) {
                    System.out.println("Не угадали. Подсказка - загаданное число, больше");
                } else {
                    System.out.println("Не угадали. Подсказка - загаданное число, меньше");
                }
                continue;
            }

            System.out.println("Поздравляем, Вы угадали с " + count + " попытки!");
            break;
        }

        System.out.println("Конец игры!");
    }
}
