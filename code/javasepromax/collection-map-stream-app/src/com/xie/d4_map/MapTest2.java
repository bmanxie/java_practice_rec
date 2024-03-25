package com.xie.d4_map;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapTest2 {
    public static void main(String[] args) {
        // 1. 添加元素: 無序、不重複、無索引
        Map<String, Integer> map = new HashMap<>(); // 經典代碼。 按照鍵、無序、不重複、無索引
        map.put("手錶", 2100);
        map.put("手錶", 3500);
        map.put("手機", 32100);
        map.put("茶壺", 6100);
        map.put(null, null);
        System.out.println(map);
        // {手錶=3500, 手機=32100, 茶壺=6100, null=null}

        // 2. public int size(): 獲取集合大小
        System.out.println(map.size());

        // 3. public void clear(): 清空集合
//        map.clear();
//        System.out.println(map);

        // 4. public boolean isEmpty(): 判斷集合是否為空，為空返回true
        System.out.println(map.isEmpty());

        // 5. public V get(Object key): 根據鍵獲取值
        System.out.println(map.get("手錶"));

        // 6. public V remove(Object key): 根據鍵刪除整個元素(刪除鍵會返回鍵的值)
        System.out.println(map.remove("手錶"));
        System.out.println(map);

        // 7. public boolean containsKey(Object key): 判斷鍵是否包含某個值，包含返回true
        System.out.println(map.containsKey("手機"));

        // 8. public boolean containsValue(Object value): 判斷是否包含某個值
        System.out.println(map.containsValue(6100));

        // 9. public set<K> keySet(): 獲取Map集合的全部鍵
        System.out.println(map.keySet());

        // 10. public Collection<V> values(): 獲取Map集合的全部值
        Collection<Integer> value = map.values();
        System.out.println(value);

        // 11. 其他Map集合的數據倒入自己的集合中
        Map<String, Integer> map1 = new HashMap<>();
        map1.put("java1", 10);
        map1.put("java2", 10);
        Map<String, Integer> map2 = new HashMap<>();
        map2.put("java2", 20);
        map2.put("java3", 20);
        System.out.println(map2);
        map1.putAll(map2); // pulAll: map2倒入map1，map2的數據還在
        System.out.println(map1);
        System.out.println(map2);
    }
}
