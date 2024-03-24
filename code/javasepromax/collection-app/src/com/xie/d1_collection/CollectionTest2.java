package com.xie.d1_collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;

/**
 * 目標: 認識Collection體系的特點
 */
public class CollectionTest2 {
    public static void main(String[] args) {
        Collection<String> c = new ArrayList<>(); // 多態寫法
        // 1. public boolean add(E e): 添加元素, 添加成功時返回true
        c.add("java1");
        c.add("java1");
        c.add("java2");
        c.add("java2");
        c.add("java3");
        System.out.println(c);

        // 2. public void clear(): 清空元素
        //c.clear();
        //System.out.println(c);

        // 3. public boolean isEmpty(): 判斷集合是否為空，是空返回true，反之null
        System.out.println(c.isEmpty());

        // 4. public int size(): 獲取集合大小
        System.out.println(c.size());

        // 5. public boolean contains(Object obj):判斷集合中是否存在某個元素
        System.out.println(c.contains("java1")); // true
        System.out.println(c.contains("Java1")); // false

        // 6. public boolean remove(E e): 刪除某個元素，多個重複元素默認刪除第一個
        System.out.println(c.remove("java1"));

        // 7. public Object[] toArray(): 把集合轉換成數組
        Object[] arr = c.toArray();
        System.out.println(Arrays.toString(arr));

        String[] arr2 = c.toArray(new String[c.size()]);
        System.out.println(Arrays.toString(arr2));

        System.out.println("============================");
        // 把一個集合的全部數據倒入另一個集合
        Collection<String> c1 = new ArrayList<>();
        c1.add("java1");
        c1.add("java2");
        Collection<String> c2 = new ArrayList<>();
        c2.add("java3");
        c2.add("java4");
        c1.addAll(c2); //把c2集合的全部數據丟到c1集合中
        System.out.println(c1);
        System.out.println(c2);




    }
}
