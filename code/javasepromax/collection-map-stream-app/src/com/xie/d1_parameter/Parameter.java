package com.xie.d1_parameter;

import java.util.Arrays;

/**
 * 目標: 認識可變參數，掌握其作用
 */
public class Parameter {
    public static void main(String[] args) {
        //特點:
        test(); // 不傳數據
        test(10); // 傳輸一個數據
        test(10,20,30); // 傳輸多個數據
        test(new int[]{10,20,30,40}); // 傳輸一個數組給可變參數
    }

    // 注意事項1: 一個形參類表中，只能有一個可變參數
    // 注意事項2: 可變參數必須放在形參類表的最後面
    public static void test(int...nums){
        // 可變參數在方法內部，本質就是一個數組
        System.out.println(nums.length);
        System.out.println(Arrays.toString(nums));
        System.out.println("==================");
    }
}
