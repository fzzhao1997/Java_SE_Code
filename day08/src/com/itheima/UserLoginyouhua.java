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

public class UserLoginyouhua {
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
        JButton loginButton = new JButton("登录");
        //b)按钮大小
        loginButton.setBounds(50, 200, 280, 20);
        //c)按钮到窗体上
        jf.add(loginButton);

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

        //5)密码优化为输入不可见
        //a)设置新文框对象
        JPasswordField passwordField = new JPasswordField();
        //b)文本框大小
        passwordField.setBounds(150, 100, 180, 20);
        //c)文本框到窗体上
        jf.add(passwordField);
        //设置窗体可见
        jf.setVisible(true);

        //已知的用户名和密码
        String name = "admin888";
        String pwd = "123456";

        loginButton.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //获取用户输入的用户名和密码
                String username = usernameField.getText();
                String password = passwordField.getText();

                //判断输入的用户名和密码是否符合要求
                //用户名和密码长度都是6-12位
                if(username.length()<6 && (password.length()<6 ||password.length()>12)
                        ||username.length()>12&& (password.length()<6 ||password.length()>12)){
                    //静态的成员方法和成员变量可以通过类名访问的
                    JOptionPane.showMessageDialog(jf,"用户名和密码的长度是6-12位,请重新输入");
                    usernameField.setText("");
                    passwordField.setText("");
                    return;//不再往下执行
                }
                if(username.length()<6||username.length()>12){
                    JOptionPane.showMessageDialog(jf,"用户名的长度是6-12位,请重新输入");
                    usernameField.setText("");
                    passwordField.setText("");
                    return;//不再往下执行
                }
                if(password.length()<6||password.length()>12){
                    JOptionPane.showMessageDialog(jf,"密码的长度是6-12位,请重新输入");
                    usernameField.setText("");
                    passwordField.setText("");
                    return;//不再往下执行
                }
//if else只执行一个,不用return,但多个if如果会矛盾,应考虑return
                //再判断用户登录是否成功
                if(username.equals(name)&&password.equals(pwd)){
                    JOptionPane.showMessageDialog(jf,"登录成功");
                    usernameField.setText("");
                    passwordField.setText("");
                }else{
                    JOptionPane.showMessageDialog(jf,"用户名或密码有误");
                    usernameField.setText("");
                    passwordField.setText("");
                }
            }
        });

    }
}
