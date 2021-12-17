package com.pb.leonov.hw11;

import com.pb.leonov.hw5.Example.s01object.Person;

import java.time.LocalDateTime;
import java.util.*;

public class addContact2 {

    public String name;
    public String fullName;
    public String dateBirth;
    public String phone;
    public String address;
    public LocalDateTime modify;

    public void createContact () {

        //Person tom = new Person(); // создание объекта

        Set<String> hashSet = new HashSet<String>();
        HashMap<Object, java.io.Serializable> map = new HashMap<>();

        while (true) {

            System.out.print("Создаем новый контакт. Укажите ключ контакта: ");
            Scanner input0 = new Scanner(System.in);
            this.name = input0.next();
            hashSet.add(String.valueOf(new Person(name)));// Создаем уникальность по NAME


            Scanner input1 = new Scanner(System.in);
            System.out.print("Создаем новый контакт. Укажите ФИО нового контакта: ");
            this.fullName = input1.next();


            Scanner input2 = new Scanner(System.in);
            System.out.print("Укажите дату рождения: ");
            this.dateBirth = input2.next();
            map.put("Дата рождения", dateBirth);

            Scanner input3 = new Scanner(System.in);
            System.out.print("Укажите номер телефона: ");
            this.phone = input3.next();
            map.put("Телефон", phone);

            Scanner input4 = new Scanner(System.in);
            System.out.print("Укажите адрес: ");
            this.address = input4.next();
            map.put("Адрес", address);

            this.modify = LocalDateTime.now();
            map.put("Дата изменения", modify);

            System.out.println(map);

            System.out.println("Количество ключей - "+map.size());




            for (Object entry: map.entrySet()) {

                System.out.println(entry);

            }

            System.out.println();

            Set<Object> keys = map.keySet();
            System.out.println("All keys are: " + keys);
// To get all key: value
            for(Object key: keys){
                System.out.println(key + ": " + map.get(key));
            }
            
        }


//        Date dateNow = new Date();
//        SimpleDateFormat formatForDateNow = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");
//        System.out.println(formatForDateNow.format(dateNow));



//                    map.put("ФИО", fullName);
//                    map.put("Дата рождения", dateBirth);
//                    map.put("Телефон", phone);
//                    map.put("Адрес", address);
//                    map.put("Дата изменения", modify);




//        m1.put(phone, fio);
//        m1.put(phone, dateBirth);
//        m1.put(phone, address);
//        m1.put(phone, modify);
//        System.out.println("Элементы карты");
//        System.out.print("\t \n" + m1);
//        System.out.print("\t \n" + m1);


        //List a1 = new ArrayList();







    }

    public void allContact () {
        //        System.out.println("-for-");
//        for (Object me : map.entrySet()) {
//            System.out.println("Key: "+map.getKey() + " & Value: " + map.getValue());
//        }
//        System.out.println();


    }

}

