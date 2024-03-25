package com.itheima;
/*
* 标准的JavaBean
*       1.成员变量:必须私有,不能赋值
*       2.构造方法:提供两种
*       3.成员方法:针对私有成员变量提供get和set方法,根据题目提供其他成员方法
* */
public class Movie {
    //1.成员变量
    private String name;//电影名称
    private String type;//电影类型
    private String director;//导演

    //2.构造方法->alt+insert->constructor->1.选择空参2.选择带参(全选)

    public Movie(String name, String type, String director) {
        this.name = name;
        this.type = type;
        this.director = director;
    }

    public Movie() {
    }

    //3.成员方法->alt+insert->Getter&Setter(全选)

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }
}
