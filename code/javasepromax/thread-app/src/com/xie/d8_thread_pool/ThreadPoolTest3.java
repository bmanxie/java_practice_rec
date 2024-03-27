package com.xie.d8_thread_pool;

import java.util.concurrent.*;

public class ThreadPoolTest3 {
    public static void main(String[] args) throws Exception{
        // 1. 通過ThreadPoolExecute創建一個線程池對象
//        ExecutorService pool = new ThreadPoolExecutor(3, 5, 8,
//                TimeUnit.SECONDS, new ArrayBlockingQueue<>(4),
//                Executors.defaultThreadFactory(), new ThreadPoolExecutor.AbortPolicy());

        // 1-2. 通過Executor創建一個線程池對象
        ExecutorService pool = Executors.newFixedThreadPool(3);
        // 核心線程數量到底配置多少?
        // 計算密集型的任務: 核心線程數量 = CPU的核數 + 1
        // IO密集型的任務: 核心線程數量 = CPU核數 * 2

        // 2. 使用線程處理Callable任務
        Future<String> f1 = pool.submit(new MyCallable(100));
        Future<String> f2 = pool.submit(new MyCallable(200));
        Future<String> f3 = pool.submit(new MyCallable(300));
        Future<String> f4 = pool.submit(new MyCallable(400));

        System.out.println(f1.get());
        System.out.println(f2.get());
        System.out.println(f3.get());
        System.out.println(f4.get());

        pool.shutdown();

    }
}
