package com.itheima;
/*
*   String类表示字符串,java程序中的所有字符串文字(例如"abc")都表示此例的实例
*   构造方法:
*       String():初始化新创建的String对象,使其表示字符序列
*       String(String original):初始化新创建的String对象,使其表示与参数相同的字符序列
* */
public class StringDemo01 {
    public static void main(String[] args) {
        String s1 = new String();
        System.out.println(s1);
        //int length() 返回此字符串的长度,即字符的个数
        System.out.println(s1.length());//长度为0,空的字符串,没打连空格都没有!!!!!!
        System.out.println("----------");

        //String(String original):初始化新创建的String对象,使其表示与参数相同的字符序列
        String s2 = new String("itheima");
        System.out.println(s2);
        System.out.println(s2.length());
        System.out.println("----------");

        //java程序中的所有字符串文字(例如"abc")都表示此例的实例
        String s3 = "itheima";
        System.out.println(s3);
        System.out.println(s3.length());
        System.out.println("----------");

        String s4 = " ";
        System.out.println(s4);
        System.out.println(s4.length());
    }
}
