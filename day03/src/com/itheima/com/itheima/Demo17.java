package com.itheima.com.itheima;

import java.util.Scanner;

/*
 * 需求:根据定义的变量age,判断这个人在哪一个范围
 * [0-17] 未成年人
 * [18-65] 青年人
 * [66-79] 中年人
 * [80-99] 老年人
 * 100+ 长寿老人
 *
 * 键盘对象 Scanner
 *      1.导包 import java.util.Scanner;//idea自动导包的,不需要写
 *      2.创建对象 Scanner sc = new Scanner(Sydtem.in)
 *      3.调用方法,接受数据 int 对象名 = sc.nextInt();
 * */
public class Demo17 {
    public static void main(String[] args) {
        //创建对象
        Scanner sc = new Scanner(System.in);//创建键盘录入对象

        //加入循环
//        for (int i=0;i<=3;i+=1){
while(true){
        //控制提示
        System.out.println("请输入一个年龄");//打印提示词

        //调用方法,接受数据
        int age = sc.nextInt();//调用方法,把键盘输入的值赋值给age变量

//        System.out.println("请输入您的年龄");
//        int age = new Scanner(System.in).nextInt();

        if (age <= 17 && age >= 0) {
            System.out.println("您是未成年人");
        } else if (age <= 65 && age >= 18) {
            System.out.println("您是青年人");
        } else if (age <= 79 && age >= 66) {
            System.out.println("您是中年人");
        } else if (age <= 99 && age >= 80) {
            System.out.println("您是老年人");
        } else if (age >= 100) {
            System.out.println("您是长寿老人");
        } else {
            System.out.println("您输入的年龄不正确");
        }
    }
    }
}
