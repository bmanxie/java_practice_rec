package com.xie.d6_sigleInstance;

public class Test {
    public static void main(String[] args) {
        // 目標: 掌握單例設計模式的寫法
        // 單例設計模式確保了一個類只有一個物件
        A a1 = A.getObject();
        A a2 = A.getObject();
        System.out.println(a1);
        System.out.println(a2);

    }
}
