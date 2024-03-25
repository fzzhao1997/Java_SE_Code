package com.itheima;

public class Work02 {
    public static void main(String[] args) {
        int sum = 0;
        int count = 0;
        //for语句
        for (int i = 1; i <= 100; i++) {
            if (i % 2 != 0) {
                sum += i;
                count ++;
            }
        }
        System.out.println(sum);
        System.out.println(count);

        sum = 0;//sum归零
        count = 0;//count归零
        //while语句
        int i = 1;
        while(i <= 100){
            if (i % 2 != 0) {
                sum += i;
                count ++;
            }
            i ++;
        }
        System.out.println(sum);
        System.out.println(count);
    }
}
