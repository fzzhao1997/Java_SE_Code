package com.itheima;

/*
 *       定义二维数组
 *           数组类型[][] 数组名;//常用
 *           数组类型 数组名[][];//识别
 *           数组类型[] 数组名[];//识别
 *
 *       静态初始化->指定元素->二维数组中存的都是一维数组
 *           int[][] arr = new int[][] {{1,2,3},{4,5,6}};
 *           int[][] arr = {{1,2,3},{4,5,6}};
 *
 *       动态初始化->指定长度
 *           int[][] arr = new int[m][n]
 *               m:二维数组长度:一维数组组数的个数
 *
 *               n:每个一维数组长度:一维数组元素的个数
 * */
public class ArrayDemo07 {
    public static void main(String[] args) {
        //静态初始化
        int[][] array = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}
        };
        //动态初始化
        int[][] arr = new int[2][3];
        //二维数组的元素访问
        System.out.println(arr[0]);//打印的是地址
        System.out.println(arr[1]);//打印的是地址
        //一维数组的元素访问
        System.out.println(arr[0][0]);//0
        System.out.println(arr[0][1]);//0
        System.out.println(arr[0][2]);//0
        System.out.println(arr[1][0]);//0
        System.out.println(arr[1][1]);//0
        System.out.println(arr[1][2]);//0
    }
}
