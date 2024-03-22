package com.xie.d8_extends_application;

public class Test {
    public static void main(String[] args) {
        Teacher t = new Teacher();
        t.setName("劉備");
        t.setSkill("Java,Python");
        System.out.println(t.getName());
        System.out.println(t.getSkill());
        t.printInfo();

    }
}
