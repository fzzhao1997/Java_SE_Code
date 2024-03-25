package com.itheima;

/*
 * continue:用在循环体中,基于条件控制,跳过某次循环体内容的执行,继续下一次的执行(跳过,跳过本次循环,继续下一次循环)
 * break:用在循环体中,基于条件控制,终止循环体内容的执行,也就是说结束当前的整改循环(结束,结束整个循环,或者结束switch语句)
 * */
public class ControlDemo {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            if (i % 2 == 0) {
//                continue;//输出1,3,5
//                break;//输出1
            }
            System.out.println(i);
        }

    }
}
