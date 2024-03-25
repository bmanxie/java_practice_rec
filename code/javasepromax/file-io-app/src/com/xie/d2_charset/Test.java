package com.xie.d2_charset;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/**
 * 目標: 掌握如何使用Java代碼完成對字符的編碼和解碼
 */
public class Test {
    public static void main(String[] args) throws Exception {
        // 1. 編碼
        String data = "a我b";
        byte[] bytes = data.getBytes(); // 默認是按照平台字符集(UTF-8)進行編碼的
        System.out.println(Arrays.toString(bytes));

        // 按照指定字符集進行編碼
        byte[] bytes1 = data.getBytes("GBK");
        System.out.println(Arrays.toString(bytes1));

        // 2. 解碼
        String s1 = new String(bytes); // 按照平台默認(UTF-8)解碼
        System.out.println(s1);

        String s2 = new String(bytes1, "GBK");
        System.out.println(s2); //
    }
}
