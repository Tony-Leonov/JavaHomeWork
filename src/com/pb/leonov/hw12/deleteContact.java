package com.pb.leonov.hw12;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import static com.pb.leonov.hw12.Contact.persons;
import static jdk.nashorn.internal.objects.NativeArray.forEach;

public class deleteContact {

    public deleteContact() {
        Scanner input1 = new Scanner(System.in);
        System.out.print("Введите полное ФИО контакта, которое хотите удалить: ");
        String del = input1.nextLine();

        if (persons.removeIf(p -> p.getFullName().equals(del))) {
            System.out.println("\u001B[31mКонтакт успешно удален - " + del + "\u001B[0m");
        } else {
            System.out.println("\u001B[31mКонтакт для удаления не найден\u001B[0m");
        }




//        Iterator<Contact> personsIterator = persons.iterator();//создаем итератор
//        while (personsIterator.hasNext()) { //до тех пор, пока в списке есть элементы
//
//
//            Contact nextPers = personsIterator.next();  //получаем следующий элемент
//            if (nextPers.getFullName().equals(del)) {
//                //personsIterator.remove();  //удаляем котакт с нужным именем
//                System.out.println("\u001B[31mКонтакт успешно удален - " + del + "\u001B[0m");
//    }
//}
//
            }
        }