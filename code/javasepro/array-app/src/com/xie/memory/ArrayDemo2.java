package com.xie.memory;

public class ArrayDemo2 {
    public static void main(String[] args) {
        // 目標: 多個變量指向同一個數組對象的形式，及注意事項
        int[] arr1 = new int[]{11, 22, 33};

        int[] arr2 = arr1;

        System.out.println(arr1);
        System.out.println(arr2);

        arr2[1] = 99;
        System.out.println(arr1[1]); // 因為arr1跟arr2地址一樣，因此arr2對數組修改，arr1也抓出修改後的值
    }
}
