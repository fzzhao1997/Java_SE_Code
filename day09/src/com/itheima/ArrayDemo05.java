package com.itheima;

/*
 *   动态初始化:初始化时指定数组长度,由系统为数组分配初始值
 *   格式:数据类型[] 变量名 = new 数据类型[数组长度]
 *   范例:int[] arr = new int[3]
 * */
public class ArrayDemo05 {
    public static void main(String[] args) {
        //格式:数据类型[] 变量名 = new 数据类型[数组长度]
        int[] arr = new int[3];

        //输出数组名
        System.out.println(arr);

        //输出数组中的元素
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        //修改数组中的元素
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;

        //再次输出数组中的元素
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
/*
*       静态初始化:开始就存入元素值,适合一开始就能确定元素值的业务场景
*       动态初始化:指定数组长度,后期赋值,适合开始知道数据的数量,但是不确定具体元素值的业务场景
*       注意:两种初始化是独立的,不可以混用
**/