package com.xie.d14_arrays;

import java.util.Arrays;
import java.util.function.IntToDoubleFunction;

public class ArrayTest1 {
    public static void main(String[] args) {
        // 1. public static String toString(類型[] arr): 返回數組內容
        int[] arr = {10,20,30,40,50,60};
        System.out.println(Arrays.toString(arr));

        // 2. public static int[] copyOfRange(類型[] arr, 起始索引, 結束索引): 拷貝數組(包前不包後)
        int[] arr2 = Arrays.copyOfRange(arr, 1, 4);
        System.out.println(Arrays.toString(arr2));

        // 3. public static copyOf(類型[] arr, int newLength): 拷貝數組，可以指定新數組長度
        int[] arrr3 = Arrays.copyOf(arr, 10);
        System.out.println(Arrays.toString(arrr3));

        // 4. public static setAll(double[] array, IntToDoubleFunction generator):
        //      把數組中的原數據改為新數據又存進去
        double[] prices = {99.3, 23.9, 100};
        //                  0     1    2
        // 把所有價格打八折，然後存進去
        Arrays.setAll(prices, new IntToDoubleFunction() {
            @Override
            public double applyAsDouble(int value) {
                //  value = 0 1 2
                return prices[value] * 0.8;
            }
        });
        System.out.println(Arrays.toString(prices));

        // 5. public static void sort(類型[] arr): 對數組排序，默認由小到大
        Arrays.sort(prices);
        System.out.println(Arrays.toString(prices));
    }
}
