package com.pb.leonov.hw9.Example.src.s04scanner;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class ScannerFileTest {
    public static void main(String[] args) {
        Path path = Paths.get("src\\com\\pb\\leonov\\hw9\\Example\\files\\s01-input-text.txt");

        try (Scanner scan = new Scanner(path)) {

            // scan.hasNextLine()

            while (true) {
                String str = scan.nextLine();
                System.out.println(str);
            }

        } catch (NoSuchElementException ex) {
            System.out.println("Файл прочитан.");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
