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
public class ComputerPrivate {
    //成员变量
    private String brand;
    private String type;
    private double size;
    private String cpu;
    private int memory;
    private String color;
    private double price;
    private double weight;

    //加入构造方法
    //空参
    public ComputerPrivate() {
    }
    //代参
    public ComputerPrivate(
            String brand,
            String type,
            double size,
            String cpu,
            int memory,
            String color,
            double price,
            double weight) {
        this.brand = brand;
        this.type = type;
        this.size = size;
        this.cpu = cpu;
        this.memory = memory;
        this.color = color;
        this.price = price;
        this.weight = weight;
    }


    //构建set与get


    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

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
