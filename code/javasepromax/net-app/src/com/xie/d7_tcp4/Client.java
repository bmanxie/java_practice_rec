package com.xie.d7_tcp4;

import java.io.DataOutputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

/**
 * 目標: 完成TCP通訊快速入門-客戶端開發: 實現1發1收
 * 客戶端與多客戶端同時通信
 */
public class Client {
    public static void main(String[] args) throws Exception{
        // 1. 創建Socket對象，並同時請求與服務端程序的連接
        Socket socket = new Socket("127.0.0.1", 8888);

        // 創建獨立的線程，負責隨機從socket中接收服務端發來的信息
        new ClientReaderThread(socket).start();

        // 2. 從socket通訊管道中得到一個字節輸出流，用來發數據給服務端程序
        OutputStream os = socket.getOutputStream();

        // 3. 把低級的字節輸出流包裝成數據輸出流
        DataOutputStream dos = new DataOutputStream(os);
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("請說: ");
            String msg = sc.nextLine();

            // 一旦用戶輸入exit,就退出用戶端
            if("exit".equals(msg)){
                System.out.println("歡迎下次光臨");
                dos.close();
                socket.close();
                break;
            }

            // 4. 開始寫數據出去
            dos.writeUTF(msg);
            dos.flush(); // 刷出去
        }
    }
}
