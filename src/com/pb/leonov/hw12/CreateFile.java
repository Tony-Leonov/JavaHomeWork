package com.pb.leonov.hw12;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.module.SimpleModule;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.time.LocalDate;
import java.time.LocalDateTime;

import static com.pb.leonov.hw12.Contact.persons;

public class CreateFile {

    public static void main(String[] args) throws IOException {
        createFile();
    }

    public static void createFile()  {
        // Creates a Writer using FileWriter
        try (Writer writer = new FileWriter("src\\com\\pb\\leonov\\hw12\\PhoneBook_storage.json")) {

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
            String personsJson = mapper.writeValueAsString(persons);
            writer.write(String.valueOf(personsJson));
            System.out.println("Файл успешно записан - PhoneBook_storage");
        } catch (Exception e) {
            e.getStackTrace();
        }
    }
}
