package com.xie.d1_api_object;

public class Test {
    public static void main(String[] args) {
        // 目標: 掌握Object類提供的常用方法
        Student s1 = new Student("劉備", 22);
        // System.out.println(s1.toString());
        System.out.println(s1);

        Student s2 = new Student("劉備", 22);
        System.out.println(s2.equals(s1)); // equals 原本是判斷地址，重寫後判斷內容
        System.out.println(s2 == s1);

    }
}
