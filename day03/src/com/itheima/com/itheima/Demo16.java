package com.itheima.com.itheima;
//手机以旧换新
public class Demo16 {
    public static void main(String[] args) {
        //1.计算以旧换新的价格
        double a = 7988 * 0.8;

        //2.计算不使用以旧换新的价格
        int b = 7988 -1500;

        //3.使用if语句判断
        if(a<b){

            //打印结果
            System.out.println("以旧换新");
        }else{
            System.out.println("不使用以旧换新");
        }
    }
}
