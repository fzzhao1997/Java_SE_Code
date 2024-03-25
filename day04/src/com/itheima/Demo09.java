package com.itheima;
/*案例:while循环案例2(珠峰折纸)
      已知珠峰高度8848.86,纸张厚度0.1毫米
      请问纸张对折几次,能达到或超过珠峰高度
* */
public class Demo09 {
    public static void main(String[] args) {
        //定义计数器
        int count = 0;

        //定义纸张厚度,且单位换算为米(初始语句1)
        double thickness = 0.1/1000;

        //定义珠峰高度(初始语句2)
        double zhuFeng = 8848.86;

        //判断循环条件
        while(thickness < zhuFeng){

            //控制语句:每次执行纸张厚度*2
            thickness *= 2;

            //循环语句:纸张*2后,计数器次数+1
            count ++;
        }

        //打印最终计数次数
        System.out.println("count:"+count);
    }
}
