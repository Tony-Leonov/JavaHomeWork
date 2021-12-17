package com.pb.leonov.hw11;

import com.pb.leonov.hw5.Example.s01object.Person;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.*;

public class createContact {
    public void createContact () {


        while (true) {
            Set<String> hashSet = new HashSet<String>();
            HashMap<String, Contact> Contact = new HashMap<>();

            System.out.print("Создаем новый контакт. Введите название нового объекта:  ");
            Scanner key_obj = new Scanner(System.in);
            //this.name = input0.next();
            //hashSet.add(String.valueOf(new Person(name)));// Создаем уникальность по NAME


            Scanner fullName = new Scanner(System.in);
            System.out.print("Укажите ФИО нового контакта: ");

//            Contact.put("Антон",(new Contact("Леонов Антон Витальевич","10.05.1994","380737654333","Гетьмана Дорошенка 1","12")));
//            Contact.put("Валентина",(new Contact("Мануйленко Валентина Васильевна","12.06.1994","380937654333","Петриковский 12","12")));
//            Contact.put("Оксана",(new Contact("Лермонтова Оксана Александровна","10.05.1991","380637654333","Полужинный 14",)));

            Scanner dateBirth = new Scanner(System.in);
            System.out.print("Укажите дату рождения: ");


            Scanner input3 = new Scanner(System.in);
            System.out.print("Укажите номер телефона: ");
            ///this.phone = input3.next();
            //map.put("Телефон", phone);

            Scanner input4 = new Scanner(System.in);
            System.out.print("Укажите адрес: ");
            //this.address = input4.next();
            //map.put("Адрес", address);

            //this.modify = LocalDateTime.now();
            //map.put("Дата изменения", modify);

            Contact.put(key_obj.next(),(new Contact(fullName.next(), dateBirth.next(),"10.05.1991","380637654333","Полужинный 14","12")));


            System.out.println(Contact);

            System.out.println("Количество ключей - "+Contact.size());




            for (Object entry: Contact.entrySet()) {

                System.out.println(entry);

            }

            System.out.println();

            Set<Object> keys = Collections.singleton(Contact.keySet());
            System.out.println("All keys are: " + keys);
// To get all key: value
            for(Object key: keys){
                System.out.println(key + ": " + Contact.get(key));
            }

        }


    }
}
