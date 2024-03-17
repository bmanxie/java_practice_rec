package com.xie.type;

public class TypeConversionDemo2 {
    public static void main(String[] args) {
        // 目標: 掌握表達式的類型轉換機制
        byte a = 10;
        int b = 20;
        long c = 30;
        long rs = a + b + c;
        System.out.println(rs);

        double rs2 = a + b + 1.0;
        System.out.println(rs2);

        byte i = 10;
        short j = 30;
        int rs3 = i + j; // 在表達式內 byte , short 都被當作int (防止溢出)
        System.out.println(rs3);

        // 面試筆試題
        byte b1 = 110;
        byte b2 = 80;
        // 定義b3 = b1 + b2 : b3 的類型為?
        // A. int
        int b3 = b1 + b2;
        System.out.println(b3);
    }
}
