package com.xie.d5_map_traverse;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * 目標: 掌握Map集合的遍歷方式1: 鍵找值
 */
public class MapTest1 {
    public static void main(String[] args) {
        // 準備一個Map集合
        Map<String, Double> map = new HashMap<>();
        map.put("劉備", 166.2);
        map.put("劉備", 176.2);
        map.put("張飛", 174.5);
        map.put("關羽", 183.7);
        map.put("趙雲", 180.0);
        System.out.println(map);
        // map = {關羽=183.7, 趙雲=180.0, 劉備=176.2, 張飛=174.5}

        // 1. 獲取Map集合的全部鍵
        Set<String> keys = map.keySet();
        System.out.println(keys);
        // [關羽, 趙雲, 劉備, 張飛]
        // 2. 遍歷全部的鍵，根據鍵獲取其對應的值
        for(String key: keys){
            // 根據鍵獲取對應的值
            double value = map.get(key);
            System.out.println(key + "====>" + value);
        }
    }
}
