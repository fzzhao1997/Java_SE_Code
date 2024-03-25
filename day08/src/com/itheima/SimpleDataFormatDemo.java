package com.itheima;
/*
*   SimpleDateFormat可以对Date对象,进行格式化和解析
*
*   日期模式字符串中(参数的格式),字母的对应关系
*       Y-----年
*       M-----月
*       d-----日
*       H-----时
*       m-----分
*       s-----秒
* */
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDataFormatDemo {
    public static void main(String[] args) throws ParseException {
        //格式化(从Data到String)
        Date d = new Date();//系统时间
        //创建格式化对象
        SimpleDateFormat sdf = new SimpleDateFormat();//SimpleDateFormat空参格式
        //先创建SimpleDateFormat类型的sdf对象才能调用相应的方法
        //该类的方法不是静态的,需要创建对象才能调用
        String s = sdf.format(d);
        //把Date类型的format化转为String类型的s,转化调用的方法是基于sdf对象创建才能调用的
        System.out.println(s);

        //指定模式
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");//指定格式
        String s2 = sdf2.format(d);
        System.out.println(s2);
        System.out.println("-------------");

        //解析(从String到Date)
        String ss = "2021-10-27 11:11:11";
//        SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        Date dd = sdf3.parse(ss);//解析成Date数据
        System.out.println(dd);
    }
}
