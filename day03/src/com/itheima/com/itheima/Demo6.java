package com.itheima.com.itheima;

public class Demo6 {
    public static void main(String[] args) {
        short s = 1;
        //s = s + 1;//有int参与运算,且s是变量,无法触发常量优化机制,
        s = (short)(s + 1);// 整体结果提升为int,int赋值给short类型的变量,大->小,需强转

        short ss = 1;
        ss += 1;//扩展的赋值运算符,隐含了强转
        //ss += 1即ss = (强转的类型,此处为short)(ss + 1);

    }
}
