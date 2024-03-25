package com.itheima;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.util.Random;

/*
 *   1:系统产生一个1-100之间的随机数
 *   2:猜的内容不能为空
 *   3:每次根据猜的数字给出相应的提示
 * */
public class GuessNumber {
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
//不能把随机数放点击事件中
        //原因:类似在循环中,生成随机数,每一次点击,相当于生成新的随机数,这样没法去猜了,要一次猜中才行
        Random r = new Random();
        int number = r.nextInt(100) + 1;
        //2.创建组件
        //1)显示猜一猜提示信息
        JLabel promptMessage = new JLabel("系统产生了一个1-100之间的数据,请猜一猜");
        promptMessage.setBounds(70, 50, 350, 20);
        jf.add(promptMessage);

        //2)输入猜数字文本框
        JTextField numberField = new JTextField();
        numberField.setBounds(120, 100, 150, 20);
        jf.add(numberField);

        //3)我猜按钮
        JButton guessButton = new JButton("我猜");
        guessButton.setBounds(145, 150, 100, 20);
        jf.add(guessButton);

        guessButton.addActionListener(new AbstractAction() {
            //关于while死循环解释:
            // 1.如果加了while会一次触发多次循环(死循环)
            // 2.点确定或x提示,清空文本框数据再次触发"猜的数字不能为空",
            // 3.!!!相当于设置或生成了无限多个guessButton触发!!!
            // 正常状态:
            // 1.正常会触发后结束方法,下次点击才触发,因为没有下一个guessButton的方法了,
            // 2.如果有如下,依然触发"11111"
            @Override
            public void actionPerformed(ActionEvent e) {
//                int getNumber = Integer.parseInt(numberField.getText().trim());
// 不能放前面会空字符串转int导致报错,可以放return后面,这样上个程序成立,已跳出,不会转也就不报错
                //2:猜的内容不能为空
                String stringNumber = numberField.getText().trim();
                if (stringNumber.isEmpty()) {
                    JOptionPane.showMessageDialog(jf, "猜的数字不能为空");//点了确定或×方法才结束
                    numberField.setText("");
                    return;
                }
                int getNumber = Integer.parseInt(numberField.getText().trim());
                //Parse 解析对象看头,如上int,
                // 被解析内容是parse内部,如上(numberField.getText().trim(),是String类型
                if (getNumber > 100 || getNumber < 1) {
                    JOptionPane.showMessageDialog(jf, "猜的数字应为1到100");
                    numberField.setText("");
                    return;
                }
                //3:每次根据猜的数字给出相应的提示
                if (getNumber == number) {
                    JOptionPane.showMessageDialog(jf, "恭喜你,猜对了");
                    numberField.setText("");
                    return;//跳出if语句所在类的所在⽅法,即跳出actionPerformed方法
                }
                if (getNumber > number) {
                    JOptionPane.showMessageDialog(jf, getNumber + "猜大了");
                    numberField.setText("");
                } else {
                    JOptionPane.showMessageDialog(jf, getNumber + "猜小了");
                    numberField.setText("");
                }
            }
        });
//        guessButton.addActionListener(new AbstractAction() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                System.out.println("11111");
//            }
//        });
        //3.设置窗体可见
        jf.setVisible(true);
    }
}
