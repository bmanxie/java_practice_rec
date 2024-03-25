package com.xie.d7_stream;

import java.util.*;
import java.util.stream.Stream;

public class StreamTest2 {
    public static void main(String[] args) {
        // 1. 如何獲取List集合的Stream流?
        List<String> names = new ArrayList<>();
        Collections.addAll(names, "張三豐", "張無忌", "楊過", "張騫","郭襄", "周伯通");
        Stream<String> stream = names.stream();


        // 2. 如何獲取Set集合中的Stream流?
        Set<String> set = new HashSet<>();
        Collections.addAll(set, "張學友", "郭富城", "金城武", "周杰倫", "達瑞斯");
        Stream<String> stream1 = set.stream();
        stream1.filter(s -> s.contains("城")).forEach(s -> System.out.println(s));

        // 3. 如何獲取Map集合的Stream流?
        Map<String, Double> map = new HashMap<>();
        map.put("蓋倫", 188.8);
        map.put("犽宿", 176.3);
        map.put("賈克斯", 180.1);
        map.put("藍寶", 128.5);
        Set<String> keys = map.keySet();
        Stream<String> ks = keys.stream();

        Collection<Double> values = map.values();
        Stream<Double> vs = values.stream();

        Set<Map.Entry<String, Double>> entries = map.entrySet();
        Stream<Map.Entry<String, Double>> kvs = entries.stream();
        kvs.filter(e -> e.getKey().contains("倫"))
                .forEach(e -> System.out.println(e.getKey() + " ====> " + e.getValue()));

        // 4. 如何獲取數組中的Stream流?
        String[] names2 = {"漢斯", "赫莉娜", "達克魯", "卡伊琳"};
        Stream<String> s1 = Arrays.stream(names2);
        Stream<String> s2 = Stream.of(names2);
    }
}
