package com.xie.d1_collection;

import java.util.ArrayList;
import java.util.HashSet;

/**
 * 目標: 認識Collection體系的特點
 */
public class CollectionTest1 {
    public static void main(String[] args) {
        // 簡單確認一下Collection集合的特點
        ArrayList<String> list = new ArrayList<>(); // 有序 可重複 有索引
        list.add("java1");
        list.add("java2");
        list.add("java1");
        list.add("java2");
        System.out.println(list);
        System.out.println(list.get(2));

        HashSet<String> set = new HashSet<>(); // 無序 不重複 無索引
        set.add("java1");
        set.add("java2");
        set.add("java1");
        set.add("java2");
        set.add("java3");
        System.out.println(set);
    }
}
