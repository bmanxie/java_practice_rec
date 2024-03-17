package com.xie.variable;

public class VariableDemo2 {
    public static void main(String[] args) {
        // 目標: 掌握基本數據類型使用
        // 1. byte short int long
        byte b = 127; // -128 ~ 127
        short s = 13244;
        int i = 23322112;
        long lg = 2888888888L; // 超過int的範圍，最後要加上L

        // 2. float double
        float fl = 3.14F; // 默認double，因此要加上F
        double db = 53.1;

        // 3. char
        char ch = 'a';
        char ch2 = '學';
        char ch3 = '習';

        // 4. boolean
        boolean flag = true;
        boolean flag2 = false;

        // 引用數據類型
        // String 稱為字符串類型，定義的變量可用來記住字符串數據
        String name = "學習";

    }
}
