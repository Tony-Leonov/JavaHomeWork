package com.pb.leonov.hw13;

import java.util.Random;

import static com.pb.leonov.hw13.s01multithreading.ConsoleColors.ANSI_BLUE;
import static com.pb.leonov.hw13.s01multithreading.ConsoleColors.ANSI_RESET;


public class Consumer implements Runnable {

    private final SimpleDataQueue queue;
    private volatile boolean ready = false;

    public Consumer(SimpleDataQueue queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        Random rand = new Random();

        while(!(ready && (queue.getElementsCount() == 0))) {
            try {
                Thread.sleep(rand.nextInt(1000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            queue.remove(); // Возвращает с удалением элемент из начала очереди. Если очередь пуста, генерирует исключение NoSuchElementException

            System.out.println(ANSI_BLUE + "Reader - Queue " + "size: " + queue.getElementsCount() + ANSI_RESET);
        }
        System.out.println("   Отключен поток Consumer" + Thread.currentThread().getName());

    }

    public void shutdown() {
        ready = true;
    }

}
