package com.pb.leonov.hw12;

import java.util.Objects;
import java.util.Scanner;
import java.util.stream.Collectors;

import static com.pb.leonov.hw12.Contact.persons;

public class setContact2 {

    public setContact2() {
        System.out.println("Для начала редактирования контакта, укажите полное ФИО: ");
        Scanner input = new Scanner(System.in);
        String input_FullName = input.nextLine();

        Scanner input2 = new Scanner(System.in);
        for (int i = 0; i < persons.size(); i++) {
            String full = persons.get(i).getFullName();
            if (Objects.equals(full, input_FullName)) {
                System.out.print("Контакт найден. Укажите, что желаете отредактировать: " +
                        "\n 1 - Редактирование ФИО" +
                        "\n 2 - Редактирование номера телефона" +
                        "\n 3 - Редактирование даты рождения"
                );

                int sw = Integer.parseInt(input2.next());

                switch(sw) {
                    case 1:
                        //persons.get(i).setPhone();
                        break;
                    case 2:
                        System.out.print("Укажите новый номер телефона: ");
                        Scanner input3 = new Scanner(System.in);
                        String phone = input3.nextLine();
                        persons.stream()
                               .filter(s -> s.getPhone().startsWith(phone));
                                //.collect(Collectors.toList());
                        //.forEach(i -> list.remove(i));
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
