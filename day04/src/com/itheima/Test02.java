package com.itheima;
/*
* while循环*/
public class Test02 {
    public static void main(String[] args) {
        //需求:计数[1-20]偶数的和

        //定义求和变量
        int sum = 0;

        //定义循环初始值
        int i = 1;

        //循环判断条件
        while(i <= 20){

            //循环体语句
            //判断是否能被2整除
            if(i %2 ==0){

                //满足,将其累加
                sum += i;
            }
            //循环控制语句
            i ++;
        }

        //打印最终求和变量值
        System.out.println(sum);
    }
}
