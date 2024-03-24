package com.xie.d1_algorithm;

import java.util.Arrays;

/**
 * 選擇排序
 */
public class Test2 {
    public static void main(String[] args) {
        // 1. 準備一個數組
        int[] arr = {5,1,3,2};

        // 2. 控制選擇幾輪
        for (int i = 0; i < arr.length - 1; i++) {
            // i = 0 第一輪  j = 1 2 3
            // i = 1 第二輪  j = 2 3
            // i = 2 第三輪  j = 3
            int minIndex = i;
            // 3.控制每輪選擇幾次
            for (int j = i + 1; j < arr.length; j++) {
                // 判斷當前位置是否大於選擇位置處的元素值，若大於則交換
                if(arr[minIndex] > arr[j]){
                    minIndex = j;
                }
            }
            // 決定是否交換
            if(i != minIndex){
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }

        }
        System.out.println(Arrays.toString(arr));
    }
}
