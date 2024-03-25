package com.itheima;

import java.util.Random;
import java.util.Scanner;

/*
*
* 对象是由类创建的实体*/
/*
* 测试类(不是描述student类的内容,单独创建一个测试类)!!!mian方法不能出现在设计图里!!!
* */
public class StudentPrivateTest {
    public static void main(String[] args) {
        //1.创建对象
        //创建随机数对象
        Random r = new Random();//此为别人创建对象
        //创建键盘对象
        Scanner sc = new Scanner(System.in);//此为别人创建对象
       //创建学生对象
        //创建对象格式:类名 对象名 = new 类名;
        StudentPrivate s = new StudentPrivate();//此为自定义对象
//        //打印对象属性(成员变量有默认值)
//        System.out.println(s.age);//0默认值
//        System.out.println(s.name);//null默认值

        //2.给对象赋值
        s.setName("吴彦祖");
        s.setAge(18);

        //3.打印对象属性
        System.out.println(s.getName());
        System.out.println(s.getAge());
        //4.调用对象方法
        s.eat();

        //创建学生对象
        StudentPrivate stu = new StudentPrivate("罗翔",48);//使用代参
        System.out.println(stu.getName() + "," + stu.getAge());
    }
}
