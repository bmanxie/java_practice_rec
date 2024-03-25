package com.xie.d5_map_traverse;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

/**
 * 目標: 掌握Map集合的第三種遍歷方式: Lambda
 */
public class MapTest3 {
    public static void main(String[] args) {
        Map<String, Double> map = new HashMap<>();
        map.put("劉備", 166.2);
        map.put("張飛", 174.5);
        map.put("關羽", 183.7);
        map.put("趙雲", 180.0);
        System.out.println(map);
        // map = {關羽=183.7, 趙雲=180.0, 劉備=166.2, 張飛=174.5}

        map.forEach(new BiConsumer<String, Double>(){
            @Override
            public void accept(String k, Double v){
                System.out.println(k + " ----> " + v);
            }
        });

        map.forEach((k, v) -> {
            System.out.println(k + " ----> " + v);
        });


    }
}
