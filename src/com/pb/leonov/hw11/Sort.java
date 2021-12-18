package com.pb.leonov.hw11;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.module.SimpleModule;

import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Comparator;
import java.util.Scanner;

import static com.pb.leonov.hw11.Contact.persons;

public class Sort {
    public static void Sorting() throws IOException {

        Scanner in = new Scanner(System.in);
        System.out.print("\nСортировка возможна: " +
                "\n 1 - По ФИО" +
                "\n 2 - По дате рождения" +
                "\nВыберите необходимую сортировку: ");

        int input = Integer.parseInt(in.next());

        switch (input) {
            case 1:
                Contact.persons.sort(Comparator.comparing(Contact::getFullName)); // Сортировка по Дате рождения
                break;
            case 2:
                Contact.persons.sort(Comparator.comparing(Contact::getDateOfBirth)); // Сортировка по Дате рождения
                break;
            default:
                System.out.println("Ошибка! Программа заверешна");
        }

        //Contact.persons.sort(Comparator.comparing(Contact::getDateOfBirth)); // Сортировка по Дате рождения

        //Contact.persons.sort(Comparator.comparing(Contact::getFullName)); // Сортировка по Дате рождения

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
        String personsJson = mapper.writeValueAsString(Contact.persons);
        System.out.println(personsJson);

        System.out.println("Количество записей в телефонной книге: " + persons.size());



        //После сортировки по дате рождения
        //System.out.println(Contact.persons);



        //Collections.sort(Collections.unmodifiableList(persons));
        //Collections.sort(Collections.unmodifiableList(persons.fullName));


//        List persons2 = mapper.readValue(personsJson, List.class);
//        System.out.println(persons2.get(0).getClass().getName());
//        System.out.println(persons2);
//
//        List<Contact> persons3 = mapper.readValue(personsJson, new TypeReference<List<Contact>>() {
//        });
//        System.out.println(persons3.get(0).getClass().getName());
//        System.out.println(persons3);

    }
}

