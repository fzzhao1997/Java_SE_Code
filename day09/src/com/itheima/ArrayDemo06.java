package com.itheima;

import java.util.Scanner;

/*
*       案例(数组的动态初始化):
*           创建一个合适的数组,用来存储键盘录入的5个整数
*           遍历数组,打印每一个元素
* */
public class ArrayDemo06 {
    public static void main(String[] args) {
//        //定义数组->动态
//        int[] arr = new int[3];
//
//        //获取元素
//        System.out.println(arr[0]);//0
//        System.out.println(arr[1]);//0
//        System.out.println(arr[2]);//0
//
//        //修改元素
//        arr[0] = 11;
//        arr[1] = 22;
//        arr[2] = 33;
//
//        //获取元素
//        System.out.println(arr[0]);//11
//        System.out.println(arr[1]);//22
//        System.out.println(arr[2]);//33

        //定义数组->动态
        int[] arr = new int[5];

        //创建Scanner对象
        Scanner sc = new Scanner(System.in);
//
//        //录入第一个数据
//        System.out.println("请输入第1个数据:");
////        int i = sc.nextInt();
////        arr[0] = i;
//        arr[0] = sc.nextInt();
//
//        //录入第一个数据
//        System.out.println("请输入第2个数据:");
//        arr[1] = sc.nextInt();
        for (int i = 0; i < arr.length; i++) {
            System.out.println("请输入第"+(i+1)+"个元素:");
            arr[i] = sc.nextInt();
        }

        printArray(arr);//传递数组
    }
/*      参数:int[] arr
        返回值:void
* */
    public  static void printArray(int[] arr){
        System.out.print("[");//一行打印
        for (int i = 0; i < arr.length; i++) {
            if(i == arr.length-1){//加上判断,最后一个元素处理
                System.out.print(arr[i]);
            }
            else {//加上判断,非最后一个元素处理
                System.out.print(arr[i] + ", ");
            }
        }
        System.out.println("]");//换行打印
    }
}
