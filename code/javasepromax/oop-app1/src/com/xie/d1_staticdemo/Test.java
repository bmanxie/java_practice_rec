package com.xie.d1_staticdemo;

public class Test {
    public static void main(String[] args) {
        // 目標: 掌握有無static修飾成員變量的方法
        // 1. 類變量用法
        // 類名.類變量(推薦)
        Student.name = "劉備";

        // 對象.類變量(不推薦)
        Student s1 = new Student();
        s1.name = "關羽";

        Student s2 = new Student();
        s2.name = "張飛";

        System.out.println(s1.name); // 張飛
        System.out.println(Student.name); // 張飛

        // 2. 實例變量的用法: 屬於每個對象的變量
        // 對象.實例變量
        s1.age = 23;
        s2.age = 18;
        System.out.println(s1.age); // 23
        // System.out.println(Student.age); // 錯誤

    }
}
