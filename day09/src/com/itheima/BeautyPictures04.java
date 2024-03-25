package com.itheima;

import javax.swing.*;
import java.util.Random;

public class BeautyPictures04 {
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

        int[][] arr = new int[4][4];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = i*(arr[i].length)+1+j;
            }
        }
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                System.out.println(arr[i][j]);
//            }
//        }

//        for (int i = 0; i < 4; i++) {
//            for (int j = 0; j < 4; j++) {
//                JLabel jLabel = new JLabel(new ImageIcon("day09\\images\\" + (j + (i * 4 + 1)) + ".png"));
//                //每一次新的循环重新创建新的对象,原对象结束,所以不会报错
//                jLabel.setBounds(90 * j, 90*i, 90, 90);
//                jf.add(jLabel);
//            }
//        }
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                int temp = arr[i][j];
                int x = r.nextInt(arr.length);
                int y = r.nextInt(arr[x].length);
                arr[i][j] = arr[x][y];
                arr[x][y] = temp;
            }
        }

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                JLabel jLabel = new JLabel(new ImageIcon("day09\\images\\" + arr[i][j] + ".png"));
                //每一次新的循环重新创建新的对象,原对象结束,所以不会报错
                jLabel.setBounds(90*j, 90*i, 90, 90);
                jf.add(jLabel);
            }
        }

        //窗体可见
        jf.setVisible(true);//不放最后面容易出bug
    }
}
