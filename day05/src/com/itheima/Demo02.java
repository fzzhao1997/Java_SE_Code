package com.itheima;

/*
 *       案例:方法联系(输出较大值)
 *           定义方法,方法中定义两个变量,判断较大值并打印
 *           调用方法查看结果
 * */
public class Demo02 {
    //定义方法
    public static void getMax() {
        //方法中的两个变量
        int a = 10;
        int b = 20;
        //判断较大值
        int max = a >= b ? a : b;
        //打印较大值
        System.out.println("max:"+max);
    }

    public static void main(String[] args) {
        //调用方法
        getMax();
    }
}
