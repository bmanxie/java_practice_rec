package com.xie.d7_stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 目標: 初步體驗Stream流的方便與快捷
 */
public class StreamTest1 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        Collections.addAll(names, "張三豐", "張無忌", "楊過", "張騫","郭襄", "周伯通");
        System.out.println(names);
        // names = [張三豐, 張無忌, 楊過, 張騫, 郭襄, 周伯通]

        // 找出姓張，且是3個字的名字，存入一個新集合中
        List<String> list = new ArrayList<>();
        for(String name: names){
            if(name.startsWith("張") && name.length() == 3){
                list.add(name);
            }
        }
        System.out.println(list);

        // 用Stream解決需求
        List<String> list2 = names.stream().filter(s -> s.startsWith("張"))
                .filter(a -> a.length() == 3).collect(Collectors.toList());
        System.out.println(list2);
    }
}
