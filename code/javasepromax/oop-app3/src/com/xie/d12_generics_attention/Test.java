package com.xie.d12_generics_attention;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        // 目標: 理解泛型的注意事項
        // 1. 泛型是工作在編譯階段的，一旦程序被編譯成class文件，class文件中就不存在泛型了，這就是泛型擦除
        ArrayList<String> list = new ArrayList<>();
        list.add("java1");
        list.add("java2");
        list.add("java3");
        String rs = list.get(2);
        System.out.println(rs);


        // 2. 泛型不支持基本數據類型，只能支持對象類型(引用數據類型)
        //ArrayList<int> list1 = new ArrayList<>();
        //ArrayList<double> list1 = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(22);

        ArrayList<Double> list2 = new ArrayList<>();
        list2.add(22.3);
    }
}
