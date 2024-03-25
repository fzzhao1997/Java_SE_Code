package com.itheima;

import javax.swing.*;

public class JFrameDemo07 {
    public static void main(String[] args) {
        //1.创建窗体
        //1)设置新窗体
        JFrame jf = new JFrame();
        //2)窗体标题
        jf.setTitle("手机日期和时间显示");
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

        //日期文本
        JLabel  dataText = new JLabel("日期");
        dataText.setBounds(50,50,100,20);
        jf.add(dataText);

        //具体日期
        JLabel data = new JLabel("xxxx年xx月xx日");
        data.setBounds(50,80,200,20);
        jf.add(data);

        //时间文本
        JLabel timeText = new JLabel("时间");
        timeText.setBounds(50,150,100,20);
        jf.add(timeText);

        //具体时间
        JLabel time = new JLabel("xx:xx:xx");
        time.setBounds(50,180,200,20);
        jf.add(time);

        jf.setVisible(true);
    }
}
