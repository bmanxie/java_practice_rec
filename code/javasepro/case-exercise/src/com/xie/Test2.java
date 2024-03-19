package com.xie;

import java.util.Random;

public class Test2 {
    public static void main(String[] args) {
        // 目標: 生成隨機驗證碼
        System.out.println(createCode(20));
    }

    public static String createCode(int n){
        Random r = new Random();
        String code = "";
        // 1. 控制產生多少字
        for (int i = 1; i <= n; i++){
            // i = 1 2 3 .. n
            // 2. 為每個位置隨機生成字符: 可能是數字、大小寫英文
            // 方法: 隨機生成 0, 1, 2: 0代表隨機數字， 1,2 分別代表大寫、小寫字母
            int type = r.nextInt(3); // 0 1 2
            switch (type){
                case 0:
                    // 隨機1個數字
                    code += r.nextInt(10); // 0 - 9
                    break;
                case 1:
                    // 隨機1個大寫字母 A 65 Z 65+25
                    char ch1 = (char) (r.nextInt(26) + 65);
                    code += ch1;
                    break;
                case 2:
                    // 隨機1個小寫字母 a 97 z 97+25
                    char ch2 = (char) (r.nextInt(26) + 97);
                    code += ch2;
                    break;
            }
        }
        return code;
    }
}
