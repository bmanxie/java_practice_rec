package com.xie.d4_abstract;
//抽象類
public abstract class A {
    public String name;
    private static String schoolName;
    // 抽象方法必須使用abstract修飾，只有方法簽名，不能有方法解
    public abstract void run();

    public A() {
    }

    public A(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static String getSchoolName() {
        return schoolName;
    }

    public static void setSchoolName(String schoolName) {
        A.schoolName = schoolName;
    }
}
