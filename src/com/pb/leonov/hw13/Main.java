package com.pb.leonov.hw13;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws InterruptedException, IOException {

        SimpleDataQueue queue = new SimpleDataQueue(5);
        Producer producer = new Producer(queue);
        Consumer consumer = new Consumer(queue);

        Thread t1 = new Thread(producer);
        Thread t2 = new Thread(consumer);

        t1.start();
        t2.start();

        //producer.shutdown(); // Выключить поток продюсера
        //consumer.shutdown();  // Выключить поток консьюмера
        //System.out.println("Finish!");
    }
}
