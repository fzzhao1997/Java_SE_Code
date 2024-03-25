package com.itheima;

import com.itheima.Car;

public class CarTest {
    public static void main(String[] args) {
        //创建对象
        Car c1 = new Car();
        System.out.println(c1);//展示对象地址com.itheima.Car@4eec7777
                                //com.itheima.Car:全类名 =包名:com->itheima+类名:Car
                                //@仅仅是分隔符
                                //4eec7777:十六进制的内存地址
                                //十六进制:0-9和a-f
        System.out.println(c1.getBrand());//null
        System.out.println(c1.getColor());//null
        System.out.println(c1. getPrice());//0.0

        //赋值
        c1.setBrand( "奔驰");
        c1.setPrice(400000);
        c1.setColor("黑色");
        System.out.println(c1.getBrand());
        System.out.println(c1.getPrice());
        System.out.println(c1.getColor());

        //调用对象方法
        c1.Drive();
    }
}
