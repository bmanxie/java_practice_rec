package com.xie.d9_generics_class;

public class MyArrayLsit<E>{
    private Object[] arr = new Object[10];
    private int size; // 紀錄當前位置
    public boolean add(E e){
        arr[size++] = e;
        return true;
    }

    public E get(int index){
        return (E) arr[index];
    }
}
