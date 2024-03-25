package com.itheima;
/*
*       需求:已知一个二维数组arr = {{1,2,3},{4,5,6},{7,8,9}};请把元素在控制台输出*/
public class ArrayTest04 {
    public static void main(String[] args) {
        //定义二维数组,并进行静态初始化
        int[][] arr ={{1,2,3},{4,5,6},{7,8,9}};
        for (int i = 0; i < arr.length; i++) {
            System.out.print("[");
            for (int j = 0; j < arr[i].length; j++) {
                if(j == arr[i].length-1){
                    System.out.print(arr[i][j]);
                }else {
                    System.out.print(arr[i][j] + ", ");
                }
            }
            System.out.println("]");
        }
    }
}
