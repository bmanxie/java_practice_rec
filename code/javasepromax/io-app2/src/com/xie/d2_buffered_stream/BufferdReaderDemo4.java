package com.xie.d2_buffered_stream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BufferdReaderDemo4 {
    public static void main(String[] args) {
        // 目標: 恢復唐詩順序
        try(
                // 2. 創建字符輸入流管道與源文件接通
                BufferedReader br = new BufferedReader(new FileReader("io-app2\\src\\楓橋夜泊.txt"));
                // 創建字符輸出流管道與新文件接通
                BufferedWriter bw = new BufferedWriter(new FileWriter("io-app2\\src\\楓橋夜泊修復.txt"));
                ){
            // 1.定義一個ArrayList集合儲存每段內容
            List<String> data = new ArrayList<>();

            // 3. 按照行符取每段
            String line;
            while ((line = br.readLine()) != null){
                data.add(line);
            }

            // 4. 對List集合中的每段文章進行排序
            Collections.sort(data);
            System.out.println(data);

            // 5. 遍歷List集合的每段內容，依次寫出去到新文件中
            for (String ln: data){
               bw.write(ln);
               bw.newLine(); // 換行
            }
        } catch (Exception e){
            e.printStackTrace();
        }


    }
}
