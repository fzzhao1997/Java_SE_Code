package com.itheima;
/*
* 知道循环次数此时->for,如打印1到5,求1到100的和
* 不知道循环次数->while,如珠峰折纸->使用while循环主要分析循环继续的条件!!!
* 不常用,能识别即可->do...while
* */
public class Test03 {
    public static void main(String[] args) {
        //for的变量i,在循环体上定义,作用域仅限于循环内
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }
//        System.out.println(i);

        //while的变量j,在循环体外定义(在main方法中)
        int j = 1;
        while (j <= 5){
            System.out.println(j);
            j ++;
        }
        System.out.println(j);

        //继续使用i(for语句结束,i的存储空间已释放)
        int i = 1;
        while (i <= 5){
            System.out.println(i);
            i ++;
        }
        System.out.println(i);
    }
}
