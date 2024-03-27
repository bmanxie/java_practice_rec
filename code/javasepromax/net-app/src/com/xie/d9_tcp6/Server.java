package com.xie.d9_tcp6;

import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * 目標: BS 服務器添加線程池
 */
public class Server {
    public static List<Socket> onLineSockets = new ArrayList<>();
    public static void main(String[] args) throws Exception{
        System.out.println("-----服務端啟動成功-----");
        // 1. 創建ServerSocket的對象，同時為服務端註冊接口
        ServerSocket serverSocket = new ServerSocket(8080);

        // 創建出一個線程池，負責處理通信管道的任務
        ThreadPoolExecutor pool = new ThreadPoolExecutor(16 * 2, 16 * 2, 0, TimeUnit.SECONDS,
                new ArrayBlockingQueue<>(8), Executors.defaultThreadFactory(),
                new ThreadPoolExecutor.AbortPolicy());

        while (true) {
            // 2. 使用serverSocket對象，調用一個accept方法，等待用戶端的連接請求
            Socket socket = serverSocket.accept();

            // 3. 把這個客戶端對應的socket通信管道，交給一個獨立的線程負責處理
            pool.execute(new ServerReaderRunnable(socket));
        }

    }
}
