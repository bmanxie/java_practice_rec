package com.xie.d4_map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * 目標: 掌握Map集合的特點
 */
public class MapTest1 {
    public static void main(String[] args) {
        // Map<String, Integer> map = new HashMap<>(); // 經典代碼。 按照鍵、無序、不重複、無索引
        Map<String, Integer> map = new LinkedHashMap<>(); // 有序、不重複、無索引
        map.put("手錶", 2100);
        map.put("手錶", 3500);  // 後面重複的數據會覆蓋前面的數據(鍵)
        map.put("手機", 32100);
        map.put("茶壺", 6100);
        map.put(null, null);
        System.out.println(map);

        Map<Integer, String> map1 = new TreeMap<>(); // 可排序、不重複、無索引
        map1.put(23, "衣服");
        map1.put(23, "褲子");
        map1.put(18, "大衣");
        map1.put(22, "鞋子");
        System.out.println(map1);

    }
}
