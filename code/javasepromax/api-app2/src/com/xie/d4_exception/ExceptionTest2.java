package com.xie.d4_exception;

/**
 * 目標: 掌握自定義異常，及異常的作用
 */
public class ExceptionTest2 {
    public static void main(String[] args) {
        // 需求: 保存合理的年齡
        try {
            saveAge(155);
            System.out.println("底層運行成功");
        }catch (AgeIllegalRuntimeException e){
            e.printStackTrace();
            System.out.println("底層出現bug");
        }

        try {
            saveAge2(122);
            System.out.println("底層運行成功");
        } catch (AgeIllegalException e) {
            e.printStackTrace();
            System.out.println("底層出現bug");
        }
    }
    public static void saveAge2(int age) throws AgeIllegalException{
        if(age > 0 && age < 150){
            System.out.println("年齡保存成功" + age);
        }else {
            // 用一個異常對象封裝這個問題
            // throw 拋出去這個異常對象
            // throws 用在方法上，拋出方法內部的異常
            throw new AgeIllegalException("/age is illegal, your age is: " + age);
        }
    }

    public static void saveAge(int age){
        if(age > 0 && age < 150){
            System.out.println("年齡保存成功" + age);
        }else {
            // 用一個異常對象封裝這個問題
            throw new AgeIllegalRuntimeException("/age is illegal, your age is: " + age);
        }
    }
}
