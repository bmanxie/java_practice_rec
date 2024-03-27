package com.xie.d9_tcp6;

import java.io.OutputStream;
import java.io.PrintStream;
import java.net.Socket;

public class ServerReaderRunnable implements Runnable{
    private Socket socket;
    public ServerReaderRunnable(Socket socket){
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
