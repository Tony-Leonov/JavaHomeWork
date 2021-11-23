package com.pb.leonov.hw9;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Random;

public class FileNumbers {


    public static void main(String[] args) throws IOException {

        createNumbersFile();
        createOddNumbersFile();

    }

    public static void createNumbersFile() {

        // Creates a Writer using FileWriter
        try (Writer writer = new FileWriter("src\\com\\pb\\leonov\\hw9\\test_write1.txt")) {

            int[][] array = new int[10][10];
            for (int i = 0; i < array.length; i++) {
                for(int j = 0; j < array.length; j++) {
                    Random random = new Random();
                    array[i][j] = random.nextInt(99) +1;
                    System.out.print(array[i][j] + " ");
                    writer.write(array[i][j] + " ");
                }
            }

        } catch (Exception e) {
            e.getStackTrace();
        }

    }

    public static void createOddNumbersFile() throws IOException {
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
