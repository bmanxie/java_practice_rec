package com.xie.d16_method_references;

import com.xie.d14_arrays.Student;

public class CompareByData {
    public static int compareByAge(Student o1, Student o2){
        return o1.getAge() - o2.getAge();
    }

    public int compareByAgeDesc(Student o1, Student o2){
        return o2.getAge() - o1.getAge();
    }
}
