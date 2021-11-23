package com.pb.leonov.hw9;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Random;

public class qwe {
    public static void main(String[] args) throws IOException {

        int[] array;
        array = new int[101];
        for (int i = 0; i < array.length; i++) {
            Random random = new Random();
            array[i] = random.nextInt(99) +1;
            System.out.print(array[i] + " ");

//            if (i == 9 || i == 19 || i == 29 || i == 39 || i == 49 || i == 59 || i == 69 || i == 79 || i == 89) {
//
//            }

        }

        // Creates a Writer using FileWriter
        try (Writer writer = new FileWriter("src\\com\\pb\\leonov\\hw9\\test_write1.txt")) {

            // Writes string to the file
            writer.write(Arrays.toString(array));

        } catch (Exception e) {
            e.getStackTrace();
        }


        ///////////////////////////////////////////////////////////////////////////////////////
        int size = (int) Files.size(Paths.get("src\\com\\pb\\leonov\\hw9\\test_write1.txt"));

        // Creates an array of character
        int[] arrayq = new int[101];

        // Creates a reader using the FileReader
        try (Reader reader = new FileReader("src\\com\\pb\\leonov\\hw9\\test_write1.txt")) {

            // Checks if reader is ready
            System.out.println("\nIs there data in the stream?  " + reader.ready());


            System.out.println("Data in the stream:");
            System.out.println(arrayq);

            for (int i = 0; i < arrayq.length; i++) {
                if(i%2 == 1){
                    arrayq[i] = 0;
                }
            }
            System.out.println(Arrays.toString(arrayq));
            //System.out.println(arrayq);




        } catch(Exception e) {
            e.printStackTrace();
        }




        }

    }

