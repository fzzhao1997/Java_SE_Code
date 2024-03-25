package com.itheima;
/*
*   学生类
*       成员位置在类中方法外
*
*   private关键字
*       是一个权限修饰符,表示私有的意思,可以修饰成员
*       被私有的成员,只能在本类中访问
*       针对被私有的成员变量,必须提供对应的getXxx和setXxx方法
* */
public class Student {
    //1.属性(成员变量):类中方法外的变量,必须私有
    private String name;
    private int age;
    //2.成员方法:针对被私有的成员变量,必须提供对应的getXxx和setXxx方法
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public void setName(String name){
        //局部变量name和成员变量name重名了!
        //由于java遵循就近原则,这里是局部变量name自己给自己赋值!
        //成员变量 = 局部变量
        //this:可以调用本类的成员
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }

    //3.行为(成员方法):不加static的方法
    public void show(){
        System.out.println("姓名:"+name);
        System.out.println("年龄:"+age);
    }
}
