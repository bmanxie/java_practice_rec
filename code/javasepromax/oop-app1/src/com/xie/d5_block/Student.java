package com.xie.d5_block;

public class Student {
    static int number = 80;
    static String schoolName;
    // 靜態代碼塊
    static {
        System.out.println("靜態代碼塊執行了");
        schoolName = "北科";
    }


    // 實例代碼塊
    {
        System.out.println("實例代碼塊執行了");
        System.out.println("有人創建了物件" + this);

    }
    public Student(){
        System.out.println("無參建構子執行了");
    }

    public Student(String name){
        System.out.println("有參數代碼塊執行了");
    }
}
