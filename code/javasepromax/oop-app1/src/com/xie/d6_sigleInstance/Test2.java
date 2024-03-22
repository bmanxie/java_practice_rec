package com.xie.d6_sigleInstance;

public class Test2 {
    public static void main(String[] args) {
        // 掌握懶漢式單例的寫法
        B b1 = B.getInstance(); // 第一次拿對象
        B b2 = B.getInstance();
        B b3 = b1;
        System.out.println(b1 == b2);
        System.out.println(b3);
        System.out.println(b1);
    }
}
