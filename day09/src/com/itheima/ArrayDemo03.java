package com.itheima;

public class ArrayDemo03 {
    public static void main(String[] args) {
        int[] arr = {11,22,33,44,55};
        System.out.println("交换前:arr[0]="+arr[0]+",arr[4]="+arr[4]);
        int temp = arr[0];
        arr[0] = arr[4];
        arr[4] = temp;
        System.out.println("交换后:arr[0]="+arr[0]+",arr[4]="+arr[4]);
    }
}
