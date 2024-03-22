package com.xie.d2_polymorphism;

public class Student extends People{
    public void Student(){

    }

    public void test(){
        System.out.println("學生要考試");
    }

    @Override
    public void run(){
        System.out.println("學生跑很快");
    }
}
