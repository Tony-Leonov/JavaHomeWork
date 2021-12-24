package com.pb.leonov.hw12;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.*;
import java.util.*;

import static com.pb.leonov.hw12.Contact.persons;

public class readFile {

    public readFile() throws IOException {

        BufferedReader reader = new BufferedReader(new FileReader("src\\com\\pb\\leonov\\hw12\\PhoneBook_storage.json"));
        String json = "";

            StringBuilder sb = new StringBuilder();
            String line = reader.readLine();

            while (line != null) {
                sb.append(line);
                sb.append("\n");
                line = reader.readLine();
            }

            json = sb.toString();
//            System.out.println(json);

      //  ObjectMapper mapper = new ObjectMapper();

        //HashMap<String, Contact> persons = mapper.readValue(new File("src\\com\\pb\\leonov\\hw12\\PhoneBook_storage.json"));
      //  List<Contact> persons2 = mapper.readValue(json, new TypeReference<List<Contact>>() {
      //  });

        System.out.println("Файл прочитан.");
       // persons.addAll(persons2);

//////////////////////////////////////////////////////////////////////////////////////
        ObjectMapper objectMapper = new ObjectMapper();

        List<Contact> list = objectMapper.readValue(json, List.class);
//        List<Contact> list = objectMapper.readValue(json, new TypeReference<List<Contact>>() {
//                });

                persons.addAll(list);


        }

}

