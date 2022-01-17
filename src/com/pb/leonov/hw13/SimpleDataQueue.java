package com.pb.leonov.hw13;

import static com.pb.leonov.hw13.s01multithreading.ConsoleColors.ANSI_RED;
import static com.pb.leonov.hw13.s01multithreading.ConsoleColors.ANSI_RESET;

public class SimpleDataQueue {
    private int head;
    private int tail;
    private volatile int elementsCount;
    private final Integer[] myArrayQueue;

    public SimpleDataQueue(int size) {
        myArrayQueue = new Integer[size];
    }

    public void add(Integer element) {
        synchronized (this) {
            while (elementsCount >= 5) {
                try {
                    System.out.println(ANSI_RED + "Writer thread sleep" + ". Elements in Queue: " + elementsCount + ANSI_RESET);
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            myArrayQueue[head] = element;
            elementsCount++;

            if (head == myArrayQueue.length - 1) {
                head = 0;
            } else {
                head++;
            }
            notifyAll();
        }
    }

    public Integer remove() {
        synchronized (this) {
            while (getElementsCount() == 0) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            Integer value = myArrayQueue[tail];
            myArrayQueue[tail] = null;
            elementsCount--;

            if (tail == myArrayQueue.length - 1) {
                tail = 0;
            } else {
                tail++;
            }

            if (elementsCount <= 0) {
                notifyAll();
            }
            return value;
        }
    }

    public synchronized int getElementsCount() {
        return elementsCount;
    }
}
