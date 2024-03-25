package com.itheima.com.itheima;

public class Demo22 {
    public static void main(String[] args) {
        //定义int类型的变量
        int a = 10;
        int b = 20;

        //需求:获取两个数的较大值
//        int max;
//        if (a > b) {
//            max = a;
//        } else {
//            max = b;
//        }
//        System.out.println("较大的值是:"+max);

        if(a>b){
            System.out.println("较大的值是:"+a);
        }else{
            System.out.println("较大的值是:"+b);
        }

        int max = a > b ? a : b;
        System.out.println("较大的值是:"+max);
    }
}
