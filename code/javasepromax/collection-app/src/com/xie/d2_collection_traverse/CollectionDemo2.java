package com.xie.d2_collection_traverse;

import java.util.ArrayList;
import java.util.Collection;

/**
 * 目標: Collection 集合的遍歷方式二: 增強for
 */
public class CollectionDemo2 {
    public static void main(String[] args) {
        Collection<String> c = new ArrayList<>();
        c.add("劉備");
        c.add("關羽");
        c.add("張飛");
        c.add("趙雲");
        System.out.println(c);
        // c = [劉備, 關羽, 張飛, 趙雲]

        // 使用增強for遍歷集合或數組
        for(String ele : c){
            System.out.println(ele);
        }

        String[] names = {"舞藤遊戲", "橙汁內", "海馬賴仁"};
        for(String name : names){
            System.out.println(names);
        }

    }
}
