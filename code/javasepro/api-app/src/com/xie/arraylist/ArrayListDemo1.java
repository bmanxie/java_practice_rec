package com.xie.arraylist;

import java.util.ArrayList;

public class ArrayListDemo1 {
    public static void main(String[] args) {
        // 創建ArrayList的集合物件
        ArrayList list = new ArrayList();
        list.add("學生");
        list.add(77);
        list.add(12);
        list.add("學生");
        list.add("Java");
        System.out.println(list);

        ArrayList<String> list1 = new ArrayList<>(); // 限制array只能存String
        list1.add("Java");
        list1.add("Python");
        list1.add("C");
        list1.add("Python");
        System.out.println(list1);

        // 2. 往集合某個索引位置添加一個數據
        System.out.println("添加SQL在第二位後:");
        list1.add(1,"SQL");
        System.out.println(list1);

        // 3. 根據索引獲取集合中的值
        String rs = list1.get(1);
        System.out.println(rs);

        // 4. 獲取集合的大小(返回元素個數)
        System.out.println(list1.size());

        // 5. 根據索引刪除某個元素值，返回被刪除的元素值回來
        System.out.println(list1.remove(1));
        System.out.println(list1);

        // 6. 直接指定刪除元素，返回是否成功(true)
        System.out.println(list1.remove("Java"));
        System.out.println(list1);

        // 若集合中有重複多個元素，默認先刪除第一次出現的元素
        System.out.println(list1.remove("Python"));
        System.out.println(list1);

        // 7. 修改某索引位置處數據，會返回原來數據
        System.out.println(list1.set(1, "Python學習"));
        System.out.println(list1);
    }
}
