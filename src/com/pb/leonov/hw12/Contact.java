package com.pb.leonov.hw12;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.module.SimpleModule;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

class Contact {

    private String fullName;
    private String phone;
    private LocalDate dateOfBirth;
    private String address;
    public LocalDateTime modify;

    public Contact() {

    }

    void Contact() {

    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public LocalDateTime getModify() {
        return modify;
    }

    public void setModify(LocalDateTime modify) {
        this.modify = modify;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Contact(String fullName, String phone, LocalDate dateOfBirth, String address ) {
        this.fullName = fullName;
        this.phone = phone;
        this.dateOfBirth = dateOfBirth;
        this.address = address;
        //LocalDateTime = this.modify;
    }

    @Override
    public String toString() {
        return "Person{" +
                "fullName='" + fullName + '\'' +
                ", phone='" + phone + '\'' +
                ", dateOfBirth=" + dateOfBirth +
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

        List<Contact> persons = Arrays.asList(
                new Contact("Джекин Альфред Рудольфович", "380737654333", LocalDate.of(2000, 5, 2),"Гетьмана Петра Дорошенка 5"),
                new Contact("Гнат Василий Иванович ", "380502168789", LocalDate.of(1990, 4, 12),"Петровское 5"),
                new Contact("Леонова Анна Витальевна", "380637654321", LocalDate.of(1996, 1, 20),"Заводская 7"),
                new Contact("Леонов Антон Витальевич", "380737654333", LocalDate.of(1994, 5, 10),"Дорошенка 12")
        );



        String personsJson = mapper.writeValueAsString(persons);
        System.out.println(personsJson);

        List persons2 = mapper.readValue(personsJson, List.class);
        System.out.println(persons2.get(0).getClass().getName());
        System.out.println(persons2);

        List<Contact> persons3 = mapper.readValue(personsJson, new TypeReference<List<Contact>>() {
        });
        System.out.println(persons3.get(0).getClass().getName());
        System.out.println(persons3);

    }
}
