package com.xie.d2_algorithm;

/**
 * 二分查找
 */
public class Test1 {
    public static void main(String[] args) {
      // 1. 準備一個數組
      int[] arr = {7,23,55,78,82,103,133,159};

      System.out.println(binarySearch(arr, 82));
    }

    public static int binarySearch(int[] arr, int data){
        // 1. 定義兩個變量，一個在左邊，一個在右邊
        int left = 0;
        int right = arr.length - 1;

        // 2. 定義一個循環控制折半
        while (left <= right){
            // 3. 每次折半算出中間位置處的索引
            int middle = (left+right)/2;
            // 4. 判斷當前的元素值，與中間位置處的元素值大小情況
            if(data < arr[middle]) {
                // 往左邊找. 截止位置(右邊位置) = 中間位置 - 1
                right = middle - 1;
            } else if (data > arr[middle]) {
                // 往右邊找. 起始位置(左邊位置) = 中間位置 + 1
                left = middle + 1;
            } else {
                // 中間位置的元素值，剛好是我們要的元素值
                return middle;
            }
        }
        return -1; // 沒有該數據
    }
}
