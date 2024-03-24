package com.xie.d4_collection_set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * 目標: 了解Set系列集合的特點
 */
public class SetTest1 {
    public static void main(String[] args) {
        // 1.創建一價Set集合的對象
        //Set<Integer> set = new HashSet<>(); // 創建一個HashSet的集合對象 經典代碼 無序 不重複 無索引
        //Set<Integer> set = new LinkedHashSet<>(); // 有序 不重複 無索引
        Set<Integer> set = new TreeSet<>(); // 可排序(升序) 不重複 無索引
        set.add(666);
        set.add(555);
        set.add(444);
        set.add(888);
        set.add(777);
        System.out.println(set);
    }
}
