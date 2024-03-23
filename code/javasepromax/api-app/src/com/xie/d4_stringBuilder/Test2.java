package com.xie.d4_stringBuilder;

public class Test2 {
    public static void main(String[] args) {
        // 目標: 掌握StringBuilder的好處
        // 需求: 要拼接100萬次abc
        // 先用String測試 效率超慢
//        String rs = "";
//        for (int i = 0; i <= 1000000; i++) {
//            rs += "abc";
//        }
//        System.out.println(rs);

        // 使用StringBuilder測試
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <= 1000000 ; i++) {
            sb.append("abc");
        }
        System.out.println(sb);
    }
}
