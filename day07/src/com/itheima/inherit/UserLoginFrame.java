package com.itheima.inherit;

import javax.swing.*;

public class UserLoginFrame extends JFrame{//声明是JFrame的子类,不用再创建对象,只需把jf改为this
    //提供空参构造
    public UserLoginFrame(){
        //在空参构造中,绘制窗体

        //1.窗体初始化
       initFrame();

       //2.绘制窗体
        paintView();

        //3.设置窗体可见
        this.setVisible(true);
    }

    public void paintView() { //2.创建组件
        //1)创建登录按钮
        //a)设置新按钮
        JButton btn = new JButton("登录");
        //b)按钮大小
        btn.setBounds(50, 200, 280, 20);
        //c)按钮到窗体上
        this.add(btn);

        //2)创建文本对象:用户名
        //a)设置新文本对象
        JLabel usernameLabel = new JLabel("用户名");
        //b)文本大小
        usernameLabel.setBounds(50, 50, 50, 20);
        //文本到窗体上
        this.add(usernameLabel);

        //3)创建文本对象:密码
        //a)设置新文本对象
        JLabel passwordLabel = new JLabel("密码");
        //b)文本大小
        passwordLabel.setBounds(50, 100, 50, 20);
        //c)文本到窗体上
        this.add(passwordLabel);

        //4)创建文本框对象:用户名输入
        //a)设置新文框对象
        JTextField usernameField = new JTextField();
        //b)文本框大小
        usernameField.setBounds(150, 50, 180, 20);
        //文本框到窗体上
        this.add(usernameField);

//        //5)创建文本框对象:密码输入
//        //a)设置新文框对象
//        JTextField passwordField = new JTextField();
//        //b)文本框大小
//        passwordField.setBounds(150, 100, 180, 20);
//        //c)文本框到窗体上
//        jf.add(passwordField);

        //5)密码优化为输入不可见
        //a)设置新文框对象
        JPasswordField passwordField = new JPasswordField();
        //b)文本框大小
        passwordField.setBounds(150, 100, 180, 20);
        //c)文本框到窗体上
        this.add(passwordField);
    }

    public void initFrame() {
        //2)窗体标题
        this.setTitle("用户登录");
        //3)窗体大小
        this.setSize(400, 300);
        //4)窗体关闭退出程序
        this.setDefaultCloseOperation(3);
        //5)窗体居中
        this.setLocationRelativeTo(null);
        //6)窗体置顶
        this.setAlwaysOnTop(true);
        //窗体取消默认布局
        this.setLayout(null);
    }
}
