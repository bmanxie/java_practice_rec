package com.xie.d5_map_traverse;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * 目標: 掌握Map集合的第二種遍歷方式: 鍵值對
 */
public class MapTest2 {
    public static void main(String[] args) {
        Map<String, Double> map = new HashMap<>();
        map.put("劉備", 166.2);
        map.put("張飛", 174.5);
        map.put("關羽", 183.7);
        map.put("趙雲", 180.0);
        System.out.println(map);
        // map = {關羽=183.7, 趙雲=180.0, 劉備=166.2, 張飛=174.5}

        // 1. 調用Map集合提供entrySet方法，把Map集合轉換成鍵值對類型的Set集合
        Set<Map.Entry<String, Double>> entries = map.entrySet();
        for (Map.Entry<String, Double> entry : entries) {
            String key = entry.getKey();
            double value = entry.getValue();
            System.out.println(key + " =====> " + value);
        }


    }
}
