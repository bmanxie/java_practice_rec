package com.xie.demo;

public class Test2 {
    public static void main(String[] args) {
        // 目標: 數組反轉
        // 將[10, 20, 30, 40, 50] 反轉成 [50, 40, 30, 20, 10]
        int[] arr = {10, 20, 30, 40, 50};
        //            i               j

        // 定義一個循環，設計兩個變量，一個在前，一個在後
        for (int i = 0, j = arr.length -1; i < j; i++, j--){
            //1. 定義一個臨時變量儲存後面的值
            int temp = arr[j];
            //2. 把前面的位置賦值後面的位置
            arr[j] = arr[i];
            //3. 把臨時變量的值賦值給前面的位置
            arr[i] = temp;
        }

        // 遍歷數組看看是否成功
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
