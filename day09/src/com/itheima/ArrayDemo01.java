package com.itheima;
//什么是数组?
//用来存储多个相同数据的容器
public class ArrayDemo01 {
    public static void main(String[] args) {
        //定义数值
         int[] arr1;//定义了一个int类型的数组,数组名是arr变量
         int arr2[];//定义了一个int类型的变量,变量名是arr数组
//        System.out.println(arr1);arr1是一个局部变量,需要先赋值才能使用
        //静态初始化:初始化时指定每个数组元素的初始值,由系统决定数组长度
        //需要明确数组内容才能使用静态初始化
        //定义数组,初始化数据
//        int[] arr = new int[]{1,2,3};//完整格式
        int[] arr = {1,2,3};//简化格式,arr是局部变量(定义在方法中的变量),需要先赋值才能使用
        System.out.println(arr);//展示地址值
        //数组是new出来的,所以进堆内存,开辟空间产生地址值,就被数组名记录
    }
}
