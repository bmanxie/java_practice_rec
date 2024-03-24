package com.xie.d2_collection_traverse;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * 目標: Collection 集合的遍歷方式一: 使跌代器Iterator遍歷
 */
public class CollectionDemo1 {
    public static void main(String[] args) {
        Collection<String> c = new ArrayList<>();
        c.add("劉備");
        c.add("關羽");
        c.add("張飛");
        c.add("趙雲");
        System.out.println(c);
        // c = [劉備, 關羽, 張飛, 趙雲]

        // 使用跌代器遍歷集合
        // 1. 從集合對象中獲取跌代器對象
        Iterator<String> it = c.iterator();
//        System.out.println(it.next());
//        System.out.println(it.next());
//        System.out.println(it.next());
//        System.out.println(it.next());
        // System.out.println(it.next()); // 出現異常

        // 2. 使用循環遍歷跌代器
        // hasNext(): 該位置有元素返回 true，沒有則false
        while (it.hasNext()){
            String ele = it.next();
            System.out.println(ele);
        }
    }
}
