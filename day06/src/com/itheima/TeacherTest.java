package com.itheima;

public class TeacherTest {
    public static void main(String[] args) {
        //带参构造创建对象,并赋值
        Teacher t1 = new Teacher(
                "张三",18
        );
        //空参构造创建对象,配合set方法完成赋值
        Teacher t2 = new Teacher();
        t2.setName("李四");
        t2.setAge(19);
        Teacher t3 = new Teacher();
        Teacher t4 = new Teacher();
        Teacher t5= new Teacher();
    }
}
