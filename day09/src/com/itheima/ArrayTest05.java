package com.itheima;

import java.util.Random;

/*
*       需求:已知二维数组 arr = {{1,2,3},{4,5,6},{7,8,9}}
* */
public class ArrayTest05 {
    public static void main(String[] args) {
        //定义二维数组
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};

        //创建随机数对象
        Random r = new Random();

        //进行元素打乱
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                int temp = arr[i][j];
                int x = r.nextInt(arr.length);//先随机二维下的第几组数组进行交换(x:二维数组中的哪一个一维数组)
                int y = r.nextInt(arr[x].length);//再随机相应数组下的随机元素进行交换,(y:一维数组的哪一个元素)
                // ((x,y)都会重新选定相应的随机组进行交换,选定随机组后对应元素再次随机)
                // 是交换,即使出现同样的(x,y),不会出现二维数组元素的重复,
                // ((x,y)=(1,1))如a[0,1]=1<->a[x,y]=2,此时a[0,1]=2,a[x,y]=1,后面a[0,2]=3<->a[x,y]=1,a[0,2]=1,a[x,y]=3
                //a[0,1]=2,a[0,2]=1,a[x,y]=3,不会重复
                arr[i][j] = arr[x][y];
                arr[x][y] = temp;
            }
        }

        //遍历二维数组
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
