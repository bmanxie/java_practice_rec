package com.xie.OperatorDemo1;

public class OperatorDemo1 {
    public static void main(String[] args) {
        // 目標: 掌握基本算術運算符使用
        int a = 10;
        int b = 2;
        System.out.println(a + b); // 12
        System.out.println(a - b); // 8
        System.out.println(a * b); // 20
        System.out.println(a / b); // 5
        System.out.println(5 / 2); // 2.5 ==> 2
        System.out.println(5.0 / 2); // 2.5
        int i = 5;
        int j = 2;
        System.out.println(1.0 * i / j); // 2.5
        System.out.println(a % b); // 0 取餘數
        System.out.println("=========================================");

        // + 與字符串可以作連接符，結果還是連接符
        // "abc" + 5 ---> "abc5"
        int a2 = 5;
        System.out.println("abc" + a2); // "abc5"
        System.out.println(a2 + 5); // 10
        System.out.println("hello" + a2 + 'a'); // "hello5a"
        System.out.println(a2 + 'a' + "hello"); // 5 + 97先算，再跟字串連接 "102hello"
    }
}
