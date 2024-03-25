package com.itheima;

import javax.swing.*;

//让本类继承JFrame类,就能使用JFrame类的方法了
public class MyJFrame extends JFrame {
    //空参构造
    //外界空参创建对象->就会触发空参中的代码->完成窗体显示(空参里套方法)
    public MyJFrame() {
        //初始化窗体调用
        initFrame();
        //绘制基本组件
        paintView();
        this.setVisible(true);//this代表本类对象,即MyJFrame的对象
    }

    //初始化窗体
    public void initFrame() {
        //1)窗体名字
        this.setTitle("聊天室");
        //2)窗体大小
        this.setSize(400, 300);
        //3)窗体关闭退出程序
        this.setDefaultCloseOperation(3);
        //4)窗体居中
        this.setLocationRelativeTo(null);
        //5)窗体置顶
        this.setAlwaysOnTop(true);
        //6)窗体取消默认布局
        this.setLayout(null);
    }

    public void paintView() {
        //1)显示聊天信息的文本域
        JTextArea messageArea = new JTextArea();
        messageArea.setBounds(10, 10, 360, 200);
        this.add(messageArea);

        //2)输入聊天信息文本框
        JTextField messageField = new JTextField();
        messageField.setBounds(10, 230, 180, 20);
        this.add(messageField);

        //3)发送按钮
        JButton sendButton = new JButton("发送");
        sendButton.setBounds(200, 230, 70, 20);
        this.add(sendButton);

        //4)清空聊天按钮
        JButton clearButton = new JButton("清空聊天");
        clearButton.setBounds(280, 230, 100, 20);
        this.add(clearButton);
    }
}
