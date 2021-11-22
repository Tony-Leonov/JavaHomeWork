package com.pb.leonov.hw9.Example.src.s03file;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import static java.nio.file.StandardCopyOption.REPLACE_EXISTING;

public class FilesTest {
    public static void main(String[] args) throws Exception {
        //создание файла
        Path testFile1 = Files.createFile(Paths.get("D:\\Users\\dn100594lav\\Desktop\\testFile111.txt"));
        System.out.println("Был ли файл успешно создан?");
        System.out.println(Files.exists(Paths.get("D:\\Users\\dn100594lav\\Desktop\\testFile111.txt")));

        //создание директории
        Path testDirectory = Files.createDirectory(Paths.get("D:\\Users\\dn100594lav\\Desktop\\testDirectory"));
        System.out.println("Была ли директория успешно создана?");
        System.out.println(Files.exists(Paths.get("D:\\Users\\dn100594lav\\Desktop\\testDirectory")));

        //перемещаем файл с рабочего стола в директорию testDirectory. Перемещать надо с указанием имени файла в папке!
        testFile1 = Files.move(testFile1, Paths.get("D:\\Users\\dn100594lav\\Desktop\\testDirectory\\testFile111.txt"), REPLACE_EXISTING);

        System.out.println("Остался ли наш файл на рабочем столе?");
        System.out.println(Files.exists(Paths.get("D:\\Users\\dn100594lav\\Desktop\\testFile111.txt")));

        System.out.println("Был ли наш файл перемещен в testDirectory?");
        System.out.println(Files.exists(Paths.get("D:\\Users\\dn100594lav\\Desktop\\testDirectory\\testFile111.txt")));

        //удаление файла
        Files.delete(testFile1);
        System.out.println("Файл все еще существует?");
        System.out.println(Files.exists(Paths.get("D:\\Users\\dn100594lav\\Desktop\\testDirectory\\testFile111.txt")));
    }
}
