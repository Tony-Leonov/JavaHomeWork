package com.pb.leonov.hw12;

import com.fasterxml.jackson.core.JsonProcessingException;

import java.util.Scanner;

public class PhoneBook {
    public static void main(String[] args) throws JsonProcessingException {

        Boolean i = true;

        while (i) {
        System.out.println("Запущенна программа 'Телефонная книга'.");
        System.out.println("Выберите действие, из соответствующего меню:" +
                "\n 1 - Создание контакта" +
                "\n 2 - Удаление контакта" +
                "\n 3 - Поиск контакта (По ФИО либо по номеру телефона)" +
                "\n 4 - Вывести все записи из телефонной книги" +
                "\n 5 - Редактирование контакта" +
                "\n 6 - Записать в файл все данные телефонной книги" +
                "\n 7 - Загрузка из файла всех данных" +
                "\n 8 - Завершение программы");

        Scanner in = new Scanner(System.in);
        System.out.print("Укажите число: ");
        int input = Integer.parseInt(in.next());


        switch (input) {
            case 1:
                System.out.println("Выбран вариант 1 - Создание контакта");
//                Contact contact = new Contact();
//                contact.Contact();
                Contact.main();
                // main(args); цикл, запуск повторно
                break;
            case 2:
                System.out.println("Выбран вариант 2 - Удаление контакта");
                break;
            case 3:
                System.out.println("Выбран вариант 3 - Поиск контакта (По ФИО либо по номеру телефона)\"");
                break;
            case 4:
                System.out.println("Выбран вариант 4 - Вывести все записи из телефонной книги");
            case 5:
                System.out.println("Выбран вариант 5 - Редактирование контакта ");
                break;
            case 6:
                System.out.println("Выбран вариант 6 - Записать в файл все данные телефонной книги");
                break;
            case 7:
                System.out.println("Выбран вариант 7 - Загрузка из файла всех данных");
                break;
            case 8:
                i = false;
                System.out.println("Работа программы завершена.");
                break;
            default:
                i = false;
                System.out.println("Ошибка! Программа заверешна");
            }
        }
    }
}
