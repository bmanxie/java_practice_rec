package com.xie.parameter;

public class MethodDemo1 {
    public static void main(String[] args) {
        // 目標: 理解方法的參數傳遞機制: 值傳遞
        // 傳輸實參儲存值的副本
        int a = 10;
        change(a); //20
        System.out.println("main:" + a); // 10
    }
    public static void change(int a){
        System.out.println("change1:" + a); // 10
        a = 20;
        System.out.println("change2:" + a); // 20
    }
}
