package com.xie.d2_udp1;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 * 目標: 完成UDP通訊快速入門: 實現一發一收
 */
public class Client {
    public static void main(String[] args) throws Exception{
        // 1. 創建客戶端對象(發出去的人)
        DatagramSocket socket = new DatagramSocket(7777);

        // 2. 創建數據包隊象封裝要發出去的數據(創建一個外送包裹)
        /*
            public DatagramPacket(byte buf[], int length,
                InetAddress address, int port)
                參數一: 封裝要發出去的數據
                參數二: 發送出去的數據大小(字節個數)
                參數三: 服務端的IP地址(找到服務端主機)
                參數三: 服務端的IP地址(找到服務端主機)
                參數四: 服務端程序的端口
         */
        byte[] bytes = "我是快樂的客戶端".getBytes();
        DatagramPacket packet = new DatagramPacket(bytes, bytes.length
                , InetAddress.getLocalHost(), 6666);

        // 3. 開始正式發送這個數據包的數據出去了
        socket.send(packet);


        System.out.println("客戶端數據發送完畢");
        socket.close(); // 釋放資源
    }
}
