package com.xie.quickstart;

public class Test2 {
    public static void main(String[] args) {
        // 掌握類和物件的注意事項
        // 1. 類名建議用英文，首字母大寫
        // 2. 類中定義的變量稱為成員變量(物件的屬性)，類中定義的方法稱為成員方法(物件的行為)
        // 3. 成員變量本身存在默認值
        Student s = new Student();
        System.out.println(s.name);
        System.out.println(s.chinese);
        System.out.println(s.math);
        // 4. 一個代碼文件中，可以寫多個class，但只能用一個public修飾
        //              且public修飾的類明必須是代碼文件名
        // 5. 物件與物件之間的數據不會互相影響，但多個變量指向同一個物件就會相互影響
        Student s1 = new Student();
        s1.name = "張3";
        System.out.println(s1.name); // 張3
        Student s2 = s1;
        s2.name = "李4";
        System.out.println(s1.name); // 李4
        System.out.println(s1);
        // 6. 如果某個物件沒有一個變量引用他，則該物件無法被操作，會成為垃圾物件
        s1 = null;
        s2 = null;
        // System.out.println(s1.name); // 地址被清空了
    }
}
