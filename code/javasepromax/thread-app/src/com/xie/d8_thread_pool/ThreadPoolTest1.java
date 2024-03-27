package com.xie.d8_thread_pool;

import java.util.concurrent.*;

/**
 * 目標: 掌握線程池的關鍵
 * public ThreadPoolExecutor(int corePoolSize, int maximumPoolSize, long keepActiveTime, TimeUnit unit,
 *                          BlockingQueue<Runnable> workQueue, ThreadFactory threadFactory,
 *                          RejectedExecutionHandler handler)
 *      參數一: corePoolSize : 指定線程池的核心線程數量
 *      參數二: maximumPoolSize : 指定線城池的最大線程數量
 *      參數三: keepActiveTime : 指定臨時線程的存活時間
 *      參數四: unit : 指定臨時線程存活的時間單位(秒, 分, 時, 天)
 *      參數五: workQueue : 指定線程池的任務隊列
 *      參數六: threadFactory : 指定線程池的線程工廠
 *      參數七: handler : 指定線程池的任務拒絕策略(線程都在忙、任務隊列也滿了，新任務來了怎麼處理)
 *
 *  注意事項:
 *      1. 臨時線程什麼時候創立?
 *      A. 新任務提交時發現核心線程都在忙，任務隊列也滿了，並且還可以創建臨時線程，此時才會創建臨時線程
 *      2. 什麼時候開始拒絕新任務?
 *      A. 核心線程和臨時線程都在忙，任務隊列也滿了，新的任務過來的時候才會開始拒絕任務
 */
public class ThreadPoolTest1 {
    public static void main(String[] args) {
        // 通過ThreadPoolExecute創建一個線程池對象
        ExecutorService pool = new ThreadPoolExecutor(3, 5, 8,
                TimeUnit.SECONDS, new ArrayBlockingQueue<>(4),
                Executors.defaultThreadFactory(), new ThreadPoolExecutor.AbortPolicy());

        Runnable target = new MyRunnable();
        pool.execute(target); // 線程池會自動創建一個新線程，自動處理這個任務，自動執行!
        pool.execute(target); // 線程池會自動創建一個新線程，自動處理這個任務，自動執行!
        pool.execute(target); // 線程池會自動創建一個新線程，自動處理這個任務，自動執行!
//        pool.execute(target); // 復用前面的核心線程!
//        pool.execute(target); // 復用前面的核心線程!
        pool.execute(target);
        pool.execute(target);
        pool.execute(target);
        pool.execute(target);
        // 到了臨時線程的創建時機了
        pool.execute(target);
        pool.execute(target);
        // 到了新任務的拒絕情況
        pool.execute(target);

        pool.shutdown(); // 等待線程池的任務都執行完畢，再關閉線程
        // pool.shutdownNow(); // 立即關閉線程! 不管線程池的任務有沒有執行完畢
    }
}
