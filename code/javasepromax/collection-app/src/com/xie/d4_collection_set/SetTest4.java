package com.xie.d4_collection_set;

import java.util.Set;
import java.util.TreeSet;

/**
 * 目標: 掌握TreeSet集合的應用
 */
public class SetTest4 {
    public static void main(String[] args) {
        Set<Integer> set1 = new TreeSet<>();
        set1.add(6);
        set1.add(5);
        set1.add(5);
        set1.add(7);
        System.out.println(set1);

        Set<Student> students = new TreeSet<>();
        Student s1 = new Student("劉備", 22,177.2);
        Student s2 = new Student("關羽", 21,180.2);
        Student s3 = new Student("張飛", 21,173.2);
        students.add(s1);
        students.add(s2);
        students.add(s3);
        System.out.println(students);
    }
}
