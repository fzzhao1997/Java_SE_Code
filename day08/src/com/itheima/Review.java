package com.itheima;
/*
*       String类,在java中所有双引号引起来的内容,都可以看做是它的对象
* */
public class Review {
    public static void main(String[] args) {
        //空参构造:构造一个空的字符串对象
        String s1 = new String();//开辟空的字符串堆内存,s1栈内存地址指向该堆内存
        System.out.println(s1);//空的//打印字符串对象,不会展示地址而是展示字符串的内容
        //带参构造:根据"abc"的内容,构造一个新的字符串s2

        String s2 = new String("abc");//创建了两个对象,s2栈内存对象,指向对应堆内存地址001;
        // "abc"堆内存通过abc内容开辟的对象,地址001,指向字符串常量池abc
        System.out.println(s2);
        //双引号直接赋值
        String s3 = "abc";//字符串常量池已有abc,不再创建,共用一个对象
        System.out.println(s3);
        /*
        * 面试题*/
        System.out.println(s2 == s3);//比较地址false,s2是栈内存,单地址指向对应堆内存地址;s3字符串常量池abc的地址
        System.out.println(s2.equals(s3));//比较内容false

        //1.长度
        System.out.println("黑马程序员".length());//5
        //2.比较内容
        System.out.println("ABC".equals("abc"));//false
        //3.比较内容,忽略大小写
        System.out.println("ABC".equalsIgnoreCase("abc"));//true
        //4.去除字符串首尾空格
        System.out.println("  ad min ".trim());//ad min//中间空格不能去除
    }
}
