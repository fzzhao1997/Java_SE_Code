package com.itheima;

public class Work03 {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0 && i % 3 == 0 && i % 5 == 0){
                count++;
            }
        }
        System.out.println(count);

        count = 0;//count归零
        //while语句
        int i = 1;
        while(i <= 100){
            if (i % 2 == 0 && i % 3 == 0 && i % 5 == 0){
                count++;
            }
            i++;
        }
        System.out.println(count);
    }
}
