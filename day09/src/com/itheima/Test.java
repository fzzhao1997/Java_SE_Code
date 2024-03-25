package com.itheima;

public class Test {
    public static void main(String[] args) {
        zi z = new zi();
        System.out.println(z.b);//20
        System.out.println(z.a);//10
        z.method();
    }
}
//爷爷类
class yeye{
    public  int number = 100;
    public void method(){
        System.out.println("爷爷类中的method方法执行了...");
    }
}
//父类
class Fu extends yeye{
    int a = 10;
    private int money = 1000000;//父类隐藏了资产,子类不能使用
}
//子类
class zi extends Fu{
    int b =20;
}