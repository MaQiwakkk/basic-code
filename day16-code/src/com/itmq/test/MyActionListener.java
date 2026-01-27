package com.itmq.test;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyActionListener {
    public static void main(String[] args) {
        JFrame frame = new JFrame("<UNK>");
        //设置界面的宽高
        frame.setSize(603, 680);
        //设置界面的标题
        frame.setTitle("拼图游戏 v1.0");
        //设置界面置顶
        frame.setAlwaysOnTop(true);
        //设置界面居中
        frame.setLocationRelativeTo(null);
        //设置关闭模式
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        //取消默认居中
        frame.setLayout(null);
        frame.setVisible(true);

        JButton jButton = new JButton("come on!");
        jButton.setBounds(0, 0, 100, 30);
        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("扣1送地狱火");
            }
        });
        frame.getContentPane().add(jButton);
    }
}
