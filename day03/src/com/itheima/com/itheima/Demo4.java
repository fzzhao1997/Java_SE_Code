package com.itheima.com.itheima;

/*
 * 当+号遇到字符串,就不算数+了,而是字符串连接符
 * 字符串连接符可以让字符串和任意类型进行数据串联(拼接)
 *
 * 后面我们常见于打印结果
 * "sum:" + sum
 * "avg:" + avg
 * "姓名:" + name
 * */


public class Demo4 {
    public static void main(String[] args) {
        System.out.println("it" + "heima");//"itheima"
        System.out.println("itheima" + 666);//"itheima666"
        System.out.println(1 + 99 + "年黑马");//"100年黑马"
        System.out.println("5+5=" + 5 + 5);//"5+5=55"
        System.out.println("5+5=" + (5 + 5));//"5+5=10"
    }
}
