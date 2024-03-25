package com.xie.d5_map_traverse;

import java.util.*;

/**
 * 目標: 完成Map集合的案例: 統計投票人數
 */
public class MapDemo4 {
    public static void main(String[] args) {
        // 1. 把80個學生選擇的景點數據拿到程序中
        List<String> data = new ArrayList<>();
        String[] selects = {"A","B","C","D"};
        Random r = new Random();
        for (int i = 0; i <= 80; i++) {
            // 每次模擬一個學生選擇一個景點，存入集合中
            int index = r.nextInt(4); // 0 1 2 3
            data.add(selects[index]);
        }
        System.out.println(data);

        // 2. 開始統計每個景點的人數
        // 準備一個Map集合用於統計最終結果
        Map<String, Integer> result = new HashMap<>();

        // 3. 開始遍歷80個景點數據
        for (String s : data) {
            // 問問Map集合中有沒有該景點
            if(result.containsKey(s)){
                // 說明這個景點之前統計過。其值+1，存入Map中
                result.put(s, result.get(s) + 1);
            }else {
                // 說明這個景點是第一次統計。存入"景點+1"
                result.put(s, 1);
            }
        }
        System.out.println(result);

    }
}
