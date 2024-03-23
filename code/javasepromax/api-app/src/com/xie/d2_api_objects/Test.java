package com.xie.d2_api_objects;

import java.util.Objects;

public class Test {
    public static void main(String[] args) {
        // 目標: 掌握Objects類提供的方法
        String s1 = "劉備";
        String s2 = "劉備";
        String s3 = null;


        System.out.println(s1.equals(s2));
        // System.out.println(s1.equals(s3));
        System.out.println(Objects.equals(s1, s2));
        System.out.println(Objects.equals(s1, s3));
        System.out.println("==========");
        System.out.println(Objects.isNull(s1)); // 作用等同 s1 == null
        System.out.println(Objects.isNull(s2));
        System.out.println(Objects.isNull(s3));
        System.out.println("==========");
        System.out.println(Objects.nonNull(s1)); // s1 != null
        System.out.println(Objects.nonNull(s2));
        System.out.println(Objects.nonNull(s3));
    }
}
