package com.xie.d6_colldection_nesting;

import java.util.*;

/**
 * 目標: 理解集合的嵌套
 * 台北市 = "中正區", "萬華區", "中山區", "大安區", "信義區"
 * 台中市 = "西屯區", "北屯區", "豐原區", "后里區", "大里區"
 * 高雄市 = "楠梓區", "左營區", "小港區", "苓雅區", "旗津區"
 */
public class Test {
    public static void main(String[] args) {
        // 1. 定義一個Map集合儲存全部縣市訊息，和其對應的城市訊息
        Map<String, List<String>> map = new HashMap<>();
        List<String> cities1 = new ArrayList<>();
        Collections.addAll(cities1, "中正區", "萬華區", "中山區", "大安區", "信義區");
        map.put("台北市", cities1);

        List<String> cities2 = new ArrayList<>();
        Collections.addAll(cities2, "西屯區", "北屯區", "豐原區", "后里區", "大里區");
        map.put("台中市", cities2);

        List<String> cities3 = new ArrayList<>();
        Collections.addAll(cities3, "楠梓區", "左營區", "小港區", "苓雅區", "旗津區");
        map.put("高雄市", cities3);
        System.out.println(map);

        List<String> cities = map.get("台中市");
        for(String city: cities){
            System.out.println(city);
        }

        map.forEach((p, c) -> {
            System.out.println(p + " ====> " + c);
        });
    }
}
