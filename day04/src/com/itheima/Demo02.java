package com.itheima;

/*
* 案例: for循环案列2(求和思想)
*       求整数[1-100]的和
* */
public class Demo02 {
    public static void main(String[] args) {
        //定义求和变量
        int sum = 0;

        //循环过程中,对sum进行累加
        //使用for循环,获取范围内所有的整数
        //重点理解: 在循环中, i可以代表每一个整数
        for(int i = 1; i <= 100; i ++){
            //累加
            sum += i;
        }

        //循环结束,打印结果
        System.out.println("sum:"+sum);
    }
}
