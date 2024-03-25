package com.itheima;

/*
 *       案例:for循环案例4()
 *           水仙花数是一个三位数,数字每个位置的立方和等于数字本身
 * */
public class Demo04 {
    public static void main(String[] args) {
        //通过for循环获取100到999之间所有的整数
        for (int i = 100; i <= 999; i++) {

            //数值拆分
            int ge = i % 10;
            int shi = i / 10 % 10;
            int bai = i / 100 % 10;

            //判断水仙花数
            if ((ge * ge * ge + shi * shi * shi + bai * bai * bai) == i) {

                //是水仙花,并打印
                System.out.println(i);
                //满足条件才打印,所以输出语句要写在if内
            }
        }
    }
}
