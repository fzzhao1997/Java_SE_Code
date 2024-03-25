package com.itheima;
/*
*   电脑类
*       品牌brand
*       型号type
*       尺寸size
*       CPU cpu
*       内存memory
*       颜色color
*       价格price
*       重量weight
* */
public class Computer {
    //成员变量
    String brand;
    String type;
    double size;
    String cpu;
    int memory;
    String color;
    double price;
    double weight;

    //成员方法
    public void playGame(){
        System.out.println("打游戏...");
    }
    public void qiaoDaiMa(){
        System.out.println("敲代码...");
    }

    //成员方法->show
    public void show(){
        System.out.println("品牌"+brand);
        System.out.println("型号"+type);
        System.out.println("尺寸"+size);
        System.out.println("CPU"+cpu);
        System.out.println("内存"+memory);
        System.out.println("颜色"+color);
        System.out.println("价格"+price);
        System.out.println("重量"+weight);
    }
}
