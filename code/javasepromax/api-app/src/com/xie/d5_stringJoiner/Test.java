package com.xie.d5_stringJoiner;

import java.util.StringJoiner;

public class Test {
    public static void main(String[] args) {
        // 目標: 掌握StringJoiner的使用 JDK 8 開始才支援
        // StringJoiner( 間隔符號, 開始符號, 結束符號)
        //StringJoiner s = new StringJoiner(", ");
        StringJoiner s = new StringJoiner(", ", "[", "]");
        s.add("java1");
        s.add("java2");
        s.add("java3");
        System.out.println(s);

        System.out.println(getArrayData(new int[]{11, 22, 33}));
    }

    public static String getArrayData(int[] arr){
        // 1. 判斷arr是否為null
        if(arr == null){
            return null;
        }

        // 2. arr數組存在，arr = [11, 22, 33]
        StringJoiner s = new StringJoiner(", ", "[", "]");
        for (int i = 0; i < arr.length; i++) {
            s.add(arr[i] + "");
        }
        return s.toString();
    }
}
