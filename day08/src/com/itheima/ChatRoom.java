package com.itheima;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class ChatRoom {
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
        messageArea.setBounds(10, 10, 360, 200);
        jf.add(messageArea);

        //2)输入聊天信息文本框
        JTextField messageField = new JTextField();
        messageField.setBounds(10, 230, 180, 20);
        jf.add(messageField);

        //3)发送按钮
        JButton sendButton = new JButton("发送");
        sendButton.setBounds(200, 230, 70, 20);
        jf.add(sendButton);

        //4)清空聊天按钮
        JButton clearButton = new JButton("清空聊天");
        clearButton.setBounds(280, 230, 100, 20);
        jf.add(clearButton);

        sendButton.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
//                //获取文本框的内容
//                String message = messageField.getText();
//
//                //获得后清空文本框内容
//                messageField.setText("");
//
//                //发送内容不带前后空格
//                message = message.trim();
                String message = messageField.getText().trim();//链式调用
                /*
                 * 对message进行非空判断->空值->错误提示,结束方法
                 * 1.判断不为空
                 * 2.判断长度不为0
                 * 3.和""比较内容
                 *  */
//                //1.判断不为空
//                if(message.isEmpty()){
//                    JOptionPane.showMessageDialog(jf,"不能发送空的内容");
//                    return;
//                }
//                //2.判断长度不为0
//                if (message.length() == 0) {
//                    JOptionPane.showMessageDialog(jf, "不能发送空的内容");
//                    return;
//                }
                //3.和""比较内容
                if (message.equals("")) {
                    JOptionPane.showMessageDialog(jf, "不能发送空的内容");
                    return;
                }
                messageField.setText("");
//                //把文本框的内容发送到文本域中,无法以追加形式显示
//                messageArea.setText(message);
                //追加形式,但未换行,采用"\n"换行
                messageArea.append(message + "\n");
            }
        });
        clearButton.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                messageArea.setText("");
            }
        });
        //3.设置窗体可见
        jf.setVisible(true);
    }
}
