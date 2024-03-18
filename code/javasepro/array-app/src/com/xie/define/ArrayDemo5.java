package com.xie.define;

public class ArrayDemo5 {
    public static void main(String[] args) {
        // 目標: 掌握動態初始化數組
        // 1. 格式: 數據類型[] 數組名 = new 數據類型[長度];
        // 默認值 :
        //      byte, short, char, int, long :0
        //      float, double :0.0
        //      boolean :false
        //      類、接口、數組、String :null

        int[] ages = new int[3]; // ages = [0, 0, 0]

        System.out.println(ages[0]);
        System.out.println(ages[1]);
        System.out.println(ages[2]);

        ages[0] = 22;
        ages[1] = 23;
        ages[2] = 24;

        System.out.println(ages[0]);
        System.out.println(ages[1]);
        System.out.println(ages[2]);

        System.out.println("===========");
        // 一開始不知道有多少元素也不知道數值，可以先定義一個變量
        int personCounts = 4;
        int[] persons = new int[personCounts];
        for (int i = 0; i < persons.length; i++){
            System.out.println(persons[i]);
        }
    }
}
