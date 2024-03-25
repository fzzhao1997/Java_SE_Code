package com.itheima;

/*
 *   int length(): 返回此字符串的长度
 *   boolean equals(Object anObject): 将此字符串与指定对象进行比较
 *   boolean equalsIgnoreCase(String anotherString): 将此 String与另一个 String比较，忽略大小写
 *   String trim(): 返回一个字符串，其值为此字符串，并删除任何前导和尾随空格
 * */
public class StringDemo02 {
    public static void main(String[] args) {
        String s1 = "itheima";
        String s2 = "itheima";
        String s3 = "Itheima";

        //1.boolean equals(Object anObject): 将此字符串与指定对象进行比较
        System.out.println("s1与s2是否相等?(内容比较)"+s1.equals(s2));//s1与s2内容是否相同,区别大小写,相当于比较s1与s2的内容
        System.out.println("s1与s3是否相等?(内容比较)"+s1.equals(s3));//s1与s3内容是否相同,区分大小写,相当于比较s1与s3的内容
        System.out.println("---------------");
        //由于""创建的字符串对象,在常量池存储,所以内容的一样的字符串对象,本质上是同一个对象
        System.out.println("s1与s2是否相等?(地址比较)"+(s1 == s2));//true,相当于比较s1与s2的地址
        System.out.println("s1与s3是否相等?(地址比较)"+(s1 == s3));//false,相当于比较s1与s3的地址
        //ithima进入字符串常量池之前,会先判断,看常量池有没有和自己一样的字符串
        //没有.存入常量池,创建新对象
        //有,拿来复用,不再创建新对象
        //即s1与s2在常量池为一个对象,指向为同一个地址
        //s1与s3在常量池中为两个对象,指向为两个地址
        System.out.println("---------------");
        String str1 = new String("itheima");
        String str2 = new String("itheima");
        String str3 = new String("Itheima");
        System.out.println("str1与str2是否相等(地址比较)?"+(str1 == str2));//false,str1与str2地址是否相同,
        // 在堆内存中都是两个新地址,堆内存中一个对象一个地址
        System.out.println("str1与str3是否相等(地址比较)?"+(str1 == str3));//false,str1与str3地址是否相同,
        // 在堆内存中都是两个新地址,堆内存中一个对象一个地址
        System.out.println("---------------");
        System.out.println("str1与str2是否相等(内容比较)?"+str1.equals(str2));//str1与str2内容是否相同,
        // 区别大小写,相当于比较str1与str2的内容
        System.out.println("str1与str2是否相等(内容比较)?"+str1.equals(str3));//str1与str3内容是否相同,
        // 区分大小写,相当于比较str1与str3的内容

        //2.boolean equalsIgnoreCase(String anotherString): 将此 String与另一个 String比较，忽略大小写
        System.out.println("s1与s2是否相等?(内容比较,忽略大小写)"+s1.equalsIgnoreCase(s2));
        //s1与s2内容是否相同,忽略大小写
        System.out.println("s1与s3是否相等?(内容比较,忽略大小写)"+s1.equalsIgnoreCase(s3));
        //s1与s3内容是否相同,忽略大小写
        System.out.println("---------------");

        //3.String trim(): 返回一个字符串，其值为此字符串，并删除任何前导和尾随空格
        String s4 = "  itheima ";
        System.out.println(s4);
        System.out.println(s4.trim());
        System.out.println(s1.equals(s4.trim()));
        System.out.println(s4.trim().length());
        System.out.println("---------------");

        String s5 = "it heima";
        System.out.println(s5.trim());//不能去除中间空格
        boolean s = !false;
        System.out.println(s);
    }
}
