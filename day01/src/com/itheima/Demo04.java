package com.itheima;

public class Demo04 {
    public static void main(String[] args) {
        int age = 10;
//        int age =20;
//        int money;
//        money = 20;
        long money = 10000000000000000L;
        //3定义long类型,要在数据后加L(大小写都行,一般大写)
//        long l1 = 10000;//将int类型的10000常量,赋值给long类型的变量l1
//        long l2 = 2200000000;//22亿超出了默认int类型的范围,需要将它声明为更大的类型
        long l2 = 2200000000L;//22亿超出了默认int类型的范围,需要将它声明为更大的类型

        //4定义float类型,要在数据后夹F(大小写都行,一般大写)
        double d = 3.14;//将double类型的3.14赋值给了double类型的变量d
//        float f = 3.14;//将double类型的数据,赋值给了float类型的变量,float装不下!报错

        //5.可以在一行定义多个变量,数据类型必须一致(不推荐,但最好能识别)
        int a1 = 10, a2 = 20, a3 = 30;
        double d1 =3.0, d2 = 4.1, d3 = 5.2;

        int aa = 10;
        int bb = 20;
        int cc = 30;
        float f = (float)3.14;//强制类型转换,不允许
        System.out.println(100);//默认是int类型
        System.out.println(money);
        float price = 12.34F;
        System.out.println(price);
    }
}
