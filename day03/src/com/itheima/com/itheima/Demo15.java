package com.itheima.com.itheima;

import java.util.Scanner;

public class Demo15 {
    public static void main(String[] args) {
        System.out.println("请输入数字:");
        int num = new Scanner(System.in).nextInt();

        //判断条件,如果能被2整除,代表是偶数,反之是奇数
        if (num % 2 == 0) {
            System.out.println(num + "是偶数");
        } else {
            System.out.println(num + "是奇数");
        }
    }
}
