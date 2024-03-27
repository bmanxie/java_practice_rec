package com.xie.d1_create_thread;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/**
 * 目標: 掌握現成的創建方式三: 實現Callable接口
 */
public class ThreadTest3 {
    public static void main(String[] args) throws Exception{
        // 3. 創建一個Callable的對象
        Callable<String> call = new MyCallable(100);
        // 4. 把Callable的對象封裝成一個FutureTast對象(任務對象)
        // 未來任務對象的作用:
        // a. 是一個任務對象，實現了Runnable對象
        // b. 可以在線程執行完畢後，用未來任務對象調用get方法獲取線程執行完畢的結果
        FutureTask<String> f1 = new FutureTask<>(call);
        // 5. 把任務對象交給一個Thread對象
        new Thread(f1).start();

        Callable<String> call2 = new MyCallable(50);
        FutureTask<String> f2 = new FutureTask<>(call2);
        new Thread(f2).start();

        // 6. 獲取線程執行完畢後返回的結果
        // 如果執行到這裡，假如上面的線程還沒處理完畢
        // 這裡的代碼會暫停，等待上面的線程執行完畢之後才會獲取結果
        String rs = f1.get();
        System.out.println(rs);

        String rs2 = f2.get();
        System.out.println(rs2);
    }
}
