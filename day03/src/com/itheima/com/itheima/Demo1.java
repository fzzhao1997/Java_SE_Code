package com.itheima.com.itheima;

import java.util.Scanner;

//java中两个整数相除:结果只取商
//java中两个整数取余:结果只取余
public class Demo1 {
    public static void main(String[] args) {
        //定义变量
        System.out.println("请输入:");
        int num = new Scanner(System.in).nextInt();//键盘来输入值
//        num = 789;

        //数值拆分
        int ge = num % 10;
        int shi = num / 10 % 10;
        int bai = num / 100 % 10;

        //做后续操作(打印结果)
        for (int i = 0; i < 3; i++) {
            System.out.println("个位:" + ge);
            System.out.println("十位:" + shi);
            System.out.println("百位:" + bai);
        }
    }
}
