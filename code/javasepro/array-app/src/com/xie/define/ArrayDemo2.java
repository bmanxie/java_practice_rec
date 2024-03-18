package com.xie.define;

public class ArrayDemo2 {
    public static void main(String[] args) {
        // 目標: 掌握數組的訪問
        int[] arr = {12, 24, 36};
                    //0   1   2

        // 1. 訪問全部數據
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);

        // 2. 修改數組中的數據
        arr[0] = 66;
        arr[2] = 100;
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);

        // 3. 知道數組內的元素個數: 數組名.length
        System.out.println(arr.length);


    }
}
