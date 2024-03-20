package com.xie.string;

public class StringDemo3 {
    public static void main(String[] args) {
        // String是不可變字符串對象，這樣加只是給新的對象
        String name = "台北市";
        name += "大安區";
        name += "建國南";
        System.out.println(name);

        // 只要以雙引號給出的字符串，存在常量池中，而且內容相同時只會儲存一格
        String s1 = "abc";
        String s2 = "abc";
        System.out.println(s1 == s2);

        // new String創造出來的字符串，每次new出來都是新的，放在堆內存
        String a1 = new String("abc");
        String a2 = new String("abc");
        System.out.println(a1 == a2);



        /**
         依據代碼回答問題
         public class Test{
            public static void main(Sting[] args){
                String s2 = new String("abc");
                String s1 = "abc";
                System.out.println(s1 == s2);
            }
         }
            Q1. s2 生成多少個物件? A. 2個 (堆內存的常量池、堆內存)
            Q2. s1 生成多少個物件? A. 0個 (常量池已經有了)
            Q3. 這個輸出結果是? A. false

         public class Test2{
            public static void main(Sting[] args){
                String w1 = "a"; // 常量池
                String w2 = w1 + "b"; // w1是一個變量，只會當成計算，因此放在堆內存
                String w3 = "a" + "b"; // 會自動優化成 "ab"，直接放在常量池
                String w4 = "ab";
                System.out.println(w2 == w3);
                System.out.println(w2 == w4);
                System.out.println(w3 == w4);
            }
         }
            Q. 輸出結果為?
            A. false false true
         */

    }
}
