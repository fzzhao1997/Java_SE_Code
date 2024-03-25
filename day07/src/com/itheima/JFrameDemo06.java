package com.itheima;

import javax.swing.*;

public class JFrameDemo06 {
    public static void main(String[] args) {
        //1.创建窗体
        //1)设置新窗体
        JFrame jf = new JFrame();
        //2)窗体标题
        jf.setTitle("猜数字");
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
        //1)显示猜一猜提示信息
        JLabel promptMessage = new JLabel("系统产生了一个1-100之间的数据,请猜一猜");
        promptMessage.setBounds(70,50,350,20);
        jf.add(promptMessage);

        //2)输入猜数字文本框
        JTextField numberField = new JTextField();
        numberField.setBounds(120,100,150,20);
        jf.add(numberField);

        //3)我猜按钮
        JButton guessButton = new JButton("我猜");
        guessButton.setBounds(145,150,100,20);
        jf.add(guessButton);

        //3.设置窗体可见
        jf.setVisible(true);
    }
}
