package com.xie.d7_tcp4;

import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

/**
 * 目標: 完成TCP通訊快速入門-服務端開發: 實現1發1收
 */
public class Server {
    public static List<Socket> onLineSockets = new ArrayList<>();
    public static void main(String[] args) throws Exception{
        System.out.println("-----服務端啟動成功-----");
        // 1. 創建ServerSocket的對象，同時為服務端註冊接口
        ServerSocket serverSocket = new ServerSocket(8888);

        while (true) {
            // 2. 使用serverSocket對象，調用一個accept方法，等待用戶端的連接請求
            Socket socket = serverSocket.accept();
            onLineSockets.add(socket);

            System.out.println("有人上線了" + socket.getRemoteSocketAddress());

            // 3. 把這個客戶端對應的socket通信管道，交給一個獨立的線程負責處理
            new ServerReaderThread(socket).start();
        }

    }
}
