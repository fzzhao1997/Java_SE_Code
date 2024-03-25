package com.itheima;
/*
    案例(需求):
        定义变量,进行手机信息描述,打印结果
 */
public class Demo02 {
    public static void main(String[] args) {
        String brand = "华为";
        String type = "Mate 40";
        int memory = 256;//单位
        String color = "亮黑色";
        double price = 3098.0;//定义变量
        //双11做活动
        price = 1999.0;//修改变量
        //打印结果
        System.out.println("品牌:"+brand);//操作变量(打印)
        System.out.println("类型:"+type);
        System.out.println("内存:"+memory);
        System.out.println("颜色:"+color);
        System.out.println("价格:"+price);
    }
}
