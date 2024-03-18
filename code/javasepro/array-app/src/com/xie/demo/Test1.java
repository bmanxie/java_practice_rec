package com.xie.demo;

public class Test1 {
    public static void main(String[] args) {
        // 目標: 數組元素求最值
        // 1. 把數據拿到程序中，用數組裝起來
        int[] facescores = new int[]{15, 9000, 10000, 20000, 9500, -5};

        // 2. 定義一個變量用來記住最大值
        int max = facescores[1]; // 15

        // 3. 從數組的第二個位置開始遍歷
        for (int i = 1; i < facescores.length; i++){
            // 1, 2, 3, 4, 5
            if (facescores[i] > max){
                max = facescores[i];
            }
        }
        System.out.println("最高顏值是:" + max);
    }
}
