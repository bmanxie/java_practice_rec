package com.xie.d6_abstract_temp;

public abstract class People {
    /**
     * 設計模板方法設計模式
     */
    // 1. 定義一個模板方法出來
    public final void write(){
        System.out.println("\t\t\t\t演講心得");
        System.out.println("\t\t請依照今日體驗，回答今日參加演講的心得:");
        // 2. 模板方法不知道正文怎麼寫，但是知道子類一定要寫
        System.out.println(writeMain());
        System.out.println("\t\t\t\t\t\t\t\t謝謝回答");
    }

    // 3. 設計一個抽象方法，具體的實現交給子類完成
    public abstract String writeMain();
}
