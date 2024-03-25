package com.itheima;
/*
*       构造方法
*               Integer(int value):根据int值创建Integer对象(过时)
*               Integer(String s):根据String值创建Integer对象(过时)
*
*       成员方法
*               static Integer value0f(int i):返回表示指定的int值的Integer实例
*               static Integer value0f(String s):返回一个保存指定值的Integer对象String
* */
public class IntegerDemo01 {
    public static void main(String[] args) {
//        Integer i1 = new Integer(100);
//        System.out.println(i1+1);
//        Integer i2 = new Integer("1231234");//包含非数值的字符,报错
//        System.out.println(i2+1);

//        static Integer value0f(int i):返回表示指定的int值的Integer实例
        Integer i1 = Integer.valueOf(100);//i1是对象,可以调用方法(把100的int类型封装成Integer对象),
        // 对象可以调方法
//        static Integer value0f(String s):返回一个保存指定值的Integer对象String
        Integer i2 = Integer.valueOf("123123132");//i2是对象,可以调用方法(把123123132的String类型封装成Integer对象),
        // 对象可以调方法
//        Integer i3 = Integer.valueOf("100a");//要传递纯数值,不能完成转换,报错
        System.out.println(i1+1);
        System.out.println(i2+1);
    }
}
/*
*       基本类型包装类?
*           将基本类型!!!封装成对象!!!,好处是提供了方法!!!操作数据!!!
*           除了int是Integer,char是character
*           其余都是首字母大写
*           byte->Byte类
*           short->Short类
*           int->Integer类
*           long->long类
*           float->Float类
*           double->Double类
*           char->character类
*           boolean->Boolean
*           Integer是int类型的包装类,可以创建对象,调用方法
*
*           Integer主要用来做
*           String->int(当前猜数字游戏所用功能)
*           int->String
* */