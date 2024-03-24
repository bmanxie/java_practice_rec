package com.xie.d4_exception;
// 1. 必須讓這個類繼承自Exception, 才能成為一個編譯時異常
public class AgeIllegalException extends Exception{
    public AgeIllegalException(){

    }

    public AgeIllegalException(String message){
        super(message);
    }
}
