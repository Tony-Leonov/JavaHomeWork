package com.pb.leonov.hw12;

import java.time.LocalDate;
import java.util.Objects;
import java.util.Scanner;
import java.util.stream.Collectors;

import static com.pb.leonov.hw12.Contact.persons;
import static javax.swing.UIManager.get;

public class setContact {

    public setContact() {
        System.out.print("Для начала редактирования контакта, укажите полное ФИО: ");
        Scanner input = new Scanner(System.in);
        String input_FullName = input.nextLine();

        Scanner input2 = new Scanner(System.in);
        for (int i = 0; i < persons.size(); i++) {
            String full = persons.get(i).getFullName();
            if (Objects.equals(full, input_FullName)) {
                System.out.print("Контакт найден. Укажите, что желаете отредактировать: " +
                        "\n 1 - Редактирование ФИО" +
                        "\n 2 - Редактирование номера телефона" +
                        "\n 3 - Редактирование даты рождения" +
                        "Укажите число : "
                );


                int sw = Integer.parseInt(input2.next());

                switch(sw) {
                    case 1:
                        System.out.print("Укажите новое ФИО контакта: ");
                        Scanner input3 = new Scanner(System.in);
                        String new_fullName = input3.nextLine();
                        persons.get(i).setFullName(new_fullName);
                        System.out.print("ФИО успешно изменено " + new_fullName + "\n" + persons.get(i));
                        break;
                    case 2:
                        System.out.print("Укажите новый номер телефона: ");
                        Scanner input4 = new Scanner(System.in);
                        String new_phone = input4.nextLine();
                        persons.get(i).setPhone(new_phone);
                        System.out.print("Телефон успешно изменен на " + new_phone + "\n" + persons.get(i));
                        break;
                    case 3:
                        System.out.print("Укажите новую дату рождения (формат ГГГГ-ММ-ДД) : ");
                        Scanner input5 = new Scanner(System.in);
                        String new_DateOfBirth = input5.nextLine();
                        persons.get(i).setDateOfBirth(LocalDate.parse(new_DateOfBirth));
                        System.out.print("Дата рождения успешно изменена на: " + new_DateOfBirth + "\n" + persons.get(i));
                        break;
                    default:
                        System.out.println("Ошибка. Выбран неверный вариант из списка!");
                }

                //persons.get(i).setPhone(new_phone);

                //System.out.print("Телефон успешно изменен на " + new_phone + "\n" + persons.get(i));
            }
        }
    }
}
