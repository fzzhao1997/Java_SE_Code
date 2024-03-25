package com.itheima;
/*
*       String
*               构造方法
*               new String();
*               new String("abc");
*               "直接赋值"
*
*           成员方法
*               length();//返回字符串的长度
*               equals(字符串);//比较字符串内容
*               equalsIgnoreCase(字符串);//比较字符串内容,忽略大小写
*               trim();//去除首尾空格
*               valueOf(整数);//将int类型的整数转为String
*
*       Integer
*           构造方法
*               new Integer(整数);//过时
*               new Integer("整数");//整数
*       Integer.valueOf(整数);//推荐的静态方法
*       Integer.valueOf("整数");//推荐的静态方法
*           成员方法
*               parseInt("整数");//将String类型的整数内容解析为int
*
*       Date
*           构造方法
*               Date d = new Date();//封装系统时间,常用
*               Date d = new Date(毫秒值);//设置时间节点
*
*       SimpleDateFormat
*           构造方法
*               new SimpleDateFormat();//如果是空参,就使用默认格式
*               new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");//带参,指定格式1
*               new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//带参,指定格式2
*           成员方法
*               format(日期对象);//格式化,一般我们格式化当前系统时间,也就是new Date(),即采用设置的格式表示日期
*               parse("包含日期的字符串");//解析为Date对象,即已设定格式的日期解析还原
*
*       继承
*           面向对象的三大特征之一
*               封装(入门)
*               继承(入门)
*                   java中允许一个类继承另一个类,子类就可以使用父类公共的东西(变量/方法)
*                   java中只允许单继承,不允许多继承(一个儿子只能有一个爹,不能有多个)
*                   但是允许多层继承(一个儿子可以有一个爹,这个爹也可以有一个爹,形成继承体系)
*               多态
* */
public class Review {
}