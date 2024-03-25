package com.itheima;

/*
 *       案例:方法联系(输出较大值)
 *           定义方法,方法中定义两个变量,判断较大值并打印
 *           调用方法查看结果
 * */
public class Demo02youhua {
    //定义方法(编写者)
    public static void getMax(int a, int b) {//a,b值由调用者决定(参数==原材料)
        // !!!!!int a,int b是形式参数:定义方法时声明的参数,作用是接受实参

        //方法中的两个变量
//        int a = 10;
//        int b = 20;
        //判断较大值
        int max = a >= b ? a : b;//原材料
        //打印较大值
        System.out.println("max:" + max);
    }

    //调用者
    public static void main(String[] args) {
        //调用方法
        getMax(10, 20);//传参,将参数传递给调用时的方法
        //a:10,b:20是实际参数:调用方法时的参数,本质是参与操作的数据
        getMax(5, 8);
        int max = max(89,90);//int max = 是为了接收,这样调用者才拿到真正数值
        //3.调用带返回值的方法,一定要接受(调用者真正拿到数值)
        System.out.println(max);
    }
    /*
     *       案例:方法联系(输出较大值)
     *           定义方法,方法中定义两个变量,判断较大值并返回
     *           调用方法,接受返回值
     * */
    //再次优化
    public static int max(int a, int b) {//2.将返回类型由void改为int
        if (a >= b) {//1.通过return返回较大值
            return a;//a大返回a
        }else{
            return b;//b大返回b
        }
    }
}
