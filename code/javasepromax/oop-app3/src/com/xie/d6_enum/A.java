package com.xie.d6_enum;

public enum A {
    // 注意: 列舉類的第一行必須羅列的是列舉對象的名字

    X,Y,Z;  // 這些名稱都是常量

    private String name;

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }
}
