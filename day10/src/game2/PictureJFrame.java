package game2;

import javax.swing.*;

public class PictureJFrame extends JFrame {
    public PictureJFrame (){
        //用于窗体的基本设置
        initJFrame();
        //绘制基本组件
        paintView();
        //设置窗体可见
        this.setVisible(true);
    };
    //窗体上组件绘制
    public void paintView(){
        //标题图片
        JLabel titleLabel = new JLabel(new ImageIcon("day10\\images\\title.png"));
        titleLabel.setBounds(354,27,232,57);
        this.add(titleLabel);

        //定义一个二维数组,用来储存图片编号
        int[][] arr = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}
        };
        //创建面板
        JPanel imageJPanel = new JPanel();
        imageJPanel.setBounds(150,114,360,360);
        //取消面板默认布局
        imageJPanel.setLayout(null);
        //遍历二维数组,得到图片编号
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                //创建JLabel对象,加载图片资源
                JLabel imageLabel = new JLabel(new ImageIcon("day10\\images\\"+arr[i][j]+".png"));
                //调整图片位置
                imageLabel.setBounds(j*90,i*90,90,90);
                imageJPanel.add(imageLabel);
            }
        }
        //把面板添加窗体上
        this.add(imageJPanel);
    }

    //用于窗体基本设置
    public void initJFrame(){
        //窗体大小
        this.setSize(960,565);
        //窗体标题
        this.setTitle("动漫拼图");
        //窗体居中
        this.setLocationRelativeTo(null);
        //窗体关闭时退出应用程序
        this.setDefaultCloseOperation(3);
        //窗体位于其他窗口之上
        this.setAlwaysOnTop(true);
        //取消窗体默认布局
        this.setLayout(null);
    }
}
