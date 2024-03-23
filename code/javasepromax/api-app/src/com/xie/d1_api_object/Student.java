package com.xie.d1_api_object;

import java.util.Objects;

public class Student {
    private String name;
    private int age;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString(){
        return "Student{" +
                "name = '" + name + '\'' +
                ", age = " + age +
                '}';
    }

    //重寫 equals方法
    // 比較者 s2 == this
    // 被比較者 s1 == o
    @Override
    public boolean equals(Object o){
        // 1. 判斷兩對象地址是否一樣
        if(this == o) return true;
        // 2. 判斷o是null或是比較者的類型與被比較者的類型不一樣
        if(o == null || getClass() != o.getClass()) return false;
        // 3. 開始比較內容
        Student student = (Student) o;
        return age == student.age && Objects.equals(name, student.name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
