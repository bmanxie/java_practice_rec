package com.xie.d3_regex;

public class RegexText1 {
    public static void main(String[] args) {
        System.out.println(check(null));
        System.out.println(check("1428825252"));
        System.out.println(check("0800092000"));
        System.out.println("============");
        System.out.println(check1(null));
        System.out.println(check1("1428825252"));
        System.out.println(check1("0800092000"));


    }

    //正則表達式的寫法
    public static boolean check1(String phone){
        // \d 代表全部數字
        return phone != null && phone.matches("0\\d{7,9}");
    }

    public static boolean check(String phone){
        // 1. 判斷電話號碼是否為null
        if(phone == null || !phone.startsWith("0")|| phone.length() < 8 || phone.length() > 10){
            return false;
        }

        // 2. 電話不是空值並以0開頭，長度在8~10之間。
        // 判斷電話號碼是否都是數字
        for (int i = 0; i < phone.length(); i++) {
            // 根據索引值提取當前字符
            char ch = phone.charAt(i);
            // 判斷ch的字符，如果不是數字，返回false
            if (ch < '0' || ch > '9'){
                return false;
            }
        }
        // 3. 代表電話號碼符合規定
        return true;
    }
}
