package com.pb.leonov.hw11.Example.src.s10serialization;

import com.pb.leonov.hw5.Example.s01object.Person;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.nio.file.Paths;
import java.util.List;

public class DeserialMain {
    public static void main(String[] args) throws Exception {
        File file = Paths.get("D:\\Users\\dn100594lav\\IdeaProjects\\JavaHomeWork\\src\\com\\pb\\leonov\\hw11\\Example\\files\\person.data").toFile();
        FileInputStream fileInputStream = new FileInputStream(file);
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

        List<Person> persons = (List<Person>) objectInputStream.readObject();

        System.out.println(persons);
    }
}
