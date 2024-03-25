package com.itheima;

/*
 * 案例:for循环案例7(逢7过)
 *     在整数1到100中,个位不能是7,十位不能是.并且该数不能是7的倍数
 *     打印满足条件的数据
 *     难度:一行打印5个,使用空格分开
 * */
public class Demo07 {
    public static void main(String[] args) {
        //定义计数器
        int count = 0;

        //选择循环范围:1到100
        for (int i = 1; i <= 100; i++) {

            //数值拆分
            int ge = i % 10;
            int shi = i / 10 % 10;

            //条件判断:逢7过
            if (ge != 7 && shi != 7 && (i % 7) != 0) {

                //满足条件,计数一次
                count++;

                //判断计数器是否为5的倍数,每行打印5个
                if ((count % 5) != 0) {

                    //不是5的倍数,打印 i 并打印空格,如i1,i2,i3,i4
                    System.out.print(i);
                    System.out.print(" ");
                } else {

                    //i5是5的倍数,跨行打印i,但一次仍是第一行
                    System.out.println(i);
                }
            }
        }
        System.out.println("逢7过的个数:"+count);
    }
}
