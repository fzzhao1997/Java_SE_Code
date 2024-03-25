package com.itheima;

/*
* 案例: for循环案列2(求和思想)
*       求整数[1-100]的奇数和
* */
public class Demo03 {
    public static void main(String[] args) {
        //定义求和变量
        int sum = 0;

        //循环过程中,对sum进行累加
        //使用for循环,获取范围内所有的整数
        //重点理解: 在循环中, i可以代表每一个整数
        for(int i = 1; i <= 100; i +=1){
            //判断奇数
            if(i % 2 != 0){
                //如果是奇数,才能累加
                sum += i;
            }
            //不满足不累加,不执行

        }

        //循环结束,打印结果
        System.out.println("sum:"+sum);
    }
}
