package game1;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.util.Random;

public class PictureJFrame04 extends JFrame {
    public Random r = new Random();
    public int x0;
    public int y0;
    public JButton up;
    public JButton down;
    public JButton right;
    public JButton light;
    public JButton help;
    public JButton restart;
    public JPanel imageJPanel;
    public int [][] array = new int[4][4];




    public PictureJFrame04() {//Java程序编译器是根据代码结构来进行编译处理的，执行的时候也是根据代码结构来处理的。
        //如果在构造方法上使用void，那么此结构就会与普通方法的结构相同，这样编译器会认为此方法是一个
        //普通方法，而普通方法与构造方法最大的区别在于构造方法是在类对象实例化的时候调用的，而
        //普通方法是在类对象实例化产生之后调用的。
        //用于窗体的基本设置
        initJFrame();
        arr();
        //先打乱,再调用组件
        randomArr();
        //调用组件
        paintView();

//        Logic l = new Logic();//子类创建是其实已经创建一遍父类对象了,只是省略了;在父类构造函数创建子类对象,
//        // 相当于创建子类对象的同时,在子类中创建父类对象,创建父类对象时执行构造函数,执行构造函数时又要创建子类对象,bug循环

        //设置窗体可见
        this.setVisible(true);


    }

    ;//Java会在堆上分配足够的空间来创建一个MyClass的新实例，并且会自动调用构造
    // 函数（如果没有显式地提供任何构造函数，那么Java会提供一个默认的无参构造函数）

    //窗体上的组件绘制
    public void paintView() {
        //标题图片
        JLabel titleLabel = new JLabel(new ImageIcon("day10\\images\\title.png"));//相对路径,省略项目名称,从模块开始
        titleLabel.setBounds(354, 27, 232, 57);
        this.add(titleLabel);
        imageJPanel = new JPanel();
        imageJPanel.setBounds(150, 114, 360, 360);
        imageJPanel.setLayout(null);//取消默认布局


        //图片和数组打乱要分开,不能把打乱放遍历里不然可能出现(3,1)后下一个随机交换又(3,1),图片重复
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                JLabel imageJLabel = new JLabel(new ImageIcon("day10\\images\\" + array[i][j] + ".png"));
                imageJLabel.setBounds(90 * j, 90 * i, 90, 90);
                imageJPanel.add(imageJLabel);
            }
        }
        System.out.println("paintView调用了");
        this.add(imageJPanel);
        //参考图片
        JLabel referJLabel = new JLabel(new ImageIcon("day10\\images\\canzhaotu.png"));
        referJLabel.setBounds(574, 114, 122, 121);
        this.add(referJLabel);
        //按钮美化
        //移动按钮
        up = new JButton(new ImageIcon("day10\\images\\shang.png"));
        up.setBounds(732, 265, 57, 57);
        this.add(up);
        down = new JButton(new ImageIcon("day10\\images\\xia.png"));
        down.setBounds(732, 347, 57, 57);
        this.add(down);
        right = new JButton(new ImageIcon("day10\\images\\you.png"));
        right.setBounds(813, 347, 57, 57);
        this.add(right);
        light = new JButton(new ImageIcon("day10\\images\\zuo.png"));
        light.setBounds(650, 347, 57, 57);
        this.add(light);
        //求助和重置按钮
        help = new JButton(new ImageIcon("day10\\images\\qiuzhu.png"));
        help.setBounds(626, 444, 108, 45);
        this.add(help);
        restart = new JButton(new ImageIcon("day10\\images\\chongzhi.png"));
        restart.setBounds(786, 444, 108, 45);
        this.add(restart);
        //背景图片
        JLabel backGroundJLabel = new JLabel(new ImageIcon("day10\\images\\background.png"));
        backGroundJLabel.setBounds(0, 0, 960, 530);
        this.add(backGroundJLabel);
    }

    //打乱方法
    public void  randomArr() {
        //同一类中非静态直接调用静态或非静态方法都行
        //先抽一个变0
        int a = r.nextInt(array.length);
        int b = r.nextInt(array.length);
        array[a][b] = 0;


        System.out.println(a + ":" + b + ":" + array[a][b]);
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                int x = r.nextInt(array.length);
                int y = r.nextInt(array.length);
                int temp = array[i][j];
                array[i][j] = array[x][y];
                array[x][y] = temp;
            }
        }
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
        System.out.println(x0+","+y0);
    }

    //定义二维数组,用来储存图片的编号
    public  void arr() {//循环需在方法里
        for (int i = 0; i <     array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = i * array.length + j + 1;
            }
        }
    }

    //用于窗体的基本设置
    public void initJFrame() {//一般需要处理数据才需要返回值,例如整数,浮点数,字符串,布尔类型,数据等数据
        //窗体大小
//窗体大小
        this.setSize(960, 565);
        //java中this表示当前类的对象,可以理解成指向对象本身的一个指针。通俗地说就是表示当前类对象”自己
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
