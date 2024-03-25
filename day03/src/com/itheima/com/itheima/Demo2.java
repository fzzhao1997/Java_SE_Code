package com.itheima.com.itheima;
/*
* 类型转换分为:
*            1.隐式转换:小-> 计算机自动完成的
*            2.强制转换:大-> 手动书写格式,不推荐
*
* byte -> short(char)参与运算 会自动提升为int
*     int -> long -> float -> double
* */
public class Demo2 {
    public static void main(String[] args) {
        int a = 10;
        double b = 13.14;
        System.out.println(a+b);//23/14 a先提升为double类型,再进行运算

        int ii = (int)(a + b);// 如果使用double想转为int,小数后面就丢失了,转化的是a+b的结果
        System.out.println(ii);

        double num = 100;//100默认是int类型,赋值给double,从小到大,属于隐式转换

//        int c = a + b;
//        double c = a + b;

        short s = 10;
        int i = 20;
        int j = s + i;
//        short ss = s + i;
        short ss = (short)(s+i);
    }
}
