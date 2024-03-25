package com.itheima;

import javax.swing.*;

/*
* void setTitle(String title):设置窗体标题
* void setLocationRelativeTO(Component c):设置位置,值为null,则窗体位于屏幕中央
* void setDefaultCloseOperation(int operation):设置窗体关闭时默认操作(整数3表示:窗口关闭时退出应用程序)
* void setAlwaysOnTop(boolean alwaysOneTop):设置此窗口是否始终位于其他窗口之上
* */
public class JFrameDemo02 {
    public static void main(String[] args) {
        //创建窗体对象:对象
        JFrame jf = new JFrame();

        //设置标题:标题
        jf.setTitle("百度一下,你就知道");

        //设置窗体大小:大小
        jf.setSize(400,300);//单位:px,表示像素的意思

        //设置窗口关闭时退出应用程序:关闭停止运行
        jf.setDefaultCloseOperation(3);

        //设置窗体位于屏幕中央:居中
        jf.setLocationRelativeTo(null);

        //设置此窗口始终位于其他窗口之上:置顶
        jf.setAlwaysOnTop(true);

        //基本组件

        //设置窗体可见:可见(一般写在最后)
        jf.setVisible(true);
    }
}
