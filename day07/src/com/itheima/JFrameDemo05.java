package com.itheima;

import javax.swing.*;

/*
* 需求:聊天室
* */
public class JFrameDemo05 {
    public static void main(String[] args) {
        //1.创建窗体
        //1)设置新窗体
        JFrame jf = new JFrame();
        //2)窗体标题
        jf.setTitle("聊天室");
        //3)窗体大小
        jf.setSize(400, 300);
        //4)窗体关闭退出程序
        jf.setDefaultCloseOperation(3);
        //5)窗体居中
        jf.setLocationRelativeTo(null);
        //6)窗体置顶
        jf.setAlwaysOnTop(true);
        //窗体取消默认布局
        jf.setLayout(null);

        //2.创建组件
        //1)显示聊天信息的文本域
        JTextArea messageArea = new JTextArea();
        messageArea.setBounds(10,10,360,200);
        jf.add(messageArea);

        //2)输入聊天信息文本框
        JTextField messageField = new JTextField();
        messageField.setBounds(10,230,180,20);
        jf.add(messageField);

        //3)发送按钮
        JButton sendButton = new JButton("发送");
        sendButton.setBounds(200,230,70,20);
        jf.add(sendButton);

        //4)清空聊天按钮
        JButton clearButton = new JButton("清空聊天");
        clearButton.setBounds(280,230,100,20);
        jf.add(clearButton);

        //3.设置窗体可见
        jf.setVisible(true);
    }
}
