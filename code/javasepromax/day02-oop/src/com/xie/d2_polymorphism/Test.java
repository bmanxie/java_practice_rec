package com.xie.d2_polymorphism;

public class Test {
    public static void main(String[] args) {
        // 目標: 理解多型的好處
        // 好處1. 可以解耦，右邊對象可隨時切換，後續業務隨之改變
        People p1 = new Student();
        p1.run();
        // p1.test(); // 多型存在下的問題: 無法調用子類的獨有功能
        // 強制類型轉換

        Student s1 = (Student) p1;
        s1.test();

        // 強制類型轉換可能存在問題: 編譯階段有繼承或實現關係就可以強制轉換，但是運行時可能出現類型轉換異常
        // Teacher t1 = (Teacher) p1; // 運行時出現 ClassCastException 類型轉換異常
        // 強轉前Java建議使用instaceof，判斷當前對象的真實型態，再進行強轉
        if (p1 instanceof Student){
            Student s2 = (Student) p1;
            s2.test();
        }else {
            Teacher t2 = (Teacher) p1;
            t2.teach();
        }
        System.out.println("===============");
        // 好處2. 可以使用父類類型的變量當作形參，可以接收一切子類對象
        Student s = new Student();
        go(s);

        Teacher t = new Teacher();
        go(t);

    }

    public static void go(People p){
        p.run();
        if(p instanceof Student){
            Student s = (Student) p;
            s.test();
        }else {
            Teacher t = (Teacher) p;
            t.teach();
        }
    }
}
