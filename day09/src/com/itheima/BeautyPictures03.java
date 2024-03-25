package com.itheima;

import javax.swing.*;

public class BeautyPictures03 {
    public static void main(String[] args) {
        //1)创建对象
        JFrame jf = new JFrame();
        //2)窗体标题
        jf.setTitle("图片展示");
        //3)窗体大小
        jf.setSize(360, 400);
        //4)窗体关闭退出程序
        jf.setDefaultCloseOperation(3);
        //5)窗体居中
        jf.setLocationRelativeTo(null);
        //6)窗体置顶
        jf.setAlwaysOnTop(true);
        //窗体取消默认布局
        jf.setLayout(null);

//        for (int i = 0; i < 4; i++) {
//            JLabel jLabel = new JLabel(new ImageIcon("day09\\images\\"+(i+1)+".png"));
//            //每一次新的循环重新创建新的对象,原对象结束,所以不会报错
//            jLabel.setBounds(90*i,0,90,90);
//            jf.add(jLabel);
//        }
//        for (int i = 0; i < 4; i++) {
//            JLabel jLabel = new JLabel(new ImageIcon("day09\\images\\"+(i+5)+".png"));
//            //每一次新的循环重新创建新的对象,原对象结束,所以不会报错
//            jLabel.setBounds(90*i,90,90,90);
//            jf.add(jLabel);
//        }
//        for (int i = 0; i < 4; i++) {
//            JLabel jLabel = new JLabel(new ImageIcon("day09\\images\\"+(i+9)+".png"));
//            //每一次新的循环重新创建新的对象,原对象结束,所以不会报错
//            jLabel.setBounds(90*i,180,90,90);
//            jf.add(jLabel);
//        }
//        for (int i = 0; i < 4; i++) {
//            JLabel jLabel = new JLabel(new ImageIcon("day09\\images\\"+(i+13)+".png"));
//            //每一次新的循环重新创建新的对象,原对象结束,所以不会报错
//            jLabel.setBounds(90*i,270,90,90);
//            jf.add(jLabel);
//        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                JLabel jLabel = new JLabel(new ImageIcon("day09\\images\\" + (j + (i * 4 + 1)) + ".png"));
                //每一次新的循环重新创建新的对象,原对象结束,所以不会报错
                jLabel.setBounds(90 * j, 90*i, 90, 90);
                jf.add(jLabel);
            }
        }

        //窗体可见
        jf.setVisible(true);//不放最后面容易出bug
    }
}
