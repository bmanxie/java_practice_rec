package com.xie.d1_polymorphism;

public class Teacher extends People{
    public String name = "子類Teacher name";
    @Override
    public void run(){
        System.out.println("老師跑不快");
    }
}
