package com.itheima.com.itheima;

public class Demo14 {
    public static void main(String[] args) {
        //减肥计划-> 每周7天每一天对应一个运动

        int week = 3;//星期3
        if (week == 1) {
            System.out.println("星期1:打篮球");
        } else if (week == 2) {
            System.out.println("星期二2:打羽毛球");
        } else if (week == 3) {
            System.out.println("星期二3:游泳");//选择结构:但凡有一个满足,砌体的条件就不会判断了
        } else if (week == 4) {
            System.out.println("星期二4:爬山");
        } else if (week == 5) {
            System.out.println("星期二5:汽车");
        } else if (week == 6) {
            System.out.println("星期二6:休息");
        } else if (week == 7) {
            System.out.println("星期二7:休息");
        } else {
            //备胎语句,当上述条件都不满足,走这里,一般这里写错误提示
            System.out.println("你选择的星期有误!");
        }

    }
}
