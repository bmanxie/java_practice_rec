package com.xie.d7_stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

/**
 * 目標: 掌握Stream流提供的常見中間方法
 */
public class StreamTest3 {
    public static void main(String[] args) {
        List<Double> scores = new ArrayList<>();
        Collections.addAll(scores, 88.5, 100.0, 90.5, 63.0, 25.9);
        // 需求: 找出大於60分的數據，並升序後輸出
        scores.stream().filter(s -> s >= 60).sorted().forEach(s -> System.out.println(s));

        System.out.println("=====需求2=====");
        List<Student> students = new ArrayList<>();
        Student s1 = new Student("劉備", 22,177.2);
        Student s2 = new Student("關羽", 21,180.2);
        Student s3 = new Student("項羽", 31,186.8);
        Student s4 = new Student("呂布", 30,182.2);
        Student s5 = new Student("黃忠", 20,181.1);
        Student s6 = new Student("黃忠", 20,181.1);
        Student s7 = new Student("張飛", 21,173.2);
        Collections.addAll(students, s1,s2,s3,s4,s5,s6,s7);
        // 需求2. 取出年齡大於等於22，且年齡小於等於30的學生，並按照年齡降序輸出
        students.stream().filter(s -> s.getAge() >= 22 && s.getAge() <= 30)
                .sorted((o1, o2) -> o2.getAge() - o1.getAge())
                .forEach(s -> System.out.println(s));

        System.out.println("=====需求3=====");
        // 需求3. 取出身高最高的前3名，並輸出
        students.stream().sorted(((o1, o2) -> Double.compare(o2.getHeight(), o1.getHeight())))
                .limit(3).forEach(System.out::println);

        System.out.println("=====需求4=====");
        // 需求4. 取出身高倒數的2名學生，並輸出。 s1,s2,s3,s4,s5,s6 skip(size(總長) - 2 (取最後2))
        students.stream().sorted((o1, o2) -> Double.compare(o2.getHeight(), o1.getHeight()))
                .skip(students.size() -2).forEach(System.out::println);

        System.out.println("=====需求5=====");
        // 需求5. 找出身高超過181的學生叫什麼名字，要求取除重複的名字，再輸出。
        students.stream().filter(s -> s.getHeight() > 181).map(Student::getName)
                .distinct().forEach(System.out::println);

        // distinct去重複，自定義類型對象(希望內容一樣就算重複，要重寫hashCode, eauals)
        students.stream().filter(s -> s.getHeight() > 181)
                .distinct().forEach(System.out::println);

        Stream<String> st1 = Stream.of("張三", "李四");
        Stream<String> st2 = Stream.of("張三2", "李四2","王五");
        Stream<String> allst = Stream.concat(st1, st2);
        allst.forEach(System.out::println);
    }
}
