package com.pb.leonov.hw12;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.module.SimpleModule;

import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Comparator;
import java.util.Scanner;

import static com.pb.leonov.hw12.Contact.persons;

public class Sorting {
    public Sorting() throws IOException {

        Scanner in = new Scanner(System.in);
        System.out.print("\nСортировка возможна: " +
                "\n 1 - По ФИО" +
                "\n 2 - По дате рождения" +
                "\n 3 - По ФИО (API STREAM)" +
                "\n 4 - По дате рождения (API STREAM)" +
                "\nВыберите необходимую сортировку: ");

        int input = Integer.parseInt(in.next());

        switch (input) {
            case 1:
                persons.sort(Comparator.comparing(Contact::getFullName)); // Сортировка по ФИО
                break;
            case 2:
                persons.sort(Comparator.comparing(Contact::getDateOfBirth)); // Сортировка по Дате рождения
                break;
            case 3:
                persons.stream()
                        .sorted(Comparator.comparing(Contact::getFullName));
                        //.forEach(System.out::print);
                break;
            case 4:
                persons.stream()
                        .sorted(Comparator.comparing(Contact::getDateOfBirth));
                        //.forEach(System.out::print);
                break;
            default:
                System.out.println("Ошибка! Программа заверешна");
        }

        ObjectMapper mapper = new ObjectMapper();
        // pretty printing (json с отступами)
        mapper.enable(SerializationFeature.INDENT_OUTPUT);

        // для работы с полями типа LocalDate и LocalDateTimeSerializer
        SimpleModule module = new SimpleModule();
        module.addSerializer(LocalDate.class, new LocalDateSerializer());
        module.addDeserializer(LocalDate.class, new LocalDateDeserializer());
        mapper.registerModule(module);

        // для работы с полями типа LocalDateTime
        SimpleModule module_2 = new SimpleModule();
        module.addSerializer(LocalDateTime.class, new LocalDateTimeSerializer());
        module.addDeserializer(LocalDateTime.class, new LocalDateTimeDeserializer());
        mapper.registerModule(module_2);

        //Вывод в JSON
        String personsJson = mapper.writeValueAsString(persons);
        System.out.println(personsJson);

        System.out.println("Количество записей в телефонной книге: " + persons.size());
    }
}

