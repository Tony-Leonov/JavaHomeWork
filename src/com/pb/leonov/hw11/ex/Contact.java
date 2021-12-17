package com.pb.leonov.hw11.ex;

import java.time.LocalDateTime;
import java.util.Collections;
import java.util.HashMap;
import java.util.Set;

public class Contact  {

    public String fullName;
    public String dateBirth;
    public String phone;
    public String address;
    public LocalDateTime modify;

    public Contact(String next, String next1, String next2, String next3) {

        this.fullName=next;
        this.dateBirth=next1;
        this.phone=next2;
        this.address=next3;
        this.modify = LocalDateTime.now();

        System.out.println(next);



        System.out.println();

//        Set<Object> keys = Collections.singleton(Contact.keySet());
//        System.out.println("All keys are: " + keys);
//        // To get all key: value
//        for(Object key: keys){
//            System.out.println(key + ": " + Contact.get(key));
//        }
    }

}

