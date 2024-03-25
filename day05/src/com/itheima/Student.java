package com.itheima;
/*
!!!!类:设计图/模板!!!!
* 类:对一类具有共同属性"属性"和"行为"事物的描述
*       1.属性->成员变量
*       2.行为->成员方法
*   对象:根据类创建出来的实体
*
*   成员位置:类中方法外
* */
public class Student {
    //1.属性->成员变量(即成员位置)
    String name;
    int age;

    //2.行为->成员方法->带static关键字!
    public void eat(){
        System.out.println("学生开始吃饭");
    }
}
