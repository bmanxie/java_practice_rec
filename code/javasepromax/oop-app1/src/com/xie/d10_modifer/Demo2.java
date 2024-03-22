package com.xie.d10_modifer;

import com.xie.d9_modifer.Parent;

public class Demo2 {
    public static void main(String[] args) {
        Parent f = new Parent();
        //f.privateMethod();
        //f.method();
        //f.protectedMethod();
        f.publicMethod();

        Child c = new Child();
        // c.protectedMethod(); 只能在子類中訪問，在外面創建的對象沒辦法使用
    }
}
