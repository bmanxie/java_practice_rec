package com.xie.d3_udp2;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

/**
 * 目標: 完成UDP通信快速入門-服務端開發
 * UDP特點: 無連接、不可靠
 *          通訊效率高。 適用場合 : 語音通話、視訊直播
 */
public class Server {
    public static void main(String[] args) throws Exception{
        System.out.println("------服務端啟動------");
        // 1. 創建一個服務端對象(收東西的人)
        DatagramSocket socket = new DatagramSocket(6666);

        // 2. 創建一個數據包對象，用於接收數據(收包裹的盒子)
        byte[] buffer = new byte[1024 * 64]; // 64KB
        DatagramPacket packet = new DatagramPacket(buffer, buffer.length);

        while (true) {
            // 3. 開始正式使用數據包來接收客戶端發來的數據
            socket.receive(packet);

            // 4. 從字節數組中，把接收到的數據直接打印出來
            // 讀取多少就倒出多少
            // 獲取本次數據包接收多少數據
            int len = packet.getLength();

            String rs = new String(buffer, 0, len);
            System.out.println(rs);

            System.out.println(packet.getAddress().getHostAddress());
            System.out.println(packet.getPort());
            socket.close();
            System.out.println("----------");
        }
    }
}
