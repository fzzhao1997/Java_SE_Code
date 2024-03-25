package com.itheima;

public class Demo03 {
    //求和方法
    public static int getSum(int a, int b) {
        return a + b;
    }

    //比较相等
    public static boolean isSame(int a, int b) {
        if (a == b) {
            return true;
        }else{return false;}//一定要返回,不能不满足就不返回
    }

    //较大值
    public  static int getMax(int a,int b){
        if(a >= b){
            return a;
        }else{
            return b;
        }
    }
}
