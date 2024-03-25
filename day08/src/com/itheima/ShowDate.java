package com.itheima;

import javax.swing.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ShowDate {
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
        Date d = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日");
        String dateString = sdf.format(d);

        JLabel date = new JLabel(dateString);//dataString导入日期文本标签




        date.setBounds(50,80,200,20);
        jf.add(date);

        //时间文本
        JLabel timeText = new JLabel("时间");
        timeText.setBounds(50,150,100,20);
        jf.add(timeText);

        //具体时间
        SimpleDateFormat sdf2 = new SimpleDateFormat("HH:mm:ss");
        String timeString = sdf2.format(d);

        JLabel time = new JLabel(timeString);//timeString导入时间文本标签
        time.setBounds(50,180,200,20);
        jf.add(time);

        jf.setVisible(true);
    }
}
