package com.xie.d2_inner_class2;

public class Outer {
    private int age;
    public static String schoolName = "北科";

    // 靜態內部類
    public static class Inner{
        private String name;
        public static int a;

        public void test(){
            System.out.println(schoolName);
            // System.out.println(age);
        }

        public String getName(){
            return name;
        }
        public void setName(String name){
            this.name = name;
        }
    }

    public static void test2(){
        System.out.println(schoolName);
        // System.out.println(age);
    }
}
