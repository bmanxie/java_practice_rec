package com.xie.d2_collection_traverse;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Consumer;

/**
 * 目標: Collection集合的遍歷方式三: JDK8開始新增的Lambda表達式
 */
public class CollectionDemo3 {
    public static void main(String[] args) {
        Collection<String> c = new ArrayList<>();
        c.add("劉備");
        c.add("關羽");
        c.add("張飛");
        c.add("趙雲");
        System.out.println(c);
        // c = [劉備, 關羽, 張飛, 趙雲]

        // defaul void forEach(Consumer<? super T> action): 結合Lambda表達式遍歷集合
//        c.forEach(new Consumer<String>() {
//            @Override
//            public void accept(String s) {
//                System.out.println(s);
//            }
//        });
//        省略
//        c.forEach((String s) -> {
//                System.out.println(s);
//        });
//        省略
//        c.forEach(s -> System.out.println(s));
        // 方法引用
        c.forEach(System.out::println);




    }
}
