package com.itheima;

public class Teacher {
    private String name;
    private int age;

    //构造方法
    //格式: public 方法名(){
    //
    // }
    //
    //构造方法作用:创建对象
    //注意事项:1.方法名必须和类名一致
            //2.每new一次对象,自动执行一次(加载时机)
            //3.带参构造的本质,就是创建对象的同时,完成赋值(赋所有值)
            //4.如果我们不提供构造,系统会提供一个默认的空参构造;
            //如果我们提供带参构造,系统就不会自动提供空参构造
            //5.结论:两种构造都提供,java允许方法重载的!
    public  Teacher(){
        System.out.println("空参构造执行了");
    }
    public Teacher(String name,int age){
        this.name = name;
        this.age = age;
    }
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
}
