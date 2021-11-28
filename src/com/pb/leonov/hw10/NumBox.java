package com.pb.leonov.hw10;

public class NumBox <T>  {

    public T[][] arr;
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


    void add(int i, T number) {  //добавляющий число в массив. В случае если массив полон - выбросить исключение.
        add(arr[i][(T) number]);
    }
}
