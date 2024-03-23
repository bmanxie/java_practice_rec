package com.xie.d14_arrays;

public class Student implements Comparable<Student>{
    private String name;
    private double height;
    private int age;

    // 指定比較規則
    // this o
    @Override
    public int compareTo(Student o){
        // 約定1: 左邊對象 大於 右邊對象 返回正整數
        // 約定2: 左邊對象 小於 右邊對象 返回負整數
        // 約定3: 左邊對象 等於 右邊對象 返回0
        // 按年齡排序
//        if(this.age > o.age){
//            return 1;
//        }else if (this.age < o.age){
//            return -1;
//        }
//        return 0;
        return this.age - o.age; // 升序
        // return o.age - this.age; // 降序
    }

    public Student() {
    }

    public Student(String name, double height, int age) {
        this.name = name;
        this.height = height;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name = '" + name + '\'' +
                ", height = " + height +
                ", age = " + age +
                "}";
    }
}
