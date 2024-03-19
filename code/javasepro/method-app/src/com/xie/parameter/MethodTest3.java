package com.xie.parameter;

public class MethodTest3 {
    public static void main(String[] args) {
        // 目標: 完成輸出int類型的數組內容
        int[] arr = {1,2,3,4};
        printArray(arr);

        int[] arr2 = null;
        printArray(arr2);

    }

    public static void printArray(int[] arr){

        if(arr == null){
            System.out.println(arr);
            return;
        }

        System.out.print("[");
        for(int i = 0; i < arr.length; i++){
//            if(i == arr.length - 1){
//                System.out.print(arr[i]);
//            }else {
//                System.out.print(arr[i] + ", ");
//            }
            System.out.print(i == arr.length - 1 ? arr[i] : arr[i] + ", ");
        }
        System.out.println("]");
    }
}
