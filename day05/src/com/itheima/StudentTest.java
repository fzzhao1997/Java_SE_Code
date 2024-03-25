package com.itheima;

import java.util.Random;
import java.util.Scanner;
/*
*
* 对象是由类创建的实体*/
/*
* 测试类(不是描述student类的内容,单独创建一个测试类)!!!mian方法不能出现在设计图里!!!
* */
public class StudentTest {
    public static void main(String[] args) {
        //创建随机数对象
        Random r = new Random();//此为别人创建对象
        //创建键盘对象
        Scanner sc = new Scanner(System.in);//此为别人创建对象
       //创建学生对象
        //创建对象格式:类名 对象名 = new 类名;
        Student s = new Student();//此为自定义对象
//        //打印对象属性(成员变量有默认值)
//        System.out.println(s.age);//0默认值
//        System.out.println(s.name);//null默认值

        //给对象赋值
        s.name = "吴彦祖";
        s.age = 18;

        //打印对象属性
        System.out.println(s.name);
        System.out.println(s.age);
        //调用对象方法
        s.eat();
        System.out.println("---------");
        //创建第二个对象
        Student s2 = new Student();//此为自定义对象
        s2.name = "陈冠希";
        s2.age = 28;
        System.out.println(s2.name);
        System.out.println(s2.age);
        s2.eat();

//        //局部变量不赋值无法打印
//        int age;
//        System.out.println(age);

    }
}
