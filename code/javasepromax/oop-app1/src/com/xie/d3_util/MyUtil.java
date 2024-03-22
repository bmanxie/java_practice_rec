package com.xie.d3_util;

import java.util.Random;

public class MyUtil {
    // 類方法用來設計工具類
    // 工具類中的方法都是類方法; 每個類方法都被設計完成一個功能
    // 提供了程式碼的複用性，提高效率
    // 每次建立實例方法都要創建對象來調用，會占用內存; 因此使用類方法
    // 工具類不需要創建對象，因此建議將直接建構子私有
    private MyUtil(){

    }
    public static String createCode(int n){
        String code = "";
        String data = "abcdefghijklmnopqrstuvwxyz0123456789";
        Random r = new Random();
        for (int i = 1; i <= n; i++) {
            // 取得data長度隨機取一個數
            int index = r.nextInt(data.length());
            // 將對應位置的字符存入code
            code += data.charAt(index);
        }
        return code;
    }
}
