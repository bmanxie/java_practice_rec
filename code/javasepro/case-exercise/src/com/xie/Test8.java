package com.xie;

public class Test8 {
    public static void main(String[] args) {
        // 目標: 印出99乘法表
        // 1. 定義1個for循環要印出幾列
        for (int i = 1; i<= 9; i++){
            // 2. 定義每列有幾個(行)
            for (int j = 1; j <= i; j++) {
                // i列 j行
                System.out.print(j + " X " + i + " = " +(j * i) + "\t"); // \t : tab
            }
            System.out.println(); // 換行
        }
    }
}
