package com.xie.d16_method_references;

import java.util.Arrays;
import java.util.Comparator;

/**
    目標: 掌握特定類型方法的引用
*/
public class Test2 {
    public static void main(String[] args) {
        String[] names = {"baby", "angela", "Andy", "dlei", "caocao", "Babo", "jack", "Cici"};

        // 進行排序(默認是按照字符串的首字符編號進行升序排序的)
        // Arrays.sort(names);

        // 要求忽略首字符大小寫進行排序
//        Arrays.sort(names, new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                // 制定比較規則。 o1 = "Andy" o2 = "angela"
//                return o1.compareToIgnoreCase(o2);
//            }
//        });


        // 指定類型方法的引用
        // 類型::方法
        // 如果某個Lambda表達式裡只是調用一個實例方法，並且前面參數列表中的第一個參數是作為方法的主調,
        // 後面的所有參數都是作為該實例方法的入參，則此時可以使用特定類型的方法引用
        // Arrays.sort(names,(o1, o2) -> o1.compareToIgnoreCase(o2));
        Arrays.sort(names,String::compareToIgnoreCase);


        System.out.println(Arrays.toString(names));
    }
}
