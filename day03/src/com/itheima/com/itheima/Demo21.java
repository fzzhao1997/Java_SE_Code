package com.itheima.com.itheima;

import java.util.Scanner;

public class Demo21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入值:");

        int a = sc.nextInt();

        System.out.println("请输入值:");

        int b = sc.nextInt();

        System.out.println("请输入值:");

        int c = sc.nextInt();

//        int temp = a > b ? a : b;
//        int max = c > temp ? c : temp;

        //扩展:一行求max
        int max = (a > b ? a : b) > c ? (a > b ? a : b) : c;

        System.out.println("最大的值是" + max);
    }
}
