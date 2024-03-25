package com.itheima;

import java.util.Scanner;

/*
 *       需求:定义一个方法,接受三个整数,获取中间值并打印
 *       通过键盘获取三个整数,作为参数传递调用方法
 * */
public class DemoMid {
    //定义方法(三元方式)
    public static void getMid(int a, int b, int c) {
        if (a <= (b >= c ? b : c) && a >= (b <= c ? b : c)) {
            System.out.println("中间值:" + a);
        } else if (b <= (a >= c ? a : c) && b >= (a <= c ? a : c)) {
            System.out.println("中间值:" + b);
        } else if (c <= (a >= b ? a : b) && c >= (a <= b ? a : b)) {
            System.out.println("中间值:" + c);
        }
    }

    //定义方法2(mid=sum-max-min)
    public static void mid(int a, int b, int c) {//形参:定义方法时的参数,作用是接受实参
        int sum = a + b + c;
        int tempMax = a >= b ? a : b;
        int max = tempMax >= c ? tempMax : c;
        int tempMin = a <= b ? a : b;
        int min = tempMin <= c ? tempMin : c;
        int mid = sum - max - min;
        System.out.println("中间值:" + mid);
    }

    //调用方法
    public static void main(String[] args) {
        //创建键盘对象
        Scanner sc = new Scanner(System.in);
        //录入三个整数
        System.out.println("请依次输入a,b,c的值");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        //接受三个整数,并调用方法
        getMid(a, b, c);//也可以定义为a,b,c来传参
        System.out.println("-----------");
        mid(a, b, c);//实参:调用方法时的参数,本质是实际参与运算的数据
    }
}
