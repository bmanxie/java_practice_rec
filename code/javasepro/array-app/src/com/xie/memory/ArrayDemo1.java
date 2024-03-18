package com.xie.memory;

public class ArrayDemo1 {
    public static void main(String[] args) {
        // 目標: 掌握普通變量，數組在電腦中的執行原理，Java程序在電腦的執行過程

        // 方法區 棧內存 堆內存
        int a = 20; // 棧內存
        System.out.println(a);

        int[] arr = new int[]{11, 22, 33}; // arr在棧內存:儲存數組對象在堆內存的地址 {11, 22, 33}:儲存在堆內存
        System.out.println(arr);

        System.out.println(arr[1]);

        arr[0] = 44;
        arr[1] = 55;
        arr[2] = 66;
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
