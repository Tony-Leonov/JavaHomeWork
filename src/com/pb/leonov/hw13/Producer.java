package com.pb.leonov.hw13;

import java.util.Random;

import static com.pb.leonov.hw13.s01multithreading.ConsoleColors.ANSI_GREEN;
import static com.pb.leonov.hw13.s01multithreading.ConsoleColors.ANSI_RESET;

public class Producer implements Runnable {

    private final SimpleDataQueue queue;
    private volatile boolean ready = false;

    public Producer(SimpleDataQueue queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        Random rand = new Random();
        while(!ready) {
            try {
                Thread.sleep(rand.nextInt(1000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            queue.add(rand.nextInt(100));
            System.out.println(ANSI_GREEN + "Writer - Queue size: " + queue.getElementsCount() +  ANSI_RESET);
        }
        System.out.println("Ending " + Thread.currentThread().getName());
    }

    public void shutdown() {
        ready = true;
    }
}
