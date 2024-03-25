package com.xie.d7_stream;

import java.util.*;
import java.util.stream.Collectors;

/**
 * 目標: 掌握Stream流的常見終結方法
 *      彈幕
 *      Q1: 需求2 的max不是終結方法嗎? 為什麼還能調用get?
 *      A: 終結指的是終結Stream流。 返回的不是流，可能是別的對象，還可以繼續對返回對象進行操作
 */
public class StreamTest4 {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        Student s1 = new Student("劉備", 22,177.2);
        Student s2 = new Student("關羽", 21,180.2);
        Student s3 = new Student("項羽", 31,186.8);
        Student s4 = new Student("呂布", 30,182.2);
        Student s5 = new Student("黃忠", 20,181.1);
        Student s6 = new Student("黃忠", 20,181.1);
        Student s7 = new Student("張飛", 21,173.2);
        Collections.addAll(students, s1,s2,s3,s4,s5,s6,s7);
        // 需求1. 計算出身高超過181的有幾人
        long size = students.stream().filter(s -> s.getHeight() > 181).count();
        System.out.println(size);

        // 需求2. 找出身高最高的學生對象，並輸出
        Student s = students.stream().max((o1, o2) -> Double.compare(o1.getHeight(), o2.getHeight())).get();
        System.out.println(s);

        // 需求3. 找出身高最矮的學生對象，並輸出
        Student ss = students.stream().min((o1, o2) -> Double.compare(o1.getHeight(), o2.getHeight())).get();
        System.out.println(ss);

        // 需求4. 找出身高超過180的學生對象，並放到一個新集合中去返回
        /**  students.stream().filter(a -> a.getHeight() > 180);兩段重複，因此直接創一個新Stream流。
             Stream<Student> studentStream = students.stream().filter(a -> a.getHeight() > 180);
             失敗!! 因為流只能蒐集一次。
             當這個studentStream超過180的對象蒐集後，這個studentStream就關閉了。

         */

        List<Student> students1 = students.stream().filter(a -> a.getHeight() > 180).collect(Collectors.toList());
        System.out.println(students1);

        Set<Student> students2 = students.stream().filter(a -> a.getHeight() > 180).collect(Collectors.toSet());
        System.out.println(students2);

        // 需求5. 請找出身高超過180的學生對象，並把學生對象的名字和身高，存入到一個Map集合返回
        Map<String, Double> map =
                students.stream().filter(a -> a.getHeight() > 180)
                        .distinct()
                        .collect(Collectors.toMap(a -> a.getName(), a ->a.getHeight()));
        System.out.println(map);

        // Object[] arr = students.stream().filter(a -> a.getHeight() > 180).toArray();
        Student[] arr = students.stream().filter(a -> a.getHeight() > 180).toArray(len -> new Student[len]);
        System.out.println(Arrays.toString(arr));


    }
}
