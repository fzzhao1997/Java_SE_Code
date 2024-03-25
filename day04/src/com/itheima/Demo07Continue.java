package com.itheima;

public class Demo07Continue {
    public static void main(String[] args) {
        //定义计数器
        int count = 0;

        //选取循环范围:从1到100
        for (int i = 1; i <= 100; i++) {

            //数值拆分
            int ge = i % 10;
            int shi = i / 10 % 10;

            //判断逢七不过
            if (ge == 7 || shi == 7 || i % 7 == 0) {

                //满足直接进入下一次循环
                continue;//为真执行以下一次循环,语句不会往下执行了
            }

            //不满足,继续执行,计数器开始统计
            count++;

            //判断计数器是否5的倍数
            if (count % 5 != 0) {

                //不是5的倍数,一行打印,并每次打印完后再打印一个空格
                System.out.print(i);
                System.out.print(" ");
            } else {

                //是5的倍数,扩行打印(第一次打印为第一行)
                System.out.println(i);
            }
        }

        //打印逢七过的统计个数
        System.out.println("逢七过的个数:"+count);
    }
}
