package com.xie.d4_tcp1;

import java.io.DataOutputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 * 目標: 完成TCP通訊快速入門-客戶端開發: 實現1發1收
 */
public class Client {
    public static void main(String[] args) throws Exception{
        // 1. 創建Socket對象，並同時請求與服務端程序的連接
        Socket socket = new Socket("127.0.0.1", 8888);

        // 2. 從socket通訊管道中得到一個字節輸出流，用來發數據給服務端程序
        OutputStream os = socket.getOutputStream();

        // 3. 把低級的字節輸出流包裝成數據輸出流
        DataOutputStream dos = new DataOutputStream(os);

        // 4. 開始寫數據出去
        dos.writeUTF("在一起?");
        dos.close();

        socket.close(); // 釋放連接資源
    }
}
