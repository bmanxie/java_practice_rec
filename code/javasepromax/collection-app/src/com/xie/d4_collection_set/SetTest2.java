package com.xie.d4_collection_set;

/**
 * 目標: 了解HashCode
 * Java中的所有對象都可以調用Object類提供的hashCode方法
 * 該對象會返回自己的HashCode
 * public int hashCode()
 * 同一個對象多次調用hashCode()返回的數值是相同的
 * 不同的對象，一般不相同，但也有可能重複(哈希碰裝)
 */
public class SetTest2 {
    public static void main(String[] args) {
        Student s1 = new Student("張三" ,25,168.5);
        Student s2 = new Student("李四" ,24,177.5);
        System.out.println(s1.hashCode());
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());

        String str1 = new String("abc");
        String str2 = new String("acD");
        System.out.println(str1.hashCode());
        System.out.println(str2.hashCode());
    }
}
