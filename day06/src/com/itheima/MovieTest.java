package com.itheima;
/*
*   电影测试类
* */
public class MovieTest {
    public static void main(String[] args) {
        //空参构造+set
        //赋值
        Movie m1 = new Movie();
        m1.setName("战狼");
        m1.setType("战争");
        m1.setDirector("吴京");
        //取值
        System.out.println(m1.getName());
        System.out.println(m1.getType());
        System.out.println(m1.getDirector());
        //带参构造+直接赋值
        Movie m2 = new Movie("阿凡达","科幻","詹姆斯卡梅隆");
        System.out.println(m2.getName());
        System.out.println(m2.getType());
        System.out.println(m2.getDirector());
    }
}
