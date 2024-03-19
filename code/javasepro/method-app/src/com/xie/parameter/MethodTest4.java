package com.xie.parameter;

public class MethodTest4 {
    public static void main(String[] args) {
        // 目標: 判斷兩個int類型數組是否一樣
        int[] arr1 = {1,2,3};
        int[] arr2 = {1,2,3};
        System.out.println(equals(arr1, arr2));
    }

    public static boolean equals(int[] arr1, int[] arr2){
        // 1. 判斷arr1和arr2是否都是null
        if(arr1 == null && arr2 == null){
            return true;
        }

        // 2. 判斷arr1是null, 或arr2是null
        if(arr1 == null || arr2 == null){
            return false;
        }

        // 3. 判斷2個數組長度是否一樣，如果長度不同返回false
        if(arr1.length != arr2.length){
            return false;
        }

        // 4. 2個數組長度一樣，比較內容是否一樣
        for (int i = 0; i < arr1.length; i++){
            // 判斷目前位置2數組的元素是否一樣，不一樣直接返回false
            if (arr1[i] !=  arr2[i]){
                return false;
            }
        }
        return true;
    }
}
