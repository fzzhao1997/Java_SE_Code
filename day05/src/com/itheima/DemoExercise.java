package com.itheima;

import java.util.Scanner;

/*
 * 需求1:定义方法,判断一个整数的奇偶性->void
 *
 * 需求2:定义方法,计算三个整数的平均值并返回->double/int
 *
 * 需求3:定义方法,判断有几个水仙花数,并返回->int(无参有返)
 * */
public class DemoExercise {
    //奇偶性
    public static void parity(int num) {
        if (num % 2 == 0) {
            System.out.println("偶数");
        } else {
            System.out.println("奇数");
        }
    }

    //平均值
    public static double averageThree(int a, int b, int c) {
        int average = (a + b + c) / 3;//算出来int
        return average;//返回double,隐式转换,且与前面static接口的double一致
    }

    //水仙花数
    public static int daffodil() {
        int count = 0;
        for (int i = 100; i < 1000; i++) {
            int ge = i % 10;
            int shi = i / 10 % 10;
            int bai = i / 100 % 10;
            if ((ge * ge * ge + shi * shi * shi + bai * bai * bai) == i) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        //接受奇偶性
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入数字:");
        int num = sc.nextInt();
        parity(num);//直接调用,用来调用void的方法

        //接受平均数
        System.out.println("依次输入三个数:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        double average = averageThree(a, b, c);//原来方法创建出了方法就没了,需要在重新创建(赋值调用:将返回值赋值给对应类型的变量,然后做后续操作)
        System.out.println("平均数是:" + average);

        //接受水仙花个数
//        int count = daffodil();
//        System.out.println("水仙花个数:" + count);
        System.out.println("水仙花个数:" + daffodil());//打印调用:不需要定义直接打印的方式,相当于直接打印返回值,一般用于学习和测试,简化代码
    }
}
