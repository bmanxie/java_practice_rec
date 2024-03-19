package com.xie.overload;

public class MethodTest2 {
    public static void main(String[] args) {
        // 目標: 掌握函式多載的應用場景
        donate();
        donate("GodJJ");
        donate("GodJJ", 30);
    }

    public static void donate(){
        System.out.println("撲通");
    }
    public static void donate(String name){
        System.out.println("在" + name + "的錢包投了");
    }

    public static void donate(String name, int money){
        System.out.println("在" + name + "的錢包投了" + money + "元");
    }
}
