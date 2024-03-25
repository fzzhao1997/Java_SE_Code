package com.itheima;

/*
案例:
    使用变量定义个人信息,并打印在控制台
        姓名
        年龄
        性别
        身高
        婚否
        */
public class Demo03 {
    public static void main(String[] args) {
        //定义变量
        String name = "张飞";
        int age = 18;
        char gender = '男';
        double height = 178.5;
        boolean isMarry = true;

        //打印变量
        System.out.println("姓名:" + name);
        System.out.println("年龄:" + age);
        System.out.println("性别:" + gender);
        System.out.println("身高:" + height);
        System.out.println("婚否:" + isMarry);
    }
}
