package com.itheima;
/*
* 测试类
* */
public class StudentTest {
    public static void main(String[] args) {
        //创建对象
        Student s = new Student();

        //打印对象名
        System.out.println(s);

        //取值
        System.out.println(s.getAge());
        System.out.println(s.getName());

        //赋值
        s.setName("张三");
        s.setAge(18);

        //取值
        System.out.println(s.getAge());
        System.out.println(s.getName());

        //调用方法
        s.show();
    }
}
