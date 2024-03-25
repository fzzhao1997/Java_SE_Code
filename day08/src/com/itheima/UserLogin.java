package com.itheima;
/*
 *   要求:
 *       1.已知的用户名和密码
 *           用户名:itheima
 *           密码:123456
 *       2.用户名和密码长度都是6-12位
 *       3.点击登录按钮
 *           先判断输入的用户名和密码是否符合要求
 *           再判断用户登录是否成功
 * */

import javax.swing.*;
import java.awt.event.ActionEvent;

public class UserLogin {
    public static void main(String[] args) {
        //1.创建窗体
        //1)设置新窗体
        JFrame jf = new JFrame();
        //2)窗体标题
        jf.setTitle("用户登录");
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
        //1)创建登录按钮
        //a)设置新按钮
        JButton btn = new JButton("登录");
        //b)按钮大小
        btn.setBounds(50, 200, 280, 20);
        //c)按钮到窗体上
        jf.add(btn);

        //2)创建文本对象:用户名
        //a)设置新文本对象
        JLabel usernameLabel = new JLabel("用户名");
        //b)文本大小
        usernameLabel.setBounds(50, 50, 50, 20);
        //文本到窗体上
        jf.add(usernameLabel);

        //3)创建文本对象:密码
        //a)设置新文本对象
        JLabel passwordLabel = new JLabel("密码");
        //b)文本大小
        passwordLabel.setBounds(50, 100, 50, 20);
        //c)文本到窗体上
        jf.add(passwordLabel);

        //4)创建文本框对象:用户名输入
        //a)设置新文框对象
        JTextField usernameField = new JTextField();
        //b)文本框大小
        usernameField.setBounds(150, 50, 180, 20);
        //文本框到窗体上
        jf.add(usernameField);

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
        jf.add(passwordField);
        //设置窗体可见
        jf.setVisible(true);

        //6)用户长度错误提示
        //1.创建窗体
        //1)设置新窗体
        JFrame jf2 = new JFrame();
        //2)窗体标题
        jf2.setTitle("");
        //3)窗体大小
        jf2.setSize(200, 150);
        //5)窗体居中
        jf2.setLocationRelativeTo(null);
        //6)窗体置顶
        jf2.setAlwaysOnTop(true);
        //窗体取消默认布局
        jf2.setLayout(null);
        JLabel usernameFalsePrompt = new JLabel("请输入6-12位用户名");
        usernameFalsePrompt.setBounds(40, 20, 150, 20);
        jf2.add(usernameFalsePrompt);
        JButton btn2 = new JButton("确定");
        btn2.setBounds(55, 80, 80, 20);
        jf2.add(btn2);
        //设置窗体不可见
        jf2.setVisible(false);

        //7)密码长度错误提示
        //1.创建窗体
        //1)设置新窗体
        JFrame jf3 = new JFrame();
        //2)窗体标题
        jf3.setTitle("");
        //3)窗体大小
        jf3.setSize(200, 150);
        //5)窗体居中
        jf3.setLocationRelativeTo(null);
        //6)窗体置顶
        jf3.setAlwaysOnTop(true);
        //窗体取消默认布局
        jf3.setLayout(null);
        JLabel passwordFalsePrompt = new JLabel("请输入6-12位密码");
        passwordFalsePrompt.setBounds(40, 20, 150, 20);
        jf3.add(passwordFalsePrompt);
        JButton btn3 = new JButton("确定");
        btn3.setBounds(55, 80, 80, 20);
        jf3.add(btn3);
        //设置窗体不可见
        jf3.setVisible(false);

        //8)密码长度和用户名错误提示
        //1.创建窗体
        //1)设置新窗体
        JFrame jf4 = new JFrame();
        //2)窗体标题
        jf4.setTitle("");
        //3)窗体大小
        jf4.setSize(300, 150);
        //5)窗体居中
        jf4.setLocationRelativeTo(null);
        //6)窗体置顶
        jf4.setAlwaysOnTop(true);
        //窗体取消默认布局
        jf4.setLayout(null);
        JLabel usernameandpasswordFalsePrompt = new JLabel("请输入6-12位密码和6-12位用户名");
        usernameandpasswordFalsePrompt.setBounds(50, 20, 250, 20);
        jf4.add(usernameandpasswordFalsePrompt);
        JButton btn4 = new JButton("确定");
        btn4.setBounds(100, 80, 80, 20);
        jf4.add(btn4);
        //设置窗体不可见
        jf4.setVisible(false);

        //9)登录成功提示
        //1.创建窗体
        //1)设置新窗体
        JFrame jf5 = new JFrame();
        //2)窗体标题
        jf5.setTitle("");
        //3)窗体大小
        jf5.setSize(300, 150);
        //5)窗体居中
        jf5.setLocationRelativeTo(null);
        //6)窗体置顶
        jf5.setAlwaysOnTop(true);
        //窗体取消默认布局
        jf5.setLayout(null);
        JLabel success = new JLabel("密码正确,登录成功");
        success.setBounds(90, 20, 250, 20);
        jf5.add(success);
        JButton btn5 = new JButton("确定");
        btn5.setBounds(100, 80, 80, 20);
        jf5.add(btn5);
        //设置窗体不可见
        jf5.setVisible(false);

        //10)用户名或密码错误提示
        //1.创建窗体
        //1)设置新窗体
        JFrame jf6 = new JFrame();
        //2)窗体标题
        jf6.setTitle("");
        //3)窗体大小
        jf6.setSize(300, 150);
        //5)窗体居中
        jf6.setLocationRelativeTo(null);
        //6)窗体置顶
        jf6.setAlwaysOnTop(true);
        //窗体取消默认布局
        jf6.setLayout(null);
        JLabel error = new JLabel("用户名或密码错误,请重新输入");
        error.setBounds(60, 20, 250, 20);
        jf6.add(error);
        JButton btn6 = new JButton("确定");
        btn6.setBounds(100, 80, 80, 20);
        jf6.add(btn6);
        //设置窗体不可见
        jf6.setVisible(false);

        //4.添加逻辑
        //1)用户名:itheima,密码:123456
        String username = "itheima";
        String password = "123456";
        //2)错误提示
        btn.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //错误提示
                if ((usernameField.getText().trim().length() < 6
                        && passwordField.getText().trim().length() >= 6
                        && passwordField.getText().trim().length() <= 12) ||
                        (usernameField.getText().trim().length() > 12
                                && passwordField.getText().trim().length() >= 6
                                && passwordField.getText().trim().length() <= 12)) {
                    jf.setVisible(true);
                    jf2.setVisible(true);
                }
                if ((passwordField.getText().trim().length() < 6
                        && usernameField.getText().trim().length() >= 6
                        && usernameField.getText().trim().length() <= 12) ||
                        (passwordField.getText().trim().length() > 12
                                && usernameField.getText().trim().length() >= 6
                                && usernameField.getText().trim().length() <= 12)) {
                    jf.setVisible(true);
                    jf3.setVisible(true);
                }
                if((passwordField.getText().trim().length() < 6
                        && usernameField.getText().trim().length() < 6 )||
                        (passwordField.getText().trim().length() < 6
                                && usernameField.getText().trim().length() > 12) ||
                        (passwordField.getText().trim().length() > 12
                                && usernameField.getText().trim().length() < 6 )||
                        (passwordField.getText().trim().length() > 12
                                && usernameField.getText().trim().length() > 12)) {
                    jf.setVisible(true);
                    jf4.setVisible(true);
                }
            }
        });
        //3)返回登录界面
        btn2.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jf.setVisible(true);
                jf2.setVisible(false);
                usernameField.setText("");
                passwordField.setText("");
            }
        });
        btn3.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jf.setVisible(true);
                jf3.setVisible(false);
                usernameField.setText("");
                passwordField.setText("");
            }
        });
        btn4.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jf.setVisible(true);
                jf4.setVisible(false);
                usernameField.setText("");
                passwordField.setText("");
            }
        });
        //4)确认登录
        btn.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(usernameField.getText().trim().equals(username)&&
                        passwordField.getText().trim().equals(password)){
                    jf.setVisible(true);
                    jf5.setVisible(true);
                }else{
                    jf.setVisible(true);
                    jf6.setVisible(true);
                }
            }
        });
        btn5.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jf.setVisible(true);
                jf5.setVisible(false);
                usernameField.setText("");
                passwordField.setText("");
            }
        });
        btn6.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jf.setVisible(true);
                jf6.setVisible(false);
                usernameField.setText("");
                passwordField.setText("");
            }
        });

    }
}
