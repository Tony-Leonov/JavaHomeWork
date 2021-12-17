package com.pb.leonov.hw11.ex;

import com.pb.leonov.hw11.ex.Contact;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.*;

public class createContact {
    public void createContact () {

        while (true) {
            //Set<String> hashSet = new HashSet<String>();
            HashMap<String, Contact> Contact = new HashMap<>();

            Contact.put("Антон",(new Contact("Леонов Антон Витальевич","10.05.1994","380737654333","Гетьмана Дорошенка 1")));
            Contact.put("Валентина",(new Contact("Мануйленко Валентина Васильевна","12.06.1994","380937654333","Петриковский 12")));
            Contact.put("Оксана",(new Contact("Лермонтова Оксана Александровна","10.05.1991","380637654333","Полужинный 14")));
            Contact.put("Ирина",(new Contact("Васильес Ирина Григорьевна","10.01.1991","380502178987","Бановый 15")));

//
//            System.out.print("\nСоздаем новый контакт. Введите название нового объекта:  ");
//            Scanner input0 = new Scanner(System.in);
//            String key_obj = input0.nextLine();
//
//            System.out.print("Укажите ФИО нового контакта: ");
//            Scanner input01 = new Scanner(System.in);
//            String fullName = input01.nextLine();
//
//            System.out.print("Укажите дату рождения: ");
//            Scanner input2 = new Scanner(System.in);
//            String dateBirth = input2.nextLine();
//
//            System.out.print("Укажите номер телефона: ");
//            Scanner input3 = new Scanner(System.in);
//            String phone = input3.nextLine();
//
//            System.out.print("Укажите адрес: ");
//            Scanner input4 = new Scanner(System.in);
//            String address = input4.nextLine();
//
//            Contact.put(key_obj,(new Contact("fullName", "dateBirth", "phone", "address")));

            //System.out.println(Contact);

            //System.out.println("Количество ключей - "+Contact.size());




//            for (Object entry: Contact.entrySet()) {
//                System.out.println(entry);
//            }
//
//            System.out.println();
//
//            Set<Object> keys = Collections.singleton(Contact.keySet());
//            System.out.println("All keys are: " + keys);
//            // To get all key: value
//            for(Object key: keys){
//                System.out.println(key + ": " + Contact.get(key));
//            }
        }
    }
}

