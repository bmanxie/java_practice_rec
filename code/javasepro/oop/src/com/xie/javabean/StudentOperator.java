package com.xie.javabean;

public class StudentOperator {
    private Student student;
    public StudentOperator(Student student){
        this.student = student;
    }

    public void printPass(){
        if(student.getScore() >= 60){
            System.out.println("及格");
        }else {
            System.out.println("不及格");
        }
    }
}
