package com.xie.d3_regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexText3 {
    public static void main(String[] args) {
        method1();
    }

    public static void method1(){
        String data = "學生基本資訊: \n"+
                "   電話:0900222333\n" +
                "   電子信箱: ntut@ntut.edu.tw\n"+
                "   電話2:0900099000\n" +
                "   電話3:0934-888-888\n" +
                "   電子信箱: nutt@ntut.org.tw\n";

        // 1. 定義爬取規則
        String regex = "(0\\d{3}-?\\d{3}-?\\d{3})|(0\\d{1}-?\\d{8})"
                + "|(\\w{2,}@\\w{2,20}(\\.\\w{2,10}){1,2})";

        // 2. 把正則表達式封裝成一個pattern對象
        Pattern pattern = Pattern.compile(regex);

        // 3. 通過pattern對象去獲取查找內部的匹配對象
        Matcher matcher = pattern.matcher(data);

        // 4. 定義一個循環爬取訊息
        while (matcher.find()){
            String rs = matcher.group(); // 獲取目標的內容了
            System.out.println(rs);
        }
    }
}
