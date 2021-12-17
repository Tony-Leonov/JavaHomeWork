package com.pb.leonov.hw11;
import java.time.LocalDateTime;

public class Contact  {


    public String fullName;
    public String dateBirth;
    public String phone;
    public String address;
    public LocalDateTime modify;

    public Contact (String fullName, String dateBirth, String phone, String address, String modify) {
        this.fullName=fullName;
        this.dateBirth=dateBirth;
        this.phone=phone;
        this.address=address;
        this.modify= LocalDateTime.parse(modify);
    }

    public Contact(String next, String next1, String s, String s1, String s2, String s3) {
    }
}
