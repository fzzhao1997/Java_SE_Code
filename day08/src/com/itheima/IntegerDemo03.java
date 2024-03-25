package com.itheima;

public class IntegerDemo03 {
    public static void main(String[] args) {
        //装箱:把基本数据类型转化为对应的包装类型
        Integer i = Integer.valueOf(100);//100int类型转为Integer数据类型,手动,非自动装箱
        Integer i1 = 100;//100int类型赋值给Integer数据类型,自动装箱
        i1 += 200;
        /*
        * i1 = i1 + 200;
        * (i1 = i1.intValue()+200;intValue Integer类型转为int类型)
        * i1.intValue()实现自动拆箱
        * i1 = 300,300 int类型赋值给了i1 Integer类型 实现自动装箱
        * */
        System.out.println(i1);
    }
}
