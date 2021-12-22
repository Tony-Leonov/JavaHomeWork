package com.pb.leonov.hw12;

import java.util.Objects;
import java.util.Scanner;
import static com.pb.leonov.hw12.Contact.*;

public class setContact {

    public setContact() {
        System.out.println("Для начала редактирования контакта, укажите полное ФИО: ");
        Scanner input1 = new Scanner(System.in);
        String input_FullName = input1.nextLine();

        for (int i = 0; i < persons.size(); i++) {
            String full = persons.get(i).getFullName();
            if (Objects.equals(full, input_FullName)) {

                System.out.print("Контакт найден. Укажите новый номер телефона: ");
                Scanner input2 = new Scanner(System.in);
                String new_phone = input2.nextLine();

                persons.get(i).setPhone(new_phone);

                System.out.print("Телефон успешно изменен на " + new_phone + "\n" + persons.get(i));
            }
        }
    }
}
