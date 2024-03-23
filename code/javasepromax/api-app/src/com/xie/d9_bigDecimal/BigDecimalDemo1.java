package com.xie.d9_bigDecimal;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimalDemo1 {
    public static void main(String[] args) {
        // 目標: 掌握BigDecimal的使用: 解決小數運算失真的問題
        double a = 0.1;
        double b = 0.2;
        double c = a + b;
        System.out.println(c);
        System.out.println("=================");

        // 1. 把他們變成字符串封裝成BigDecimal對象來運算
        // BigDecimal a1 = new BigDecimal(Double.toString(a));
        // BigDecimal b1 = new BigDecimal(Double.toString(b));
        // 推薦用以下方法轉換成BigDecimal對象使用
        BigDecimal a1 = BigDecimal.valueOf(a);
        BigDecimal b1 = BigDecimal.valueOf(b);

        BigDecimal c1 = a1.add(b1); // 加法
        BigDecimal d1 = a1.subtract(b1); // 減法
        BigDecimal e1 = a1.multiply(b1); // 乘法
        BigDecimal f1 = a1.divide(b1,2 , RoundingMode.HALF_UP); // 除法
        System.out.println(c1);
        System.out.println(d1);
        System.out.println(e1);
        System.out.println(f1);

        // 把BigDecimal對象轉換成double類型的數據
        double rs = e1.doubleValue();
        System.out.println(rs);

    }
}
