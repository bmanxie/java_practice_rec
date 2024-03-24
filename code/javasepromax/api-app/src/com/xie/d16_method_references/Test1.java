package com.xie.d16_method_references;

import com.xie.d14_arrays.Student;

import java.util.Arrays;
import java.util.Comparator;

public class Test1 {
    public static void main(String[] args) {
        Student[] students = new Student[4];
        students[0] = new Student("劉備", 180, 22);
        students[1] = new Student("關羽", 188, 24);
        students[2] = new Student("關羽", 177, 25);
        students[3] = new Student("諸葛亮", 175, 22);

        // 原始代碼: 對數組中的學生對象，按照年齡升序排列
//        Arrays.sort(students, new Comparator<Student>() {
//            @Override
//            public int compare(Student o1, Student o2) {
//                return o1.getAge() - o2.getAge();
//            }
//        });

        // 使用Lambda簡化後的形式
        // Arrays.sort(students, (o1, o2) -> o1.getAge() - o2.getAge());

        // Arrays.sort(students, (o1, o2) -> CompareByData.compareByAge(o1,o2));

        // 使用靜態方法引用
        // 條件: Lambda表達式內只調用一個靜態方法，並且前後參數一致，就可使用靜態方法
        // Arrays.sort(students, CompareByData::compareByAge);

        // 使用動態方法引用
        // 對象名::實例方法
        // 條件: Lambda表達式中只調用一個實例方法，並且前後參數一致，就可以使用實例方法
        CompareByData compare = new CompareByData();
        Arrays.sort(students, compare::compareByAgeDesc);

        System.out.println(Arrays.toString(students));
    }
}


