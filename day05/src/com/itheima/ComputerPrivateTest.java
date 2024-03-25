package com.itheima;

public class ComputerPrivateTest {
    public static void main(String[] args) {
        //创建对象,创建了对象,才能通过对象访问类中的成员变量和成员方法
        ComputerPrivate c = new ComputerPrivate();
        //赋值对象,该赋值赋值属于set和个get类,赋值用set,调用用get.
        // 类中仅定义,未赋值,调用的话,只显示默认值
        c.setBrand("华为");
        c.setType("MateBook D 14 SE版");
        c.setSize(14);
        c.setCpu("11代酷睿i5");
        c.setMemory(8);
        c.setColor("银色");
        c.setPrice(3599.0);
        c.setWeight(2.15);//kg
        //打印属性
        c.show();
        //测试方法
        c.playGame();
        c.qiaoDaiMa();

        System.out.println("-------");

        //代参测试Apple
        ComputerPrivate c2 = new ComputerPrivate(
                "apple",//brand的值
                "M3pro 2023",
                16,
                "M3pro",
                16,
                "白色",
                16999,
                1.05
        );
//        System.out.println(brand);//main还未调用定义brand报错
        //但是c.getBrand可以访问,c.brand
        // (public类定义方式才行,不能在private方式使用,
        // private调用用的get.brand而不是c.brand)
        // 和brand(main函数定义才行)都不能用
        System.out.println(c.getBrand());
        String brand = c2.getBrand();//调用定义后
        System.out.println(brand);//可打印,结果apple
        c2.show();//显示apple

        System.out.println("--------");

        c.show();//显示华为
    }

}
