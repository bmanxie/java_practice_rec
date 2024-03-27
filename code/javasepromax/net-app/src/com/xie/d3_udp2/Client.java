package com.xie.d3_udp2;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

/**
 * 目標: 完成UDP通訊快速入門: 實現一發一收
 */
public class Client {
    public static void main(String[] args) throws Exception{
        // 1. 創建客戶端對象(發出去的人)
        DatagramSocket socket = new DatagramSocket();

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
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("請說: ");
            String msg = sc.nextLine();

            //一旦發現用戶輸入exit命令,就退出客戶端
            if("exit".equals(msg)){
                System.out.println("歡迎下去光臨");
                socket.close();
                break; // 跳出死循環
            }

            byte[] bytes = msg.getBytes();
            DatagramPacket packet = new DatagramPacket(bytes, bytes.length
                    , InetAddress.getLocalHost(), 6666);

            // 3. 開始正式發送這個數據包的數據出去了
            socket.send(packet);
        }
    }
}
