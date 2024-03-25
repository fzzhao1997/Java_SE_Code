package com.itheima;

/*
 *       相机类
 *           品牌 brand
 *           型号 type
 *           镜头 scene
 *           产地 place
 *           价格 price
 *           颜色 color
 *           评价 appraise
 * */
public class Camera {
    //1.成员变量
    private String brand;
    private String type;
    private String scene;//镜头
    private String place;
    private double price;
    private String color;
    private int appraise;//条
    //2.构造方法

    public Camera() {
    }

    public Camera(
            String brand,
            String type,
            String scene,
            String place,
            double price,
            String color,
            int appraise
    ) {
        this.brand = brand;
        this.type = type;
        this.scene = scene;
        this.place = place;
        this.price = price;
        this.color = color;
        this.appraise = appraise;
    }

    //3.成员方法

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

    public String getScene() {
        return scene;
    }

    public void setScene(String scene) {
        this.scene = scene;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAppraise() {
        return appraise;
    }

    public void setAppraise(int appraise) {
        this.appraise = appraise;
    }

    //成员方法:show
    /*
     *       相机类
     *           品牌 brand
     *           型号 type
     *           镜头 scene
     *           产地 place
     *           价格 price
     *           颜色 color
     *           评价 appraise
     * */
    public void show() {
        System.out.println("品牌:" + brand);
        System.out.println("型号:" + type);
        System.out.println("镜头:" + scene);
        System.out.println("产地:" + place);
        System.out.println("价格:" + price);
        System.out.println("颜色:" + color);
        System.out.println("评价:" + appraise);
    }
}
