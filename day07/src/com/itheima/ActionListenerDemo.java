package com.itheima;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class ActionListenerDemo {
    public static void main(String[] args) {
        //1.创建窗体
        //1)设置新窗体
        JFrame jf = new JFrame();
        //2)窗体标题
        jf.setTitle("事件监听机制");
        //3)窗体大小
        jf.setSize(1280, 960);
        //4)窗体关闭退出程序
        jf.setDefaultCloseOperation(3);
        //5)窗体居中
        jf.setLocationRelativeTo(null);
        //6)窗体置顶
        jf.setAlwaysOnTop(true);
        //窗体取消默认布局
        jf.setLayout(null);

        Font font = new Font("宋体",Font.PLAIN,36);
        //创建按钮
        JButton btn1 = new JButton("你点我啊");
        btn1.setBounds(0,0,300,300);
        btn1.setFont(font);
        jf.add(btn1);
        JButton btn2 = new JButton("继续点啊");
        btn2.setBounds(300,0,300,300);
        btn2.setFont(font);
        jf.add(btn2);
        btn2.setVisible(false);
        JButton btn3 = new JButton("有种继续啊");
        btn3.setBounds(500,500,300,300);
        btn3.setFont(font);
        jf.add(btn3);
        btn3.setVisible(false);
        JButton btn4 = new JButton("再点沙了你");
        btn4.setBounds(700,700,300,300);
        btn4.setFont(font);
        jf.add(btn4);
        btn4.setVisible(false);
        JButton btn5 = new JButton("真听话,大憨批!");
        btn5.setBounds(800,300,300,300);
        btn5.setFont(font);
        jf.add(btn5);
        btn5.setVisible(false);
        JLabel img2 = new JLabel(
                new ImageIcon("day07\\imgs\\img2.jpg")
        );
        img2.setBounds(0,0,1280,960);
        jf.add(img2);
        img2.setVisible(false);

        btn1.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btn1.setVisible(false);
                btn2.setVisible(true);
            }
        });
        btn2.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btn1.setVisible(false);
                btn2.setVisible(false);
                btn3.setVisible(true);
            }
        });
        btn3.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btn1.setVisible(false);
                btn2.setVisible(false);
                btn3.setVisible(false);
                btn4.setVisible(true);
            }
        });
        btn4.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btn1.setVisible(false);
                btn2.setVisible(false);
                btn3.setVisible(false);
                btn4.setVisible(false);
                btn5.setVisible(true);
            }
        });
        btn5.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btn1.setVisible(false);
                btn2.setVisible(false);
                btn3.setVisible(false);
                btn4.setVisible(false);
                btn5.setVisible(false);
                img2.setVisible(true);
            }
        });

        jf.setVisible(true);
    }
}
