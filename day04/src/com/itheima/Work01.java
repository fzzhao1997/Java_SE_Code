package com.itheima;

public class Work01 {
    public static void main(String[] args) {
        //for语句
        int sum = 0;
        for (int i = 1; i <= 10; i ++) {
            if (i % 3 != 0) {
                sum += i;
            }
        }
        System.out.println(sum);

        sum = 0;//sum归零
        //while语句
        int i = 1;
        while (i <= 10) {
            if (i % 3 != 0) {
                sum += i;
            }
            i ++;
        }
        System.out.println(sum);
    }
}
