package com.itheima;

import javax.swing.*;

public class BeautyPictures02 {
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

//        //第一行
//        JLabel jLabel1 = new JLabel(new ImageIcon("day09\\images\\1.png"));
//        jLabel1.setBounds(0,0,90,90);
//        jf.add(jLabel1);
//
//        JLabel jLabel2 = new JLabel(new ImageIcon("day09\\images\\2.png"));
//        jLabel2.setBounds(90,0,90,90);
//        jf.add(jLabel2);
//
//        JLabel jLabel3 = new JLabel(new ImageIcon("day09\\images\\3.png"));
//        jLabel3.setBounds(180,0,90,90);
//        jf.add(jLabel3);
//        JLabel jLabel4 = new JLabel(new ImageIcon("day09\\images\\4.png"));
//        jLabel4.setBounds(270,0,90,90);
//        jf.add(jLabel4);

        for (int i = 0; i < 4; i++) {
            JLabel jLabel = new JLabel(new ImageIcon("day09\\images\\"+(i+1)+".png"));
            //每一次新的循环重新创建新的对象,原对象结束,所以不会报错
            jLabel.setBounds(90*i,0,90,90);
            jf.add(jLabel);
        }
        for (int i = 0; i < 4; i++) {
            JLabel jLabel = new JLabel(new ImageIcon("day09\\images\\"+(i+5)+".png"));
            //每一次新的循环重新创建新的对象,原对象结束,所以不会报错
            jLabel.setBounds(90*i,90,90,90);
            jf.add(jLabel);
        }
        for (int i = 0; i < 4; i++) {
            JLabel jLabel = new JLabel(new ImageIcon("day09\\images\\"+(i+9)+".png"));
            //每一次新的循环重新创建新的对象,原对象结束,所以不会报错
            jLabel.setBounds(90*i,180,90,90);
            jf.add(jLabel);
        }
        for (int i = 0; i < 4; i++) {
            JLabel jLabel = new JLabel(new ImageIcon("day09\\images\\"+(i+13)+".png"));
            //每一次新的循环重新创建新的对象,原对象结束,所以不会报错
            jLabel.setBounds(90*i,270,90,90);
            jf.add(jLabel);
        }
//        //第二行
//        JLabel jLabel5 = new JLabel(new ImageIcon("day09\\images\\5.png"));
//        jLabel5.setBounds(0,90,90,90);
//        jf.add(jLabel5);
//
//        JLabel jLabel6 = new JLabel(new ImageIcon("day09\\images\\6.png"));
//        jLabel6.setBounds(90,90,90,90);
//        jf.add(jLabel6);
//
//        JLabel jLabel7 = new JLabel(new ImageIcon("day09\\images\\7.png"));
//        jLabel7.setBounds(180,90,90,90);
//        jf.add(jLabel7);
//
//        JLabel jLabel8 = new JLabel(new ImageIcon("day09\\images\\8.png"));
//        jLabel8.setBounds(270,90,90,90);
//        jf.add(jLabel8);
//        //第三行
//        JLabel jLabel9 = new JLabel(new ImageIcon("day09\\images\\9.png"));
//        jLabel9.setBounds(0,180,90,90);
//        jf.add(jLabel9);
//
//        JLabel jLabel10 = new JLabel(new ImageIcon("day09\\images\\10.png"));
//        jLabel10.setBounds(90,180,90,90);
//        jf.add(jLabel10);
//
//        JLabel jLabel11 = new JLabel(new ImageIcon("day09\\images\\11.png"));
//        jLabel11.setBounds(180,180,90,90);
//        jf.add(jLabel11);
//
//        JLabel jLabel12= new JLabel(new ImageIcon("day09\\images\\12.png"));
//        jLabel12.setBounds(270,180,90,90);
//        jf.add(jLabel12);
//        //第四行
//        JLabel jLabel13 = new JLabel(new ImageIcon("day09\\images\\13.png"));
//        jLabel13.setBounds(0,270,90,90);
//        jf.add(jLabel13);
//
//        JLabel jLabel14 = new JLabel(new ImageIcon("day09\\images\\14.png"));
//        jLabel14.setBounds(90,270,90,90);
//        jf.add(jLabel14);
//
//        JLabel jLabel15 = new JLabel(new ImageIcon("day09\\images\\15.png"));
//        jLabel15.setBounds(180,270,90,90);
//        jf.add(jLabel15);
//
//        JLabel jLabel16 = new JLabel(new ImageIcon("day09\\images\\16.png"));
//        jLabel16.setBounds(270,270,90,90);
//        jf.add(jLabel16);

        //窗体可见
        jf.setVisible(true);//不放最后面容易出bug
    }
}
