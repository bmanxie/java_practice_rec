package com.xie.d14_extends_constructor;

public class Test3 {
    public static void main(String[] args) {
        // 目標: 掌握在類中的建構子中，通過this調用兄弟建構子的作用
        Student s1 = new Student("劉備", 22, "北科大");

        // 如果學生沒有填寫學校，那麼學校默認是逢甲大學
        Student s2 = new Student("張飛", 20);
        System.out.println(s2.getName());
        System.out.println(s2.getAge());
        System.out.println(s2.getSchoolName());
    }
}

class Student{
    // 任意類的建構子中，可以用this去掉用該類的建構子
    private String name;
    private int age;
    private String schoolName;

    public Student() {
    }

    public Student(String name, int age){
        this(name, age, "逢甲大學");
    }

    public Student(String name, int age, String schoolName) {
        this.name = name;
        this.age = age;
        this.schoolName = schoolName;
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

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }
}
