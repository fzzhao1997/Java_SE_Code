package com.itheima;

public class Car {
    /*
    * 汽车类
    * private是一个权限修饰符,可以修饰成员
    * 被private修饰的成员,只能在本类中进行访问(外界不能直接使用)
    * 针对被private修饰的成员变量,提供对应的get和set方法
    */
    //成员变量:私有
    private String brand;
    private String color;
    private double price;
    //提供对应get和set方法(成员方法)
    public String getBrand(){
        return brand;
    }
    public void setBrand(String brand){
        //this:代表本类对象,可以调用本类的成员
        //作用:解决局部变量和成员变量重名问题(见名知意导致)
        this.brand = brand;
    }
    public double getPrice(){
        return price;
    }
    public void setPrice(double price){
        this.price = price;
    }
    public String getColor(){
        return color;
    }
    public void setColor(String c){
        color = c;
    }
    //成员方法
    public void Drive(){
        System.out.println("汽车在行驶...");
    }
}
