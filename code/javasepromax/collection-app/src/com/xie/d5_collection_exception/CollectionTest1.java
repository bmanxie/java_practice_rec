package com.xie.d5_collection_exception;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 目標: 理解集合的併發修改異常問題，並解決
 */
public class CollectionTest1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("詹姆斯");
        list.add("哈登");
        list.add("柯瑞");
        list.add("雷納德");
        list.add("杜蘭特");
        list.add("布魯克");
        System.out.println(list);

        // 需求: 找出名字帶"納"的，並從集合中刪除
//        Iterator<String> it = list.iterator();
//        while (it.hasNext()){
//            String name = it.next();
//            if(name.contains("納")){
//                list.remove(name);
//            }
//        }
//        System.out.println(list);
//
//        for (int i = 0; i < list.size(); i++) {
//            String name = list.get(i);
//            if(name.contains("納")){
//                list.remove(name);
//            }
//        }
//        list.remove()

        System.out.println("=========================");
        // 怎麼解決?
        //法1:
        // 使用for循環遍歷集合並刪除集合中帶有"納"的名字
//        for (int i = 0; i < list.size(); i++) {
//            String name = list.get(i);
//            if(name.contains("納")){
//                list.remove(name);
//                i--;
//            }
//        }
//        System.out.println(list);

        //法2:
        Iterator<String> it = list.iterator();
        while (it.hasNext()){
            String name = it.next();
            if(name.contains("納")){
                // list.remove(name); // 併發修改異常
                it.remove(); // 刪除跌代器目前遍歷到的數據，刪除一個數據後，在底層也做了i--
            }
        }
        System.out.println(list);

        // 增強for無法解決
        // Lambda也無法解決
    }
}
