package com.xie.OperatorDemo1;

public class OperatorDemo3 {
    public static void main(String[] args) {
        // 目標: 掌握擴展賦值運算符使用
        // = 為基本賦值運算符，由右往左
        // +=
        double a = 9.5;
        double b = 520;
        a += b; // a = (double) (a + b);
        System.out.println(a);

        // -=
        double i = 600;
        double j = 520;
        i -= j; // i = (double) (i - j);
        System.out.println(i);

        // *=
        int m = 10;
        int n = 5;
        m *= n; // m = (int) (m * n);
        System.out.println(m);

        // \=
        m /= n; // m = (int) (m / n);
        System.out.println(m);

        // %=
        m %= n; // m = (int) (m % n);
        System.out.println(m);

        System.out.println("=======================================");
        byte x = 10;
        byte y = 30;
        // x = (x + y); // 出錯
        //x = (byte) (x + y);
        x += y;
        System.out.println(x);
    }
}
