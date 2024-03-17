package com.xie.type;

public class TypeConversionDemo1 {
    public static void main(String[] args) {
        // 理解自動類型轉換
        byte a = 12;
        int b = a;
        System.out.println(a);
        System.out.println(b);

        int c = 100; // 4字節
        double d = c; // 8字節
        System.out.println(d);

        char ch = 'a'; // 2字節 'a' 97 =>  00000000 01100001
        int i = ch; // 4字節 000000000 000000000 000000000 01100001
        System.out.println(i);
    }
}
