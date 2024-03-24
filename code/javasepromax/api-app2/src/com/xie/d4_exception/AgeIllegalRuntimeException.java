package com.xie.d4_exception;
// 1. 必須讓這個類繼承自RuntimeException, 才能成為一個運行時異常
public class AgeIllegalRuntimeException extends RuntimeException{
    public AgeIllegalRuntimeException(){

    }

    public AgeIllegalRuntimeException(String message){
        super(message);
    }
}
