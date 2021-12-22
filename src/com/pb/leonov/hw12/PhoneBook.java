package com.pb.leonov.hw12;

import java.io.IOException;
import java.util.Scanner;

import static com.pb.leonov.hw12.CreateFile.createFile;

public class PhoneBook {
    public static void main(String[] args) throws IOException {
        System.out.println("Запущенна программа 'Телефонная книга'.");
        boolean i = true;

        while (i) {

        System.out.println("\nВыберите действие, из соответствующего меню:" +
                "\n 1 - Создание контакта" +
                "\n 2 - Удаление контакта" +
                "\n 3 - Поиск контакта (по ФИО)" +
                "\n 4 - Вывести все записи с сортировкой (по дате рождения или ФИО)" +
                "\n 5 - Редактирование контакта" +
                "\n 6 - Записать в файл все данные телефонной книги" +
                "\n 7 - Загрузка из файла всех данных" +
                "\n 8 - Завершение программы");

        Scanner in = new Scanner(System.in);
        System.out.print("Укажите число: ");
        int input = Integer.parseInt(in.next());


        switch (input) {
            case 1:
                Contact.main();
                break;
            case 2:
                new deleteContact();
                break;
            case 3:
                new findContact();
                break;
            case 4:
                new Sorting();
                break;
            case 5:
                new setContact();
                break;
            case 6:
                createFile();
                break;
            case 7:
                break;
            case 8:
                i = false;
                System.out.println("Программа завершена");
                break;
            default:
                i = false;
                System.out.println("Ошибка! Программа завершена");
            }
        }
    }
}
