package game1;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.util.Random;

public class Logic extends PictureJFrame04 {
    public int [][] win = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};

    public Logic() {
//        initJFrame();
//        arr();
//        randomArr();
//        paintView();
//        setVisible(true);//创建了这些才能up,down才有,才能使用点击事件,
//        //或者直接在这些添加到Logic的父类中的构造函数PictureJFrame04,子类每次执行会自动创建父类的对象,并执行构造函数,这样不用再执行这些命令了
//        //但会把这些命令执行两次
//        //最好的方式,把这些放在构造函数中,测试类只穿件子类对象
        addButtonEvent();
    }


    public void repaint() {
        imageJPanel.removeAll();

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                JLabel imageJLabel = new JLabel(new ImageIcon("day10\\images\\" + array[i][j] + ".png"));
                imageJLabel.setBounds(90 * j, 90 * i, 90, 90);
                imageJPanel.add(imageJLabel);
            }

            imageJPanel.repaint();
        }

    }

    public void addButtonEvent() {
        up.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (x0 != 3) {
                    array[x0][y0] = array[x0 + 1][y0];
                    array[x0 + 1][y0] = 0;
                    x0++;

                    if(IsSuccess()){
                        success();
                    }

                    repaint();
                } else {
                    return;
                }
            }

        });
        down.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (x0 != 0) {
                    array[x0][y0] = array[x0 - 1][y0];
                    array[x0 - 1][y0] = 0;
                    x0--;

                    if(IsSuccess()){
                        success();
                    }

                    repaint();
                } else {
                    return;
                }
            }
        });
        right.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (y0 != 0) {
                    array[x0][y0] = array[x0][y0 - 1];
                    array[x0][y0 - 1] = 0;
                    y0--;

                    if(IsSuccess()){
                        success();
                    }

                    repaint();
                } else {
                    return;
                }
            }
        });
        light.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (y0 != 3) {
                    array[x0][y0] = array[x0][y0 + 1];
                    array[x0][y0 + 1] = 0;
                    y0++;

                    if(IsSuccess()){
                        success();
                    }

                    repaint();
                } else {
                    return;
                }
            }
        });
        help.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                success();
                repaint();
//                restart.addActionListener(new AbstractAction() {
//                    @Override
//                    public void actionPerformed(ActionEvent e) {
//                        randomArr();
//                        repaint();
//                        return;
//                    }
//                });
            }
        });
        restart.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                imageJPanel.removeAll();

                int count = 0;//计数器看看有没有0的array,因为求助会把0的array清掉
                for (int i = 0; i < array.length ; i++) {
                    for (int j = 0; j < array[i].length ; j++) {
                        if(array[i][j]==0){
                            count ++;
                        }
                    }
                }
                if(count == 1){//有0的array,直接随机打乱图片
                for (int i = 0; i < array.length; i++) {
                    for (int j = 0; j < array[i].length; j++) {
                        int x = r.nextInt(array.length);
                        int y = r.nextInt(array.length);
                        int temp = array[i][j];
                        array[i][j] = array[x][y];
                        array[x][y] = temp;
                    }
                }
                }else{//没有0的array需要,先赋值一个随机的0给任意数组中一个元素,然后再打乱图片
                    x0 = r.nextInt(array.length);
                    y0 = r.nextInt(array[x0].length);
                    array[x0][y0]=0;
                    for (int i = 0; i < array.length; i++) {
                        for (int j = 0; j < array[i].length; j++) {
                            int x = r.nextInt(array.length);
                            int y = r.nextInt(array.length);
                            int temp = array[i][j];
                            array[i][j] = array[x][y];
                            array[x][y] = temp;
                        }
                    }
                }
                //重置后x0,y0变化了,要重新找到并设置
                out:
                for (int i = 0; i < array.length; i++) {
                    for (int j = 0; j < array[i].length; j++) {
                        if (array[i][j] == 0) {
                            x0 = i;
                            y0 = j;
                            break out;
                        }
                    }
                }

                System.out.println(x0 + "," + y0);
                repaint();
                up.setEnabled(true);
                down.setEnabled(true);
                right.setEnabled(true);
                light.setEnabled(true);
            }
        });
    }
    public boolean IsSuccess(){
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if(array[i][j]==win[i][j]){
                    count++;
                }
            }
        }
        if(count == 15){
            return true;
        }else{
            return false;
        }
    }
    //移动成功操作
    public void success () {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = i * array.length + j + 1;
            }
        }
        up.setEnabled(false);
        down.setEnabled(false);
        right.setEnabled(false);
        light.setEnabled(false);
    }
}

