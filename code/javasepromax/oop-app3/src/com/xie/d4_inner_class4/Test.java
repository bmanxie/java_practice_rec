package com.xie.d4_inner_class4;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Test {
    public static void main(String[] args) {
        // 拓展: 搞清楚匿名內部類在開發中的真實使用場景
        // GUI編程
        // 1. 創建窗口
        JFrame win = new JFrame("登入介面");
        JPanel panel = new JPanel();
        win.add(panel);

        JButton btn = new JButton("登入");
        panel.add(btn);

        // 給按扭綁定單擊事件監聽器
//        btn.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                JOptionPane.showMessageDialog(win, "登入一下");
//            }
//        });
//
        // 最終的核心是簡化代碼
        btn.addActionListener(e -> JOptionPane.showMessageDialog(win, "登入一下"));


        win.setSize(400,400);
        win.setLocationRelativeTo(null); // 居中
        win.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); // 關閉窗口退出運行
        win.setVisible(true);
    }
}
