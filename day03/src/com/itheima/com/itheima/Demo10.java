package com.itheima.com.itheima;
//if语句的小括号后面,不要写分号!!!
//如果if语句管理的语句体只有一条,那么可以省略大括号不写,不建议!!!(如System.out.println("可以上网")一句,但int a = 10 是两句)

public class Demo10 {
    public static void main(String[] args) {
        System.out.println("程序开始");
        //定义一个变量,记录年龄
        int age = 17;//(定义变量,给变量赋值,这是两句语句)
        age = 16;

        //判断是否能进网吧
        if (age >= 18) {
            //如果成立走这里
            System.out.println("可以上网");
        } else {
            //如果不成立走这里
            System.out.println("不能上网");
        }
        System.out.println("程序结束");

    }
}
