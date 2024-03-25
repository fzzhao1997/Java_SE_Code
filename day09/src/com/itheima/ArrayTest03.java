package com.itheima;
/*
*       二维数组内存代码*/
public class ArrayTest03 {
    public static void main(String[] args) {
       //定义二维数组
        int[][] arr = {{1,2,3},{4,5,6}};

        //输出数组中的元素
        System.out.println(arr[0][1]);
        System.out.println(arr[1][1]);

        //修改数组中的元素
        arr[0][1] = 10;
        arr[1][1] = 20;

        //再次输出数组中的元素
        System.out.println(arr[0][1]);
        System.out.println(arr[1][1]);
    }
}
