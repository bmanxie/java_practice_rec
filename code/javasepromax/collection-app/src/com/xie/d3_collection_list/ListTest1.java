package com.xie.d3_collection_list;

import java.util.ArrayList;
import java.util.List;

/**
 * 目標: 掌握List系列集合的特點，以及其提供的特有方法
 */
public class ListTest1 {
    public static void main(String[] args) {
        // 1. 創建一個ArrayList集合對象(有序、可重複、有索引)
        List<String> list = new ArrayList<>(); // 經典代馬
        list.add("劉備");
        list.add("關羽");
        list.add("張飛");
        list.add("趙雲");
        System.out.println(list); //[劉備, 關羽, 張飛, 趙雲]

        // 2. public void add(int index, E element): 在某個索引插入元素
        list.add(2, "諸葛亮");
        System.out.println(list);

        // 3. public E remove(int index): 根據索引刪除元素，返回被刪除元素
        System.out.println(list.remove(2));
        System.out.println(list);

        // 4. public E get(int index): 返回集合中指定位置的元素
        System.out.println(list.get(3));

        // 5. public E set(int index, E element): 修改索引位置處的元素，修改成功後，返回原來的數據
        System.out.println(list.set(3, "曹操"));
        System.out.println(list);
    }
}
