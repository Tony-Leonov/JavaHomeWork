package com.pb.leonov.hw10;

public class NumBox <T extends Number>  {

    private final T[] num;
    private int size = 0;

    public int getSize() {
        return size;
    }

    public NumBox(int size) {
        if (size <= 0) {
            throw new IllegalArgumentException("Param size must be > 0");
        }
        num = (T[]) new Number[size];
    }

    public void add(T num) {
        if (size >= this.num.length) {
            throw new NumBoxIsFullException("Current size is " + size);
        }
        this.num[size] = num;
        size++;
    }

    public T get(int index) {
        if (index >= size) {
            return null;
        }
        return num[index];
    }

    public int length() {
        return size;
    }

    public double sum() {
        if (size < 1) {
            throw new NumBoxIsEmptyException("NumBox is empty");
        }
        double sum = 0;
        for (int i = 0; i < size; i++) {
            sum += num[i].doubleValue();
        }
        return sum;
    }

    public double average() {
        return sum() / size;
    }

    public T max() {
        if (size < 1) {
            throw new NumBoxIsEmptyException("NumBox is empty");
        }
        double max = num[0].doubleValue();
        int maxIndex = 0;
        for(int i = 1; i < size; i++) {
            if (num[i].doubleValue() > max) {
                max = num[i].doubleValue();
                maxIndex = i;
            }
        }
        return num[maxIndex];
    }
}
