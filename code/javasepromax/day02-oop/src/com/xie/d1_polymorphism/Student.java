package com.xie.d1_polymorphism;

public class Student extends People{
    public String name = "子類Student name";
    @Override
    public void run(){
        System.out.println("學生跑很快");
    }
}
