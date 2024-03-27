package com.xie.d8_tcp5;

import java.io.*;
import java.net.Socket;

public class ServerReaderThread extends Thread{
    private Socket socket;
    public ServerReaderThread(Socket socket){
        this.socket = socket;
    }

    @Override
    public void run(){
        // 立即響應一個網頁內容: "java學習"給瀏覽器展示
        try {
            OutputStream os = socket.getOutputStream();
            PrintStream ps = new PrintStream(os);
            ps.println("HTTP/1.1 200 OK");
            ps.println("Content-Type:Text/html;charset=UTF-8");
            ps.println(); // 必須換行
            ps.println("<div style='color:red;font-size:120px;text-align:center'>java學習");
            ps.close();
            socket.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
