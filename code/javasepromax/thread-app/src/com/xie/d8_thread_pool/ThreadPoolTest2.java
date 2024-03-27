package com.xie.d8_thread_pool;

import java.util.concurrent.*;

/**
 * 目標: 掌握線程池的創建
 */
public class ThreadPoolTest2 {
    public static void main(String[] args) throws Exception{
        // 1. 通過ThreadPoolExecute創建一個線程池對象
        ExecutorService pool = new ThreadPoolExecutor(3, 5, 8,
                TimeUnit.SECONDS, new ArrayBlockingQueue<>(4),
                Executors.defaultThreadFactory(), new ThreadPoolExecutor.AbortPolicy());

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
