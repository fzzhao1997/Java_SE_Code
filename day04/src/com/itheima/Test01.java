package com.itheima;

/*
 * 统计思想
 *       需要一个变量,在某些特点时刻,让变量进行自增*/
public class Test01 {
    public static void main(String[] args) {
        //需求: 统计[1-30]之间,可以被5整除的数字
        // 需求: 统计[1-30]之间,可以被5整除的数字和
        //定义计数器
        int count = 0;

        //定义求和变量
        int sum = 0;

        //选取循环范围:从1到30
        for (int i = 1; i <= 30; i++) {

            //判断循环条件:是否能被5整除
            if (i % 5 == 0) {

                //满足条件计数
                count ++;

                //满足条件累加
                sum += i;

                //满足条件打印
                System.out.println(i);
            }
        }
        //打印sum的最终计数值
        System.out.println(count);
        System.out.println(sum);
    }
}
