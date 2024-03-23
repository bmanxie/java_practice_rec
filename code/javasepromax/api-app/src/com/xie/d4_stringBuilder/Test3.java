package com.xie.d4_stringBuilder;

public class Test3 {
    public static void main(String[] args) {
        // 目標: 遍歷數組內容，拼接成指定格式
        System.out.println(getArrayData(new int[]{11, 22, 33}));

    }

    public static String getArrayData(int[] arr){
        // 1. 判斷arr是否為null
        if(arr == null){
            return null;
        }

        // 2. arr數組存在，arr = [11, 22, 33]
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i]);
            sb.append(i == (arr.length - 1) ? "]" : ", ");
        }


        return sb.toString();
    }

}
