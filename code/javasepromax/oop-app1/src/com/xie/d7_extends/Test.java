package com.xie.d7_extends;

public class Test {
    public static void main(String[] args) {
        // 認識繼承，掌握繼承的作法
        // 讓一個類和另一個類建立父子關係
        B b = new B();
        System.out.println(b.i);
        // System.out.println(b.j); // 錯誤
        System.out.println(b.k);
        // System.out.println(b.l); // 錯誤

        b.print1();
        // b.print2(); // 錯誤
        b.print3();

    }
}
