package com.itheima;

public class Work04 {
    public static void main(String[] args) {
        //for语句
        for (int i = 1988; i <= 2022; i++) {
            if ((i % 4 == 0 && i % 100 != 0) || i % 400 == 0){
                System.out.println(i);
            }
        }

        //while语句
        int i = 1988;
        while(i <= 2022){
            if ((i % 4 == 0 && i % 100 != 0) || i % 400 == 0){
                System.out.println(i);
            }
            i++;
        }
    }
}
