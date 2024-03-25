package com.itheima;

import java.util.Random;

public class ArrayDemo04 {
    public static void main(String[] args) {
        //定义数组
        int[] arr = {12,45,98,73,60};

//        Random r = new Random();
//        int index = r.nextInt(arr.length);
//
//        //第一次交换
//        int temp = arr[0];
//        arr[0] = arr[index];
//        arr[index] = temp;
//        //第二次交换
//        index = r.nextInt(arr.length);
//        temp = arr[1];
//        arr[1] = arr[index];
//        arr[index] = temp;

        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            int index = r.nextInt(arr.length);
            int temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp;
        }

        //遍历数组
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
