package com.pb.leonov.hw10;

public class NumBox <T>  {

    private T[] arr;
    int size;

    public NumBox(int size) {
        size = this.size;
    }


    public T[] getArr() {
        return arr;
    }

    public void setArr(T[] arr) {
        this.arr = arr;
    }


    void add(T num) {
        arr.add(t);
    }//добавляющий число в массив. В случае если массив полон - выбросить исключение.


}
