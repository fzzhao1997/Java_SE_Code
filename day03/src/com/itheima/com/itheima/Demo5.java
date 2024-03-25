package com.itheima.com.itheima;

public class Demo5 {
    public static void main(String[] args) {
        int a =10;
        System.out.println("a:"+a);

        //+=
        a += 20;
        System.out.println("a:"+a);
        //注意扩展的赋值运算符计算隐含了强制类型转换
        short s = 1;
        //s += 2;与下面等价
        s = (short) (s+2);
        System.out.println("s:"+s);
        //常量优化机制:在编译时,如果!!!!!!常量!!!!!!在左边类型的范围内,编译通过,反之,编译失败(报错)
        byte b = 1;//int->byte 大->小 属性强转
    }
}
