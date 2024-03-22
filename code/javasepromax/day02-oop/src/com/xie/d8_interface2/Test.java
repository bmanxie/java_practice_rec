package com.xie.d8_interface2;


public class Test {
    public static void main(String[] args) {
        // 目標: 搞清楚使用介面的好處
        // 介面可以通過implements的介面，顯性的知道有什麼功能
        // 一個類可以實現多個介面，一個介面也能被多個類實現。
        // 這麼做的好處是可以面向介面編程，可以輕鬆切換業務實現
        Singer s = new A();
        s.sing();

        // ex.今天Driver介面的實現類是B駕駛員，我們可以知道B駕駛員使用Driver的狀況
        // 今天想要換A駕駛員(實現類)時，只要改類的名稱就可以了
        Driver performance = new B(); // 平路開的超棒，山路有待加強
        // 我今天想換一個對象直接換實現
        // Driver performance = new A(); //平路開的普通，熟悉山路
        performance.drive();

    }
}

class B implements Driver{
    @Override
    public void drive() {
        System.out.println("平路開的超棒，山路有待加強");
    }
}
class A extends Student implements Driver, Singer{
    @Override
    public void drive(){
        System.out.println("平路開的普通，熟悉山路");
    }

    @Override
    public void sing(){

    }
}
class Student{

}
interface Driver{
    void drive();
}
interface Singer{
    void sing();
}