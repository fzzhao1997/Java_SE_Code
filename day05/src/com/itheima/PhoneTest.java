package com.itheima;
/*
* 手机测试类
* */
public class PhoneTest {
    public static void main(String[] args) {
        //创建对象
        Phone p1 = new Phone();
        p1.brand = "小米";
        p1.price = 3999;//隐士转换,int转double
        p1.color = "白色";
        p1.show();
        p1.call("周杰伦");
        p1.sendMessage();
        System.out.println("---------");
        //创建对象
        Phone p2 = new Phone();
        p2.brand = "华为";
        p2.price = 11999;//隐士转换,int转double
        p2.color = "黑色";
        p2.show();
        p2.call("蔡依林");
        p2.sendMessage();
    }
}
