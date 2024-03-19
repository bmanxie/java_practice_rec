package com.xie.parameter;

public class MethodDemo2 {
    public static void main(String[] args) {
        int[] arrs = {1, 2, 3};
        change(arrs);
        System.out.println("main內:" + arrs[1]);
    }

    public static void change(int[] arrs){
        System.out.println("方法內1:" + arrs[1]);
        arrs[1] = 222;
        System.out.println("方法內2:" + arrs[1]);
    }
}
