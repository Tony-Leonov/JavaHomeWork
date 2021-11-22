package com.pb.leonov.hw9.Example.src.s02readerwriter;

import java.io.FileWriter;
import java.io.Writer;

public class WriterTest {
    public static void main(String[] args) {
        String data = "This is the data in the output file123123";

        // Creates a Writer using FileWriter
        try (Writer writer = new FileWriter("files/s01-writer.txt")) {

            // Writes string to the file
            writer.write(data);

        } catch (Exception e) {
            e.getStackTrace();
        }
    }
}
