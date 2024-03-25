package com.itheima;
/*
* 案例:while循环案例1(求奇数和)
*     求1到100之间的奇数和*/
public class Demo08 {
    public static void main(String[] args) {
        //定义求和变量
        int sum = 0;

        //定义while语句循环初始值
        int i = 1;

        //选取循环范围:从1到100
        while(i <= 100){

            //判断是否为奇数
            if(i %2 != 0){

                //i是奇数,sum将i累加起来
                sum += i;
            }

            //无论是否满足循环体语句,每次循环,都执行i++,即循环控制语句
            i ++;
        }

        //打印求和变量
        System.out.println(sum);
    }
}
