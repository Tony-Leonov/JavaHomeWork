package com.pb.leonov.hw12;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.module.SimpleModule;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;
import java.util.Scanner;

import static com.pb.leonov.hw12.Contact.persons;

public class findContact {
    public findContact() throws JsonProcessingException {
        Scanner input = new Scanner(System.in);
        System.out.print("Для начала редактирования контакта, укажите полное ФИО: ");
        String input_FullName = input.nextLine();

        for (int i = 0; i < persons.size(); i++) {
            String full = persons.get(i).getFullName();
            if (Objects.equals(full, input_FullName)) {

                ObjectMapper mapper = new ObjectMapper();
                // pretty printing (json с отступами)
                mapper.enable(SerializationFeature.INDENT_OUTPUT);

                // для работы с полями типа LocalDate
                SimpleModule module = new SimpleModule();
                module.addSerializer(LocalDate.class, new LocalDateSerializer());
                module.addDeserializer(LocalDate.class, new LocalDateDeserializer());
                mapper.registerModule(module);

                /////для работы с полями типа LocalDateTimeSerializer

                ObjectMapper mapper_2 = new ObjectMapper();
                // pretty printing (json с отступами)
                mapper.enable(SerializationFeature.INDENT_OUTPUT);

                // для работы с полями типа LocalDateTime
                SimpleModule module_2 = new SimpleModule();
                module.addSerializer(LocalDateTime.class, new LocalDateTimeSerializer());
                module.addDeserializer(LocalDateTime.class, new LocalDateTimeDeserializer());
                mapper.registerModule(module_2);

                //Вывод в JSON
                String personsJson = mapper.writeValueAsString(persons.get(i));
                System.out.println(personsJson);
            }
        }
    }
}
