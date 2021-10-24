package com.pb.leonov.hw3;

import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.out;

public class Array_Int {
    public static void main(String[] args) {

//2. Создайте класс Array в пакете hw3.
//        Программа должна позволить пользователю ввести одномерный массив целых чисел размерностью 10 элементов.
//        Вывести на экран введенный массив.
//        Подсчитать сумму всех элементов массива и вывести ее на экран.
//        Подсчитать и вывести на экран количество положительных элементов.
//        Произвести сортировку этого массива от меньшего к большему по алгоритму сортировки пузырьком. (https://en.wikipedia.org/wiki/Bubble_sort)
//        Вывести на экран отсортированный массив.

        Scanner scanner = new Scanner(System.in);
        out.println("Программа запущена. Выберите размерность одномерного массива: ");

        if (scanner.hasNextInt()) {


            int x = scanner.nextInt();  // Переменная, введенная клиентом на старте программы

            int[] array = new int[x];

            int count = 0;  //Создаем счетчик массива
            out.println("Необходимо ввести " + x + " элементов массива");

            Scanner in = new Scanner(System.in);

            while (count < x) {
                count++;
                out.println("Введите " + count + "-е любое число: ");
                if (in.hasNextInt()) {
                    int value = Integer.parseInt(in.next());


                    int b = count;
                    array[--b] = value;

                    if (value != x) {
                        continue;
                    }
                } else {
                    out.println("Вводить можно только целые числа. Работа завершена.");
                    return;
                }
            }

//        // Вывод на экран значений элементов массива - с новой строки отдельно каждый
//        for (int i = 0; i < array.length; i++) {
//            System.out.println(array[i]);
//       }


//        // Вывод всего массива через пробел, без скобок.
//        for (int anArray : array) {
//        System.out.println(anArray + " ");
//        }


                // Вывод данных в структуре массива
                out.println(Arrays.toString(array));

                // Подсчитать сумму всех элементов массива и вывести ее на экран.
                int sum = 0;
                for (int i = 0; i < array.length; i++) {
                    sum = sum + array[i];
                }
                out.println("Сумма всех элементов в массиве: " + sum);

                // Подсчитать и вывести на экран количество положительных элементов
                int pozitive_el = 0;
                for (int i = 0; i < array.length; i++) {
                    if (array[i] > 0) {
                        pozitive_el = pozitive_el + 1;
                    } else {
                        continue;
                    }
                }
                out.println("Количество положительных элементов: " + pozitive_el);

                // Произвести сортировку этого массива от меньшего к большему по алгоритму сортировки пузырьком. (https://en.wikipedia.org/wiki/Bubble_sort)
                // Вывести на экран отсортированный массив.

                boolean isSorted = false;
                int buf;
                while (!isSorted) {
                    isSorted = true;
                    for (int i = 0; i < array.length - 1; i++) {
                        if (array[i] > array[i + 1]) {
                            isSorted = false;

                            buf = array[i];
                            array[i] = array[i + 1];
                            array[i + 1] = buf;
                        }
                    }
                }
                out.println(Arrays.toString(array));


            }
        else {
            out.println("Вводить можно только целые числа. Работа завершена. Происходится перезапуск программы");
            main(args);
        }
    }
}