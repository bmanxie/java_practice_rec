package com.xie.d5_resource;

public class MyConnection implements AutoCloseable{
    @Override
    public void close() throws Exception{
        System.out.println("釋放了資源");
    }
}
