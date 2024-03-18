package com.xie.define;

public class ArrayTest4 {
    public static void main(String[] args) {
        // 目標: 數組元素求和
        int[] money = {16, 26, 36, 6, 100};
        int sum = 0;
        for (int i = 0; i < money.length; i++) {
            // i = 0 1 2 3 4
            sum += money[i];
        }
        System.out.println("銷售總額:" + sum);
    }
}
