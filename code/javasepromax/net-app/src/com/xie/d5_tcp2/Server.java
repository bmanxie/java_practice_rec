package com.xie.d5_tcp2;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 目標: 完成TCP通訊快速入門-服務端開發: 實現1發1收
 */
public class Server {
    public static void main(String[] args) throws Exception{
        System.out.println("-----服務端啟動成功-----");
        // 1. 創建ServerSocket的對象，同時為服務端註冊接口
        ServerSocket serverSocket = new ServerSocket(8888);

        // 2. 使用serverSocket對象，調用一個accept方法，等待用戶端的連接請求
        Socket socket = serverSocket.accept();

        // 3. 從socket通訊管道中得到一個字節輸入流
        InputStream is = socket.getInputStream();

        // 4. 把原始的字節輸入流包裝成數據輸入流
        DataInputStream dis = new DataInputStream(is);

        while (true) {
            try {
                // 5. 使用數據輸入流讀取客戶端發送過來的訊息
                String rs = dis.readUTF();
                System.out.println(rs);
            } catch (Exception e) {
                System.out.println(socket.getRemoteSocketAddress() + "離線了");
                dis.close();
                socket.close();
                break;
            }
        }
    }
}
