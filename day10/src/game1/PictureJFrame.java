package game1;

import javax.swing.*;

public class PictureJFrame extends JFrame {
    public int[][] PictureJFrame() {//Java程序编译器是根据代码结构来进行编译处理的，执行的时候也是根据代码结构来处理的。
        //如果在构造方法上使用void，那么此结构就会与普通方法的结构相同，这样编译器会认为此方法是一个
        //普通方法，而普通方法与构造方法最大的区别在于构造方法是在类对象实例化的时候调用的，而
        //普通方法是在类对象实例化产生之后调用的。
        //用于窗体的基本设置
        initJFrame();
        //调用组件
        paintView();
        //设置窗体可见
        this.setVisible(true);
        int [][] array = arr(4,4);
        return array;
    }

    ;//Java会在堆上分配足够的空间来创建一个MyClass的新实例，并且会自动调用构造
    // 函数（如果没有显式地提供任何构造函数，那么Java会提供一个默认的无参构造函数）

    //窗体上的组件绘制
    public int[][] paintView() {
        //标题图片
        JLabel titleLabel = new JLabel(new ImageIcon("day10\\images\\title.png"));//相对路径,省略项目名称,从模块开始
        titleLabel.setBounds(354, 27, 232, 57);
        this.add(titleLabel);
        JPanel imageJPanel = new JPanel();
        imageJPanel.setBounds(150, 114, 360, 360);
        imageJPanel.setLayout(null);//取消默认布局

        int [][] array = arr(4,4);
        return array;


    }

    //定义二维数组,用来储存图片的编号
    public static int[][] arr(int x, int y) {//循环需在方法里
        int[][] array = new int[x][y];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = i * array.length + j + 1;
            }
        }
        return array;
    }


    //用于窗体的基本设置
    public void initJFrame() {//一般需要处理数据才需要返回值,例如整数,浮点数,字符串,布尔类型,数据等数据
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
