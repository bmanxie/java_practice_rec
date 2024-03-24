package com.xie.d3_collection_list;

import java.util.LinkedList;

/**
 * 掌握LinkedLidt集合的使用
 */
public class ListTest2 {
    public static void main(String[] args) {
        // 1. 創建一個隊列
        LinkedList<String> queue = new LinkedList<>();
        queue.addLast("第一號人");
        queue.addLast("第二號人");
        System.out.println(queue);
        queue.addLast("第三號人");
        queue.addLast("第四號人");
        System.out.println(queue);
        // 出隊
        System.out.println(queue.removeFirst());
        System.out.println(queue.removeFirst());
        System.out.println(queue.removeFirst());
        System.out.println(queue);
        System.out.println("==================");
        LinkedList<String> stack = new LinkedList<>();
        // 填充彈夾(push)
        stack.push("第一個子彈");
        stack.push("第二個子彈");
        stack.push("第三個子彈");
        stack.push("第四個子彈");
        System.out.println(stack);
        // 射出(pop)
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack);
    }
}
