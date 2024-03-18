package com.xie.define;

public class ArrayDemo1 {
    public static void main(String[] args) {
        // 目標: 掌握array定義方式
        // 1. 靜態初始化array
        //      數據類型[] array名稱 = new 數據類型[]{元素1,元素2,...}
        int[] ages = new int[]{22, 25, 24, 23};
        double[] scores = new double[]{76, 83.5, 95, 88};
        // 數組變量名儲存是引用數據類型，儲存的數組在內存中的地址
        System.out.println(ages); //[I@10f87f48 I: int @: y在 地址:10f87f48

        // 2. 簡化寫法
        // 數據類型[] array名 = {元素1,元素2,...}
        int[] age2 = {22, 23, 24};

        // 3. 數據類型[] array名 也可寫成 數據類型 array名[]
        int age3[] = {24, 25, 26};
    }
}
