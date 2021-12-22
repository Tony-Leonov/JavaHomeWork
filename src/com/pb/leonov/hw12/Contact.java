package com.pb.leonov.hw12;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.module.SimpleModule;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.*;

public class Contact {

    private String fullName;
    private String phone;
    private LocalDate dateOfBirth;
    private String address;
    private LocalDateTime modify;

    public Contact(String fullName, String phone, LocalDate dateOfBirth, String address) {
        this.fullName = fullName;
        this.phone = phone;
        this.dateOfBirth = dateOfBirth;
        this.address = address;
        this.modify = LocalDateTime.now();
    }

    static ArrayList<Contact> persons = new ArrayList<>(Arrays.asList(
            new Contact("Джекин Альфред Рудольфович", "380737654333", LocalDate.of(2003, 5, 2), "Гетьмана Петра Дорошенка 5"),
            new Contact("Шереметьев Василий Иванович", "380502168789", LocalDate.of(1990, 4, 12), "Петровское 5"),
            new Contact("Аксенова Елена Витальевна", "380637654321", LocalDate.of(2001, 1, 20), "Заводская 7"),
            new Contact("Леонов Антон Витальевич", "380737654333", LocalDate.of(1994, 5, 10), "Дорошенка 12")
    ));


    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
        this.modify = LocalDateTime.now();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
        this.modify = LocalDateTime.now();
    }

    public LocalDateTime getModify() {
        return modify;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
        this.modify = LocalDateTime.now();
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
        this.modify = LocalDateTime.now();
    }


    @Override
    public String toString() {
        return "Person{" +
                "fullName='" + fullName + '\'' +
                ", phone='" + phone + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", modify='" + modify + '\'' +
                '}';
    }

    public static void main() throws JsonProcessingException {

        ObjectMapper mapper = new ObjectMapper();
        // pretty printing (json с отступами)
        mapper.enable(SerializationFeature.INDENT_OUTPUT);

        // для работы с полями типа LocalDate
        SimpleModule module = new SimpleModule();
        module.addSerializer(LocalDate.class, new LocalDateSerializer());
        module.addDeserializer(LocalDate.class, new LocalDateDeserializer());
        mapper.registerModule(module);

        ///////////////////////////////////////////////////////////////////////

        ObjectMapper mapper_2 = new ObjectMapper();
        // pretty printing (json с отступами)
        mapper.enable(SerializationFeature.INDENT_OUTPUT);

        // для работы с полями типа LocalDateTime
        SimpleModule module_2 = new SimpleModule();
        module.addSerializer(LocalDateTime.class, new LocalDateTimeSerializer());
        module.addDeserializer(LocalDateTime.class, new LocalDateTimeDeserializer());
        mapper.registerModule(module_2);


        persons.add(new Contact("Тестовый", "380637654321", LocalDate.of(1996, 1, 20), "Заводская 7"));


        Scanner input1 = new Scanner(System.in);
        System.out.print("Укажите полное ФИО для поиска: ");
        String input_FullName = input1.nextLine();

        Scanner input2 = new Scanner(System.in);
        System.out.print("Укажите номер телефона: ");
        String input_phone = input2.nextLine();

        Scanner input3 = new Scanner(System.in);
        System.out.print("Укажите дату рождения, формат (YYYY-MM-DD): ");
        LocalDate input_dateOfBirth = LocalDate.parse(input3.nextLine());

        Scanner input4 = new Scanner(System.in);
        System.out.print("Укажите адрес: ");
        String input_address = input4.nextLine();

        persons.add(new Contact(input_FullName, input_phone, input_dateOfBirth, input_address));

//        String personsJson = mapper.writeValueAsString(persons);
//        System.out.println(personsJson);

    }
}
