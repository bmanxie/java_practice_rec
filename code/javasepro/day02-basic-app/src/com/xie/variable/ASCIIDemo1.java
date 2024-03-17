package com.xie.variable;

public class ASCIIDemo1 {
    public static void main(String[] args) {
        // 掌握ASCII編碼特點
        System.out.println('a' + 10); // 97 + 10 = 107
        System.out.println('A' + 10); // 65 + 10 = 75
        System.out.println('0' + 10); // 48 + 10 = 58

        // 二進制 八進制 十六進制
        int a1 = 0B01100001;
        System.out.println(a1);

        int a2 = 0141;
        System.out.println(a2);

        int a3 = 0XFA;
        System.out.println(a3);
    }
}
