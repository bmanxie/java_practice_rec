package com.xie.d12_extends_override;

public class B extends A{
    // 方法重寫
    // @override 可以檢查重寫的格式是否正確
    // 子類重寫父類方法，訪問權限必須大於父類權限(public > protected > 缺省)
    // 返回值類型必須一樣，或是範圍更小
    // 私有方法(private)，靜態方法(static)不能被重寫，重寫會報錯


    // 聲明不變，重新實現
    @Override
    public void print1(){
        System.out.println("777");
    }
    @Override
    public void print2(int a, int b){
        System.out.println("77777");
    }
}
