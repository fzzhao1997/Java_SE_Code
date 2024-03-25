package com.itheima.com.itheima;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int num = sc.nextInt();
        //创建键盘对象
        Scanner sc = new Scanner(System.in);

        //控制提示
        System.out.println("请输入第一个整数:");
        int a = sc.nextInt();
        System.out.println("请输入第二个整数:");
        int b = sc.nextInt();

        System.out.println(a+"+"+b+"="+(a+b));

    }
}
