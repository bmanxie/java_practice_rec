package com.xie.d2_xml;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * 目標: 如何使用程式把數據寫出到XML文件中
 * <?xml version="1.0" encoding="UTF-8" ?>
 * <book>
 *     <name>從入門到放棄</name>
 *     <author>xie</author>
 *     <price>999.9</price>
 * </book>
 */
public class Dom4JTest2 {
    public static void main(String[] args) {
        // 1. 使用一個StringBuilder對象來拼接XML格式的數據
        StringBuilder sb = new StringBuilder();
        sb.append("<?xml version=\"1.0\" encoding=\"UTF-8\" ?>\r\n");
        sb.append("<book>\r\n");
        sb.append("<name>從入門到放棄</name>\r\n");
        sb.append("<author>xie</author>\r\n");
        sb.append("<price>999.9</price>\r\n");
        sb.append("</book>");

        try (
                BufferedWriter bw =
                        new BufferedWriter(new FileWriter("properties-xml-log-app/src/book.xml"));
        ){
            bw.write(sb.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
