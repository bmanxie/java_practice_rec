package com.xie.d2_xml;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.util.List;

/**
 * 目標: 掌握使用Dom4j框架解析XML文件
 */
public class Dom4JTest {
    public static void main(String[] args) throws Exception{
        // 1. 創建一個Dom4j框架提供的解析器對象
        SAXReader saxReader = new SAXReader();

        // 2. 使用saxReader對象把需要解析的XML文件讀成一個Doucument對象
        Document document =
                saxReader.read("properties-xml-log-app\\src\\helloworld.xml");

        // 3. 從文檔對象中解析XML文件的全部數據
        Element root = document.getRootElement();
        System.out.println(root.getName());

        // 4. 獲取根元素下的全部一級子元素
        // List<Element> elements = root.elements();
        List<Element> elements = root.elements("user");
        for(Element element: elements){
            System.out.println(element.getName());
        }

        // 5. 獲取當前元素下的某個子元素
        Element people = root.element("people");
        System.out.println(people.getText());

        // 如果下面有很多子元素user，默認獲取第一個
        Element user = root.element("user");
        System.out.println(user.elementText("name"));

        // 6. 獲取元素的屬性訊息
        System.out.println(user.attributeValue("id"));
        Attribute id = user.attribute("id");
        System.out.println(id.getName());
        System.out.println(id.getValue());

        List<Attribute> attributes = user.attributes();
        for(Attribute attribute: attributes){
            System.out.println(attribute.getName() + "=" + attribute.getValue());
        }

        // 7. 獲取全部的文本內容: 獲取當前元素下的子元素文本值
        System.out.println(user.elementText("name"));
        System.out.println(user.elementText("地址"));
        System.out.println(user.elementText("password"));

        Element data = user.element("data");
        System.out.println(data.getText());
        System.out.println(data.getTextTrim()); // 取出文本去除前後空格
    }
}
