package com.pb.leonov.hw9;

import java.io.*;
import java.util.Random;
import java.util.Scanner;

public class FileNumbers {
    public static void main(String[] args) throws IOException {
        createNumbersFile();
        createOddNumbersFile();
    }

    public static void createNumbersFile() {

        // Creates a Writer using FileWriter
        try (Writer writer = new FileWriter("src\\com\\pb\\leonov\\hw9\\numbers.txt")) {

            int[][] array = new int[10][10];

            for (int i = 0; i < array.length; i++, System.out.println()) {
                for(int j = 0; j < array.length; j++) {
                    Random random = new Random();
                    array[i][j] = random.nextInt(99) +1;
                   System.out.print(array[i][j] + " ");
                    writer.write(array[i][j] + " ");
                }
                    writer.write("\n");
            }

        } catch (Exception e) {
            e.getStackTrace();
        }

    }

    public static void createOddNumbersFile() throws IOException {
        System.out.println("-----------------------------------\nОбнуление четных чисел и перезапись в odd-numbers.txt ");

        String path = "src\\com\\pb\\leonov\\hw9\\numbers.txt";

        File file = new File(path);

        Scanner scanner = new Scanner(file);

        try(Writer writer = new FileWriter("src\\com\\pb\\leonov\\hw9\\odd-numbers.txt")) {

            int[][] array = new int[10][10];

            for (int i = 0; i < array.length; i++, System.out.println()) {
                for (int j = 0; j < array.length; j++) {
                    while (scanner.hasNextInt()) {
                        int qwe = Integer.parseInt(String.valueOf(scanner.nextInt()));
                        if (qwe % 2 == 0) {
                            qwe = 0;
                        }
                        array[i][j] = qwe;

                        System.out.print(array[i][j] + " ");
                        writer.write(array[i][j] + " ");
                        break;
                    }
                }
                writer.write("\n");
            }

        }  catch (Exception ex) {
            System.out.println("Error with file read: " + ex);
        }
        System.out.println("Read from file done!");
    }
}
