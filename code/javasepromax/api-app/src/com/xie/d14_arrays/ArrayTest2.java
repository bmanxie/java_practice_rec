package com.xie.d14_arrays;

import java.util.Arrays;
import java.util.Comparator;

public class ArrayTest2 {
    public static void main(String[] args) {
        Student[] students = new Student[4];
        students[0] = new Student("劉備", 180, 22);
        students[1] = new Student("關羽", 188, 24);
        students[2] = new Student("關羽", 177, 25);
        students[3] = new Student("諸葛亮", 175, 22);

        // 1. public static void sort(類型[] arr): 對數組進行排序
        Arrays.sort(students);
        System.out.println(Arrays.toString(students));

        // 2. public static <T> void sort(T[] arr, Comparator<? super T> c)
        // 參數1 :需要排序的數組
        // 參數2: Comparator比較器對象(用來制定對象的比較規則)
        Arrays.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                // 制定比較規則
                // 約定1: 左邊對象 大於 右邊對象 返回正整數
                // 約定2: 左邊對象 小於 右邊對象 返回負整數
                // 約定3: 左邊對象 等於 右邊對象 返回0
//                if (o1.getHeight() > o2.getHeight()) {
//                    return 1;
//                } else if (o1.getHeight() < o2.getHeight()) {
//                    return -1;
//                }
//                return 0; // 升序
                return Double.compare(o1.getHeight(), o2.getHeight()); // 升序
//                return Double.compare(o2.getHeight(), o1.getHeight()); // 降序
            }

        });
        System.out.println(Arrays.toString(students));
    }
}
