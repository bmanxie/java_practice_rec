package com.xie.d4_collection_set;

import java.util.HashSet;
import java.util.Set;

public class SetTest3 {
    public static void main(String[] args) {
        Set<Student> students = new HashSet<>();
        Student s1 = new Student("劉備", 22,177.2);
        Student s2 = new Student("關羽", 21,180.2);
        Student s3 = new Student("關羽", 21,180.2);
        Student s4 = new Student("張飛", 21,173.2);
        System.out.println(s2.hashCode());
        System.out.println(s3.hashCode());
        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);
        System.out.println(students);
    }
}
