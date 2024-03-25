package com.itheima;
/*
 * Scanner键盘对象
 * 1.导包 import java.util.Scanner;
 * 2.创建对象 Scanner sc = new Scanneer(System.in);   仅一次即可
 * 3.生成输入提示  System.out.println("请输入:");      多次输入需要创建多次
 * 4.接受数据 int num = sc.nextInt();                  多次输入需要创建多次
 *
 * Random随机数对象
 * 1.导包 import java.util.Random;
 * 2.创建对象 Random r = new Random();               仅一次即可
 * 3.生产随机数,接受数据 int num = r.nextInt(10);//[0-10)
 */

//1.导包

import java.util.Random;

public class Test04 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {//for循环10次随机数
            //2.创建对象
            Random r = new Random();
            //3.生产随机数
            int num = r.nextInt(100) + 1;//从1到100[0,99]->[1,100]
            //4.打印
            System.out.println(num);
        }
    }
}
