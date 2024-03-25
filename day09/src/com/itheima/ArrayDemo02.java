package com.itheima;

public class ArrayDemo02 {
    public static void main(String[] args) {
        //定义一个数组,并进行初始化
        int[] scores = {93,96,99};
        //输出数组名
        System.out.println(scores);//地址名

        //输出数组中的元素
        System.out.println(scores[0]);//索引从0开始
        System.out.println(scores[1]);
        System.out.println(scores[2]);
        System.out.println("-------");

        //修改数组中的元素
        scores[0]=100;
        scores[1]=98;
        scores[2]=95;
        //再次输出数组中的元素
        System.out.println(scores[0]);
        System.out.println(scores[1]);
        System.out.println(scores[2]);

        //定义数组
        int[] arr = {1,2,3,4,5};

        //遍历数组
        for (int i = 0;i < arr.length; i++){
            System.out.println(arr[i]);//i代表每一个索引,arr[i]代表每一个元素
        }
    }
}
