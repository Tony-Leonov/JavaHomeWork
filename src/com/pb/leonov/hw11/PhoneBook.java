package com.pb.leonov.hw11;

import java.io.IOException;
import java.util.Scanner;

import static com.pb.leonov.hw11.Contact.setContact;

public class PhoneBook {
    public static void main(String[] args) throws IOException {
        System.out.println("Запущенна программа 'Телефонная книга'.");
        Boolean i = true;

        while (i) {

        System.out.println("\nВыберите действие, из соответствующего меню:" +
                "\n 1 - Создание контакта" +
                "\n 2 - Удаление контакта" +
                "\n 3 - Поиск контакта (по ФИО)" +
                "\n 4 - Вывести все записи с сортировкой (по ФИО либо по номеру телефона)" +
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
                break;
            case 2:
                System.out.println("Выбран вариант 2 - Удаление контакта");
                Contact.deleteContact();
                break;
            case 3:
                Contact.findContact();
                System.out.println("Выбран вариант 3 - Поиск контакта (по ФИО, или номеру телефона) \"");
                break;
            case 4:
                Contact.ShowAll();
                System.out.println("Выбран вариант 4 - Вывести все записи из телефонной книги (По ФИО либо по номеру телефона)");
                break;
            case 5:
                setContact();
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
