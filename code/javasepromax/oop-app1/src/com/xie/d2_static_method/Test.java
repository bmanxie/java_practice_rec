package com.xie.d2_static_method;

public class Test {
    public static void main(String[] args) {
        // 掌握有無static修飾方法的用法
        // 1. 類方法的用法
        // 類名.類方法(推薦)
        Student.printHelloWorld();

        // 對象.類方法(不推薦)
        Student s = new Student();
        s.printHelloWorld();

        // 2. 實例方法的用法
        s.score = 55;
        // 對象.實例方法
        s.printPass();

        // Student.printPass(); // 錯誤

    }
}
