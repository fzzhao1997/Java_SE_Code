package com.itheima;
//String(引用类型)->默认值null
//int->默认值0
//double->默认值0.0
public class ComputerTest {
    public static void main(String[] args) {
        //创建对象,,创建了对象,才能通过对象访问类中的成员变量和成员方法
        Computer c = new Computer();
        //给c.brand赋值,赋值仅能调用c.brand,而brand不能调用,
        //类中仅定义,未赋值,调用的话,只显示默认值
        c.brand = "华为";
        c.type = "MateBook D 14 SE版";
        c.size = 14;
        c.cpu = "11代酷睿i5";
        c.memory = 8;
        c.color = "银色";
        c.price = 3599.0;
        c.weight = 2.15;//kg
        //打印属性
        c.show();
        System.out.println(c.brand);
        System.out.println(c);
        //测试方法
        c.playGame();
        c.qiaoDaiMa();
    }
}
