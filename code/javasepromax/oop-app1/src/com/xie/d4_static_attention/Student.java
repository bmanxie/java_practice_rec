package com.xie.d4_static_attention;

public class Student {
    static String schoolName; //類變量
    double score; // 實例變量
    // 1. 類方法中可以直接訪問類的成員，不可以直接訪問實例成員
    public static void printHelloWorld(){
        schoolName = "北科";
        printHelloWorld2();

        // System.out.println(score); // 錯誤
        // printPass(); // 錯誤

        // System.out.println(this); // 錯誤
    }

    // 類方法
    public static void printHelloWorld2(){

    }

    // 2.實例方法中可以直接訪問類成員，也可以訪問實例成員
    // 實例方法
    public void printPass(){
        schoolName = "北科2";
        printHelloWorld2();

        System.out.println(score);
        printPass2();

        System.out.println(this);
    }

    // 實例方法
    public void printPass2(){

    }

}
