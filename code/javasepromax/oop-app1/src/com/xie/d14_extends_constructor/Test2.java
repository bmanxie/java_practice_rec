package com.xie.d14_extends_constructor;

public class Test2 {
    public static void main(String[] args) {
        // 目標: 搞清楚子類建構子為什麼要調用父類建構子
        Teacher t = new Teacher("諸葛亮", 20,"嘟嘟");
        System.out.println(t.getName());
        System.out.println(t.getAge());
        System.out.println(t.getSkill());
    }
}


class Teacher extends People{
    private String skill;

    public Teacher(String name, int age, String skill){
        super(name ,age);
        this.skill = skill;
    }

    public String getSkill(){
        return skill;
    }

    public void setSkill(){
        this.skill = skill;
    }
}
class People{
    private String name;
    private int age;

    public People() {
    }

    public People(String name, int age) {
        this.name = name;
        this.age = age;
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
