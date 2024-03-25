package com.itheima;

import javax.swing.*;

/*
 * void setTitle(String title):设置窗体标题
 * void setLocationRelativeTO(Component c):设置位置,值为null,则窗体位于屏幕中央
 * void setDefaultCloseOperation(int operation):设置窗体关闭时默认操作(整数3表示:窗口关闭时退出应用程序)
 * void setAlwaysOnTop(boolean alwaysOneTop):设置此窗口是否始终位于其他窗口之上
 * */
public class JFrameDemo03 {
    public static void main(String[] args) {
        //创建窗体对象:对象
        JFrame jf = new JFrame();

        //设置标题:标题
        jf.setTitle("窗口中添加按钮");

        //设置窗体大小:大小
        jf.setSize(400, 300);//单位:px,表示像素的意思

        //设置窗口关闭时退出应用程序:关闭停止运行
        jf.setDefaultCloseOperation(3);

        //设置窗体位于屏幕中央:居中
        jf.setLocationRelativeTo(null);

        //设置此窗口始终位于其他窗口之上:置顶
        jf.setAlwaysOnTop(true);

        //取消窗体的默认布局
        jf.setLayout(null);

        //基本组件
        //创建一个带文本的按钮
        JButton btn = new JButton("我是按钮");
//        //设置大小
//        btn.setSize(100,20);
//        //设置按钮位置
//        btn.setLocation(100,100);
        //位置和按钮大小一起调用
        btn.setBounds(100, 100, 100, 20);
        //按钮调用到窗体上
        jf.add(btn);
        JButton btn2 = new JButton("我是按钮2");
        btn2.setBounds(100, 120, 100, 20);
        jf.add(btn2);

        //创建文本对象
        JLabel jLabel = new JLabel("好好学习");
        jLabel.setBounds(0, 0, 120, 20);
        jf.add(jLabel);

        //创建图像对象
        //E:\BaiduNetdiskDownload\java基础课件\javaSE基础\day06-常用API\03-资料
//        ImageIcon imageIcon = new ImageIcon("E:\\BaiduNetdiskDownload\\java基础课件\\javaSE基础\\day06-常用API\\03-资料\\mn.png");
//        JLabel jLabel2 = new JLabel(imageIcon);
        JLabel jLabel2 = new JLabel(
                new ImageIcon(
                        "E:\\BaiduNetdiskDownload\\java基础课件\\javaSE基础\\day06-常用API\\03-资料\\mn.png"
                )//绝对路径
        );//代码合并
        jLabel2.setBounds(50, 50, 100, 143);
        jf.add(jLabel2);

        JLabel jLabel3 = new JLabel(
                new ImageIcon("day07\\imgs\\img1.png")//相对路径:相对谁?一般项目模块:
                // 格式:模块名//文件夹//文件名.文件类型
        );
        jLabel3.setBounds(200, 0, 100, 143);
        jf.add(jLabel3);

        //绝对路径写死了,一般不推荐,一般采用相对路径(项目下创建文件夹保存图片)

        //设置窗体可见:可见(一般写在最后)
        jf.setVisible(true);
    }
}
