package com.itheima;

import java.util.Scanner;

/*
 * 需求：
 *       定义一个方法，帮我们打印[1-n]之间所有的奇数
 *       在方法中加入判断,如果n不合法,打印错误提示,并结束方法
 * */
/*
 *       定义方法,分析明确
 *           返回值类型:void
 *           参数列表:int n
 * */
public class MethodDemo03 {
    public static void getN(int n) {
        //低耦合与for独立出来
        if (n < 1) {
            System.out.println("你输入的数据错误");
            return;
        }

        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入n的值:");
        int n = sc.nextInt();
        getN(n);
    }
}
