package com.xie.d2_polymorphism;

public class Teacher extends People{
    public void Teacher(){

    }

    public void teach(){
        System.out.println("老師要教書");
    }

    @Override
    public void run(){
        System.out.println("老師跑不快");
    }
}
