package com.pb.leonov.hw9.Example.src.s01streams;

import java.io.FileInputStream;
import java.io.InputStream;

public class InputStreamTest2 {
    public static void main(String[] args) {

        try (InputStream is = new FileInputStream("src\\com\\pb\\leonov\\hw9\\Example\\files\\s01-input-text.txt")) {

            int available = is.available();
            byte[] buffer = new byte[available];
            int i = 0;

            int data = is.read();
            while (data != -1) {
                buffer[i] = (byte) data;
                data = is.read();
                i++;
            }

            System.out.println(new String(buffer));
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
