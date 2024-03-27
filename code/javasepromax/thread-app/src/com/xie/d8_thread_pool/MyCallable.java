package com.xie.d8_thread_pool;

import java.util.concurrent.Callable;

/**
 *  1. 讓這個類實現Callable接口
 */
public class MyCallable implements Callable<String> {
    private int n;
    public MyCallable(int n){
        this.n = n;
    }

    // 重寫call方法
    @Override
    public String call() throws Exception {
        // 描述線程任務，返回線程執行返回後的結果
        // 需求: 求1~n的和和返回
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum+=i;
        }
        return Thread.currentThread().getName() + "線程求出了1至" + n + "的值是: " + sum ;
    }
}
