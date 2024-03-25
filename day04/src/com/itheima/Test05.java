package com.itheima;

import java.util.Random;
import java.util.Scanner;

/*
 * 猜数字小游戏:
 *       使用Random随机数对象,生成一个[1,100]之间的整数,作为正确答案
 *       使用Scanner,提示用户录入猜的数据并接受,使用if语句判断用户猜的结果,打印对应提示
 *       情况1:猜的数超过了[1,100]的范围!请重新输入!
 *       情况2:猜大了
 *       情况3:猜小了
 *       情况4:恭喜你!猜对了
 * */
public class Test05 {
    public static void main(String[] args) {
        //创建随机数对象
        Random r = new Random();
        //生成随机数:[1,100]
        int num = r.nextInt(100) + 1;
        //创建键盘录入对象
        Scanner sc = new Scanner(System.in);
        //死循环,反复猜
        while (true) {
            //键盘录入对象的控制提示
            System.out.println("请输入数字:");
            //接受键盘随录入数据
            int guessNum = sc.nextInt();
            //如果猜的数大了
            if (guessNum > num && guessNum <= 100) {
                System.out.println("猜大了");
                //如果猜的数小了
            } else if (guessNum < num && guessNum >= 1) {
                System.out.println("猜小了");
                //猜对了
            } else if (guessNum == num){
                System.out.println("恭喜你!猜对了");
                break;//结束while死循环,跳出
                //输入的值范围不对
            }else{
                System.out.println("猜的数超过了[1,100]的范围!请重新输入!");
            }
        }
    }
}
