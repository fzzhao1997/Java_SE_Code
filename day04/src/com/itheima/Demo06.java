package com.itheima;

//输出所有五位数的回文数]
//回文数:一个数,无论从左到右读,还是从右到左读,读起来都相同的数,叫做"回文数"
public class Demo06 {
    public static void main(String[] args) {
        //定义计数器
        int count = 0;

        //通过for循环获取10000到99999之间所有的五位数
        for (int i = 10000; i < 100000; i++) {

            //数值拆分:

            //获取个位数
            int ge = i % 10;

            //获取十位数
            int shi = i / 10 % 10;

            //获取千位数
            int qian = i / 1000 % 10;

            //获取万位数
            int wan = i / 10000 % 10;

            //判断五位数是否是回文数,个位等于万位且十位等于千位
            if (ge == wan && shi == qian) {

                //符合回文数,打印
                System.out.println(i);

                //符合回文数,计数
                count++;
            }
        }

        //打印回文数总数
        System.out.println(count);
    }
}
