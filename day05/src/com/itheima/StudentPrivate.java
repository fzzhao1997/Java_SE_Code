package com.itheima;

public class StudentPrivate {
    //1.属性->成员变量(即成员位置)
    private String name;//私有化
    private int age;

    //2.加入构造方法

    //空参构造
    public StudentPrivate() {
    }

    //代参构造(a.如果不提供提供代参构造,系统自动提供空参构造
    //b.如果提供代参构造,系统就不会自动提供空参构造,所以应自己提供两种构造 )
    //代参与空参形成重载
    public StudentPrivate(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //3.创建对应get和set方法
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //4.行为->成员方法->带static关键字!
    public void eat(){
        System.out.println("学生开始吃饭");
    }
}
