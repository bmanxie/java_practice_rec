package com.xie.string;

import java.util.Random;

public class StringTest5 {
    public static void main(String[] args) {
        // 開發驗證碼
        System.out.println(createCode(4));
    }

    public static String createCode(int n){
        String code = " ";
        String data = "abcdefghijklmnopqrstuvwxyz0123456789";

        Random r = new Random();
        // 定義一個循環產生隨機字符
        for (int i = 0; i < n; i++){
            int index = r.nextInt(data.length());

            code += data.charAt(index);
        }
        return code;
    }
}
