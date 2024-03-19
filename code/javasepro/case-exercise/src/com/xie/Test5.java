package com.xie;

public class Test5 {
    public static void main(String[] args) {
        // 目標: 數組拷貝
        int[] arr = {11,22,33};
        int[] arr2 = copy(arr);
        printArray(arr2);
        int[] arr3 = arr; // 只是賦值 地址
        // 拷貝與賦值不同
        System.out.println(arr);
        System.out.println(arr2);
        System.out.println(arr3);
    }

    public static void printArray(int[] arr){
        System.out.print("[");
        for(int i = 0; i < arr.length; i++){
            System.out.print(i == arr.length - 1 ? arr[i] : arr[i] + ", ");
        }
        System.out.println("]");
    }
    public static int[] copy(int[] arr){
        // arr = [11,22,33]

        // 1. 創建一個長度一樣的數組
        int[] arr2 = new int[arr.length];

        // 2. 把原數組的元素對應位置給新數組
        for (int i = 0; i < arr.length; i++){
            arr2[i] = arr[i];
        }

        return arr2;
    }
}
