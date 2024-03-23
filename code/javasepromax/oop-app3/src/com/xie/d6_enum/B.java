package com.xie.d6_enum;
// 拓展: 列舉抽象
public enum B {
    X(){
        @Override
        public void go(){

        }
    }, Y("劉備"){
        @Override
        public void go(){
            System.out.println(getName() + "吃飯");
        }
    };

    private String name;
    B(){

    }
    B(String name){
        this.name = name;
    }
    public abstract void go();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
