package com.xie.d2_collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * 目標: 掌握Collections集合工具類的使用
 */
public class CollectionTest1 {
    public static void main(String[] args) {
        // 1.public static <T> boolean addAll(Collection<? super T>c, T...elements): 為集合批量添加數據
        List<String> names = new ArrayList<>();
        Collections.addAll(names, "張飛","趙雲","劉備");
        System.out.println(names);

        // 2. public static void shuffle(List<?> list): 打亂List集合中的元素
        Collections.shuffle(names);
        System.out.println(names);

        // 3. public static <T> void sort(List<T> list): 對List集合中的元素進行升序排序
        List<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(5);
        list.add(2);
        list.add(1);
        Collections.sort(list);
        System.out.println(list);

        // 4. public static <T> void sort(List<T> list, Comparator<? super T> c): 對List中的元素，按照比較器對象的規則進行排序
        List<Student> students = new ArrayList<>();
        students.add(new Student("劉備", 22,177.2));
        students.add(new Student("劉備", 22,177.2));
        students.add(new Student("關羽", 21,180.2));
        students.add(new Student("張飛", 21,173.2));
        Collections.sort(students,(Student o1, Student o2) ->Double.compare(o1.getHeight(),o2.getHeight()));
        System.out.println(students);


    }
}
