package com.xie.demo;

import java.util.Random;
import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        // 目標: 完成隨機排序
        // 1. 定義一個動態初始化的數組用來儲存5名員工的編號
        int[] codes = new int[5];

        // 2. 提示用戶輸入5名員工的編號
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < codes.length; i++){
            System.out.println("輸入第" + (i+1) +"位員工編號");
            int code = sc.nextInt();
            codes[i] = code;
        }

        // 3. 打亂數組元素順序
        Random r = new Random();
        for (int i = 0; i < codes.length; i++) {
            // 利用random隨機取一個索引
            int index = r.nextInt(codes.length); // 0-4
            // 將這個索引值存在temp
            int temp = codes[index];
            // 將i的數據賦值給選中的索引
            codes[index] = codes[i];
            // 將temp放入i
            codes[i] = temp;
        }

        // 4. 遍歷數組中的編號輸出
        for (int i = 0; i < codes.length; i++) {
            System.out.print(codes[i] + " ");
        }
    }
}
