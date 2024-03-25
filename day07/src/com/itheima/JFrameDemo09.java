package com.itheima;

import javax.swing.*;

public class JFrameDemo09 {
    public static void main(String[] args) {
        //1.创建窗体
        //1)设置新窗体
        JFrame jf = new JFrame();
        //2)窗体标题
        jf.setTitle("考勤查询");
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

        //考勤日期文本
        JLabel data = new JLabel("考勤日期");
        data.setBounds(50,20,100,20);
        jf.add(data);

        //开始时间文本
        JLabel startTime = new JLabel("开始时间");
        startTime.setBounds(50,70,100,20);
        jf.add(startTime);
        DateChooser dateChooser1 = DateChooser.getInstance("yyyy/MM/dd");//类名.静态方法名:为了调用更方便
        DateChooser dateChooser2 = DateChooser.getInstance("yyyy/MM/dd");

        //开始时间文本框
        JTextField startTimeText = new JTextField();
        startTimeText.setBounds(50,100,100,20);
        //把日历控件和文本框进行绑定
        dateChooser1.register(startTimeText);
        jf.add(startTimeText);

        //结束时间文本
        JLabel endTime = new JLabel("结束时间");
        endTime.setBounds(250,70,100,20);
        jf.add(endTime);

        //结束时间文本框
        JTextField endTimeText = new JTextField();
        endTimeText.setBounds(250,100,100,20);
        //把日历控件和文本框进行绑定
        dateChooser2.register(endTimeText);
        jf.add(endTimeText);

        //确定按钮

        JButton btn = new JButton("确定");
        btn.setBounds(250,180,60,20);
        jf.add(btn);

        jf.setVisible(true);
    }
}
