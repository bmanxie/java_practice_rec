package com.xie.d3_regex;

import java.util.Arrays;

/**
 * 使用正則表達式做搜尋替換，內容分割
 */
public class RegexText4 {
    public static void main(String[] args) {
        // 1. public String replaceAll(String regex, String newStr): 按照政則表達式匹配的內容替換
        String data1 = "藝大師sdasd11提摩2313513sdas泰達米爾ad12法洛式";
        System.out.println(data1.replaceAll("\\w+", "-")); // 把英文、數字換成-

        // 2. 擴展: 語音轉文字系統收到口吃的人，需要優化成一般語句
        String data2 = "我我我我喜喜我我我歡歡歡歡吃吃吃饅饅頭";
        /**
         * (.)任意字符
         * \\1: 分組引用
         * $1:去取到分組代表的字
         */
        System.out.println(data2.replaceAll("(.)\\1", "$1"));

        // 3. public String[] split(String regex): 使用正則表達式匹配的內容進行分割字符串，返回一個字符串數組
        String s3 = "藝大師sdasd11提摩2313513sdas泰達米爾ad12法洛式";
        String[] name = s3.split("\\w+");
        System.out.println(Arrays.toString(name));
    }
}
