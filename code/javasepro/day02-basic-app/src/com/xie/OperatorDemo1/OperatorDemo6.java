package com.xie.OperatorDemo1;

public class OperatorDemo6 {
    public static void main(String[] args) {
        // 目標: 掌握三元運算符
        // 條件表達式 ? 值1 : 值2
        // 表達式為true，輸出值1。
        // 表達式為false，輸出值2。
        double score = 95.5;
        String rs = score >= 60 ? "成績及格" : "成績不及格";
        System.out.println(rs);

        // 找出2個整數中較大值
        int a = 99;
        int b = 77;
        int max = a > b ? a:b;
        System.out.println(max);

        // 找出3個整數中較大值
        int i = 10;
        int j = 45;
        int k = 30;
        int temp = i > j ? i : j;
        int max2 = temp > k ? temp : k;
        System.out.println(max2);

    }
}
