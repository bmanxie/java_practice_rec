package com.xie.type;

public class TypeConversionDemo3 {
    public static void main(String[] args) {
        // 目標: 掌握強制類型轉換
        int a = 20;
        //byte b = a; 出錯 ，但是可以強制轉換
        byte b = (byte) a; // ALT + ENTER 強制類型轉換

        double c = 99.32;
        int d = (int) c;
        // 數據可能遺失
        // 浮點數轉整數會直接捨棄小數位
    }
}
