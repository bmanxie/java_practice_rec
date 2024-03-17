package com.xie.variable;

public class VariableDemo2 {
    public static void main(String[] args) {
        // 目標: 搞懂變量的注意事項
        // 1. 變量要先聲明才能使用
        int age = 18;
        System.out.println(age);
        System.out.println("=================================");

        // 2. 變量的類型，什麼類型就裝什麼數據，否則出錯
        // int age2 = "十八";
        // System.out.println(age2);

        // 3. 變量的定義從'}' 截止的範圍有效，同一個範圍內，定義的名稱不能一樣
        {
            int a = 19;
            // int a = 23;
            System.out.println(a);
        }
        //System.out.println(a);
        System.out.println("=================================");

        //4. 變量定義可以先不賦值，但使用前，變量內必須有值，否則出錯
        int math;
        math = 85;
        System.out.println(math);
    }
}
