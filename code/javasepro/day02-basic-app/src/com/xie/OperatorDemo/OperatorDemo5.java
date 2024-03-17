package com.xie.OperatorDemo1;

public class OperatorDemo5 {
    public static void main(String[] args) {
        // 目標: 掌握邏輯運算符
        double size = 6.5;
        int storage = 64;
        // & 與: 多個條件符合才是true
        boolean rs = size >= 6.95 & storage >= 8;
        System.out.println(rs); // false

        // | 或: 其中一條件符合就是true
        boolean rs2 = size >= 6.95 | storage >= 8;
        System.out.println(rs2); // true

        // ! 非: 取相反的結果
        System.out.println(!true); // false
        System.out.println(!false); // true
        System.out.println(!rs); // true
        System.out.println(!rs2); // false

        // ^ 異或: 前後結果相同false, 結果不同true
        System.out.println(true ^ true); // false
        System.out.println(false ^ false); // false
        System.out.println(true ^ false); // true
        System.out.println(false ^ true); // true

        // && 短路與: 左邊若false右邊不執行
        int i = 10;
        int j = 20;
        System.out.println(i > 100 && ++j > 90);
        System.out.println(j); // 因為左邊為false，j因為右邊不執行，因此還是20

        // || 短路或: 左邊若true右邊不執行
        int m = 30;
        int n = 40;
        System.out.println(m > 3 || ++n > 40);
        System.out.println(n); // 因為左邊為true，右邊不執行，因此n還是40

        // 會先執行&& 再執行||
        System.out.println(10 > 3 || 10 > 3 && 10 < 3); // true
        // 順序:
        //  1.判斷 10 > 3 && 10 < 3 : false
        //  2.10 > 3 || false : true
    }
}
