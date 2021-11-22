package com.pb.leonov.hw9;

import java.io.FileWriter;
import java.io.Writer;
import java.util.Random;

public class FileNumbers {


    public static void main(String[] args) {

        int i;
        for (i = 0; i < 5;) {
            Random random = new Random();
            int x = random.nextInt(101);
            int[] array = new int[] { x, +x};


            System.out.println("rand x: " + x);
            i++;

            System.out.println("rand x: " + array);

            String data = "This is the data in the output file123123";

            // Creates a Writer using FileWriter
            try (Writer writer = new FileWriter("src\\com\\pb\\leonov\\hw9\\test_write.txt")) {

                // Writes string to the file
                writer.write(String.valueOf(array));

            } catch (Exception e) {
                e.getStackTrace();
            }


        }
        String data = "This is the data in the output file123123";


        // Creates a Writer using FileWriter
        try (Writer writer = new FileWriter("src\\com\\pb\\leonov\\hw9\\Example\\files\\test_write.txt")) {

            // Writes string to the file
            writer.write(data);

        } catch (Exception e) {
            e.getStackTrace();
        }

    }


    public void createNumbersFile () {

    }

    public void createOddNumbersFile () {

    }
}
