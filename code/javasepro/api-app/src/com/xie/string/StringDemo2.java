package com.xie.string;

public class StringDemo2 {
    public static void main(String[] args) {
        String s = "這裡是台中";

        // 1. 獲取字符串長度
        System.out.println(s.length());

        // 2. 提取字符串某個索引的字符
        char c = s.charAt(2);
        System.out.println(c);

        // 字符串的遍歷
        for (int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            System.out.println(ch);
        }
        System.out.println("==================");
        // 3. 字符串轉成字符數組，再遍歷
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++){
            System.out.println(chars[i]);
        }

        // 4. 判斷字符串內容是否相同，一樣就true equals()
        String s1 = new String("taiwan");
        String s2 = new String("taiwan");
        System.out.println(s1 == s2); // false 地址不同
        System.out.println(s1.equals(s2)); // true

        // 5. 忽略大小寫比較字符串內容 equalsIgnoreCase()
        String s3 = "34DWsd5";
        String s4 = "34dwsD5";
        System.out.println(s3.equals(s4));
        System.out.println(s3.equalsIgnoreCase(s4));

        // 6. 截出字符串內容(包前不包後)
        String s5 = "明天晚餐吃牛排";
        String rs = s5.substring(0, 4);
        System.out.println(rs);

        // 7. 從當前索引截取到最後
        String rs2 = s5.substring(5);
        System.out.println(rs2);

        // 8. 字符串某內容替換掉並返回新字符串 replace()
        String review = "這個店的食物真的很難吃，不再來了";
        String rs3 = review.replace("難吃", "**");
        System.out.println(rs3);

        // 9. 判斷字符串中是否包含某關鍵字 contains()
        String review2 = "這間食材新鮮，裝潢新穎，會再來";
        System.out.println(review2.contains("新鮮"));
        System.out.println(review2.contains("新先"));
        System.out.println(review2.contains("新新"));

        // 10. 判斷字符串是否以某個字符串開頭
        String review3 = "台北飯店都漲價了";
        System.out.println(review3.startsWith("台"));
        System.out.println(review3.startsWith("台北"));
        System.out.println(review3.startsWith("臺北"));

        // 11. 將字符串內容分割成多個字符串，放到一個字符串數組中返回
        String rs4 = "張無忌,周芷若,張三豐,趙敏";
        String[] names = rs4.split(",");
        for (int i = 0; i < names.length; i++){
            System.out.println(names[i]);
        }
    }
}
