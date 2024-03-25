package com.itheima;
/*
* 方法的概述:
*       一段具有独立功能的代码块(一段代码),需要选定义才能调用
*       如果没有调用,方法不会自动执行
* 方法定义格式:
*       public static void 方法名(){
*           方法体
* }
*
*       方法调用格式:
*           方法名();
*
*       方法和方法之间的关系?
*           平级关系,所以不能嵌套定义
*
*       debug查看方法调用:
*           step over:不进入方法下一步
*           step into:进入方法查看源码
* */
public class Demo01 {
    public static void main(String[] args) {//main方法是程序入口
        System.out.println("程序开始");
        //调用方法
        eat();
        //调用方法
        study();
        System.out.println("程序结束");
    }
    //定义方法
    public static void study(){
        System.out.println("学生在敲代码");
    }

    //定义方法
    public static void eat() {
        System.out.println("学生在吃饭...");
    }
}
