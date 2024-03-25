package com.itheima.com.itheima;

public class Demo19 {
    public static void main(String[] args) {
        //定义变量
        int i = 10;
        int j = 20;
        int k = 30;

        //逻辑与:&&
        System.out.println((i > j) && (i > k));
        System.out.println((i < j) && (i > k));
        System.out.println((i > j) && (i < k));
        System.out.println((i < j) && (i < k));
        System.out.println("----------------");

        System.out.println((i > j) || (i > k));
        System.out.println((i < j) || (i > k));
        System.out.println((i > j) || (i < k));
        System.out.println((i < j) || (i < k));
        System.out.println("----------------");

        System.out.println(!(i > j));
        System.out.println(!!(i > j));
        System.out.println(!!!(i > j));
        System.out.println(!!!!(i > j));
        System.out.println("----------------");


    }
}
