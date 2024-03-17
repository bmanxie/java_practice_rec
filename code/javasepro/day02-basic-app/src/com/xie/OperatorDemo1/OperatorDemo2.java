package com.xie.OperatorDemo1;

public class OperatorDemo2 {
    public static void main(String[] args) {
        // 目標: 掌握自增自減運算符
        // 只能操作變量，不能操作字面量
        int a = 10;
        a++; // a = a + 1
        // ++a 也可以
        System.out.println(a);

        a--; // a = a-1
        // --a 同理
        System.out.println(a);

        // System.out.println(2++); 會出錯

        System.out.println("==================================");
        int i = 10;
        int rs = ++i; // 先加再用
        System.out.println(rs);
        System.out.println(i);

        int j = 10;
        int rs2 = j++; // 先用再加
        System.out.println(rs2);
        System.out.println(j);

        System.out.println("==================================");
        // 考試才會出現
        int m = 5;
        int n = 3;
        // m 5 6 5 4
        // n 3 4 3
        //             6 -   5 + 5   -   4 + 4   + 3
        int result = ++m - --m + m-- - ++n + n-- + 3;
        System.out.println(result); // 9
        System.out.println(m); // 4
        System.out.println(n); // 3

        int c = 10;
        int d = 5;
        // c 10 11 12 11
        // d 5 4 5
        //        10  +  12 -   4 -   5 + 1 + 11
        int rs3 = c++ + ++c - --d - ++d + 1 + c--;
        System.out.println(rs3); // 26
        System.out.println(c); // 11
        System.out.println(d); // 5
    }
}
