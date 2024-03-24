package com.xie.d1_algorithm;

import java.util.Arrays;

/**
 * 掌握冒泡排序
 */
public class Test1 {
    public static void main(String[] args) {
        // 1. 準備一個數組
        int[] arr = {5,2,3,1};

        // 2. 定義一個循環控制排幾輪
        for (int i = 0; i < arr.length -1 ; i++) {
            // i = 0 1 2        [5, 2, 3, 1]    次數(數組長度 - i - 1)
            // i = 0 第一輪       0  1  2        3
            // i = 1 第二輪       0  1           2
            // i = 2 第三輪       0              1

            // 3. 定義一個每輪比較幾次
            for (int j = 0; j < arr.length - i - 1; j++) {
                // 判斷當前位置元素值，是否大於後一個位置的元素值，如果大則交換
                if(arr[j] > arr[j+1]){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
