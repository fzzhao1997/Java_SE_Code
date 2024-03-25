package com.itheima;

public class ArrayTest {
    public static void main(String[] args) {
        //定义数组
        int[] arr ={12,45,98,73,60};
        //定义变量max存储最大值,取第一个数据为变量的初始值
        int max = arr[0];
        int min = arr[0];
        //于数组中剩余数据逐个比对,每次比对将最大值保存到变量max中
        for (int i = 1; i < arr.length; i++) {//优化循环,不用和自己比较
            if (arr[i] > max){
                max = arr[i];
            }
        }
        for (int i = 1; i < arr.length; i++) {//优化循环,不用和自己比较
            if (arr[i] < min){
                min = arr[i];
            }
        }
        //循环结束后输出变量max的值
        System.out.println(max);
        System.out.println(min);
    }
}
