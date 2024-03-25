package com.itheima;

import javax.swing.*;
/*
* 构造方法
*       JFrame():构造一个最初不可见的新窗体
* 成员方法
*       void setVisible(boolean b):显示或隐藏此窗体具体取决于参数b的值
*       void setSize(int width,int height):调整此组件的大小,使其宽度为width,高度为height,单位是像素
* */
public class JFrameDemo01 {
    public static void main(String[] args) {
        //JFrame():构造一个最初不可见的新窗体
        JFrame jf = new JFrame();

        //void setSize(int width,int height):调整此组件的大小,使其宽度为width,高度为height,单位是像素
        jf.setSize(400,300);//单位:px,表示像素的意思

        // void setVisible(boolean b):显示或隐藏此窗体具体取决于参数b的值
        jf.setVisible(true);

    }
}
