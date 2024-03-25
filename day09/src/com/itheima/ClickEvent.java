package com.itheima;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class ClickEvent {
    public static void main(String[] args) {
        JFrame jf = new JFrame();
        //1)窗体名字
        jf.setTitle("聊天室");
        //2)窗体大小
        jf.setSize(400, 300);
        //3)窗体关闭退出程序
        jf.setDefaultCloseOperation(3);
        //4)窗体居中
        jf.setLocationRelativeTo(null);
        //5)窗体置顶
        jf.setAlwaysOnTop(true);
        //6)窗体取消默认布局
        jf.setLayout(null);

        //按钮
        JButton btn = new JButton();

        btn.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("逻辑");
            }
        });
        jf.setVisible(true);
    }
}
