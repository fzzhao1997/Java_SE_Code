package com.itheima;

import java.util.Date;

/*
        Data类表示某特定的时刻,单位为毫秒,从时间原点(1970年1月1日00:00:00)经历的毫秒值
*       构造方法:
*           Data():分配Data对象并对其进行初始化,使其表示分配时间,测量Data到毫秒
*           Data(long data):分配Data对象并初始化以表示自标准时间以来的指定毫秒数,即1970年1月1日00:00:00
* */
public class DataDemo {
    public static void main(String[] args) {
        //Data():分配Data对象并对其进行初始化,使其表示分配时间,测量Data到毫秒
        //空参构造Data对象,封装了当前系统时间
        Date d1 = new Date();
        System.out.println(d1);

        //Data(long data):分配Data对象并初始化以表示自标准时间以来的指定毫秒数,即1970年1月1日00:00:00
        //带参构造Data对象,从时间原点开始,经过了指定时间的时刻
        Date d2 = new Date(1000*60*60);
        System.out.println(d2);

        //需求:从时间原点开始,,经历两天时间的时刻
        Date d3 = new Date(1000*60*60*24*2);//毫米//秒//分//小时//天
        System.out.println(d3);
    }
}
