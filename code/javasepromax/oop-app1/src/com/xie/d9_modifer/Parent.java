package com.xie.d9_modifer;

public class Parent {
    // 1. 私有: 只能在本類中訪問
    private void privateMethod(){
        System.out.println("====private====");
    }

    // 2. 缺省: 本類，同一個包下的類
    void method(){
        System.out.println("====缺省====");
    }

    // 3. protected: 本類，同一個包下的類，任意包下的子類
    protected void protectedMethod(){
        System.out.println("====protected====");
    }

    // 4. public: 本類，同一個包下的類，任意包下的子類，任意包下的任何類
    public void publicMethod(){
        System.out.println("====public====");
    }

    public void test(){
        privateMethod();
        method();
        protectedMethod();
        publicMethod();
    }
}
