package com.itheima;
/*
*   手机类
*       品牌
*       价格
*       颜色
* */
public class Phone {
    //成员变量
    String brand;
    double price;
    String color;

    //成员方法
    public void call(String name) {
        System.out.println("给" + name + "打电话");
    }
        public void sendMessage(){
        System.out.println("发短信...");
            System.out.println(brand+1);
    }
    //成员方法->展示对象属性
    public void show(){
        System.out.println("品牌:"+brand);
        System.out.println("价格:"+price);
        System.out.println("颜色:"+color);
    }
}
